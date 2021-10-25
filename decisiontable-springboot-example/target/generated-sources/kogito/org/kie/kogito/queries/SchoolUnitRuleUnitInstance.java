package org.kie.kogito.queries;

public class SchoolUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.SchoolUnit> {

    public SchoolUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.SchoolUnit> unit, org.kie.kogito.queries.SchoolUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.SchoolUnit value) {
        if (value.getSchoolScores() == null) {
            value.setSchoolScores(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getSchoolScores().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("schoolScores")));
        runtime.setGlobal("schoolScores", value.getSchoolScores());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (SchoolUnitQueryFindPassing.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new SchoolUnitQueryFindPassing(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
