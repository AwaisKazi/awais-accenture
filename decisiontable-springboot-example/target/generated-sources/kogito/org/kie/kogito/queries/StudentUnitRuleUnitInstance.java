package org.kie.kogito.queries;

public class StudentUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.StudentUnit> {

    public StudentUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.StudentUnit> unit, org.kie.kogito.queries.StudentUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.StudentUnit value) {
        if (value.getStudentApplications() == null) {
            value.setStudentApplications(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getStudentApplications().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("studentApplications")));
        runtime.setGlobal("studentApplications", value.getStudentApplications());
        runtime.setGlobal("maxAmount", value.getMaxAmount());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (StudentUnitQueryFindStudentApproved.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new StudentUnitQueryFindStudentApproved(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
