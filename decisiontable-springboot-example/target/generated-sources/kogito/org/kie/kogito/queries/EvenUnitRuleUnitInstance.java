package org.kie.kogito.queries;

public class EvenUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.EvenUnit> {

    public EvenUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.EvenUnit> unit, org.kie.kogito.queries.EvenUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.EvenUnit value) {
        if (value.getEvenChecks() == null) {
            value.setEvenChecks(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getEvenChecks().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("evenChecks")));
        runtime.setGlobal("evenChecks", value.getEvenChecks());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (EvenUnitQueryFindEvens.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new EvenUnitQueryFindEvens(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
