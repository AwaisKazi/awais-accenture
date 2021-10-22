package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
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
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@3277c2cf
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditCardRule__13(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditCardRule__14(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditCardRule__15(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditCardRule__16(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditCardRule__17(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0.rule_CreditCardRule__18());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindCreditCardApproved = query_FindCreditCardApproved();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindCreditCardApproved() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        org.drools.model.Query FindCreditCardApproved_build = queryDef_FindCreditCardApproved.build(D.pattern(var_$l,
                                                                                                              D.entryPoint("creditCardApplications")).expr("GENERATED_D9B8FC64E2933F1E53E4385858CEBC66",
                                                                                                                                                           org.kie.kogito.queries.PA1.LambdaPredicateA146AA6B4A76ECC87720B19BE8F5A6BA.INSTANCE,
                                                                                                                                                           D.reactOn("approved")));
        return FindCreditCardApproved_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindCreditCardApproved);
    }
}
