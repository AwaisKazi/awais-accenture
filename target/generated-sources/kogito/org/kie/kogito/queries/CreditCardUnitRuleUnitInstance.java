package org.kie.kogito.queries;

public class CreditCardUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.CreditCardUnit> {

    public CreditCardUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.CreditCardUnit> unit, org.kie.kogito.queries.CreditCardUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.CreditCardUnit value) {
        if (value.getCreditApplications() == null) {
            value.setCreditApplications(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getCreditApplications().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("creditApplications")));
        runtime.setGlobal("creditApplications", value.getCreditApplications());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (CreditCardUnitQueryFindCreditApproved.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new CreditCardUnitQueryFindCreditApproved(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
