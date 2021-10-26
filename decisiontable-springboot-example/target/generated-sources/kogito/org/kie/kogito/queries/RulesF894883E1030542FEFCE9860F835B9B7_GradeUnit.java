package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_GradeUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".GradeUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@6a118ec6
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_GradeUnitRuleMethods0.rule_GradeRule__13(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_GradeUnitRuleMethods0.rule_GradeRule__14());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_DidStudentPass = query_DidStudentPass();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_DidStudentPass() {
        final org.drools.model.Variable<org.kie.kogito.queries.SchoolGrades> var_$l = D.declarationOf(org.kie.kogito.queries.SchoolGrades.class,
                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE,
                                                                                                      "$l",
                                                                                                      D.entryPoint("schoolGrades"));
        org.drools.model.Query DidStudentPass_build = queryDef_DidStudentPass.build(D.pattern(var_$l,
                                                                                              D.entryPoint("schoolGrades")).expr("GENERATED_C31B704A713066FAD9B51DE827A157DC",
                                                                                                                                 org.kie.kogito.queries.P05.LambdaPredicate052E1B22CC884A0856AE262A716C45C3.INSTANCE,
                                                                                                                                 D.reactOn("passed")));
        return DidStudentPass_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_DidStudentPass);
    }
}
