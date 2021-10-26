package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".CreditCardUnit";
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
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditRule__13(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditRule__14(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditRule__15(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditRule__16(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditRule__17());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindCardApproved = query_FindCardApproved();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindCardApproved() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        org.drools.model.Query FindCardApproved_build = queryDef_FindCardApproved.build(D.pattern(var_$l,
                                                                                                  D.entryPoint("creditCardApplications")).expr("GENERATED_E6C1651E63AC180951B6FD55238480EA",
                                                                                                                                               org.kie.kogito.queries.P88.LambdaPredicate88B3A3982F5D5DA834C69058BEA50C6B.INSTANCE,
                                                                                                                                               D.reactOn("approved")));
        return FindCardApproved_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindCardApproved);
    }
}
