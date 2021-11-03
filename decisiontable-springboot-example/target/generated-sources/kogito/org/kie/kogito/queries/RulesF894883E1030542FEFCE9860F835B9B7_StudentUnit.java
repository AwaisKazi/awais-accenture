package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.StudentApplication;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_StudentUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".StudentUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@72ce7842
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_StudentUnitRuleMethods0.rule_StudentRule__13(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_StudentUnitRuleMethods0.rule_StudentRule__14(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_StudentUnitRuleMethods0.rule_StudentRule__15(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_StudentUnitRuleMethods0.rule_StudentRule__16(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_StudentUnitRuleMethods0.rule_StudentRule__17());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindStudentApproved = query_FindStudentApproved();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindStudentApproved() {
        final org.drools.model.Variable<org.kie.kogito.queries.StudentApplication> var_$l = D.declarationOf(org.kie.kogito.queries.StudentApplication.class,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                                            "$l",
                                                                                                            D.entryPoint("studentApplications"));
        org.drools.model.Query FindStudentApproved_build = queryDef_FindStudentApproved.build(D.pattern(var_$l,
                                                                                                        D.entryPoint("studentApplications")).expr("GENERATED_3A4E6327DFC7C4AE8F97654C4F88275C",
                                                                                                                                                  org.kie.kogito.queries.P53.LambdaPredicate53F8142CE6636509D6C96B9AFE02FF6E.INSTANCE,
                                                                                                                                                  D.reactOn("approved")));
        return FindStudentApproved_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindStudentApproved);
    }
}
