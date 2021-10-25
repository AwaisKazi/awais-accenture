package org.kie.kogito.queries;

public class GradeUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.GradeUnit> {

    public GradeUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.GradeUnit> unit, org.kie.kogito.queries.GradeUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.GradeUnit value) {
        if (value.getSchoolGrades() == null) {
            value.setSchoolGrades(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getSchoolGrades().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("schoolGrades")));
        runtime.setGlobal("schoolGrades", value.getSchoolGrades());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (GradeUnitQueryDidStudentPass.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new GradeUnitQueryDidStudentPass(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
