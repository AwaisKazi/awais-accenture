package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0 {

    /**
     * Rule name: LoanRule_13
     */
    public static org.drools.model.Rule rule_LoanRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_13").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P3E.LambdaPredicate3EFE12F4FDA3E92A2AA9F7FE291D03CB.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0D.LambdaExtractor0DFBEE425BA40F22E23C5E5D3106C445.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.P57.LambdaPredicate573ED9F8003562AB827941BA113E5D51.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P15.LambdaExtractor15D46B55826A46DA924D41B47F6FC5F5.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_C756ECFAB3372DF62FB33D616A3015EB",
                                                                                                                                                org.kie.kogito.queries.P4F.LambdaPredicate4F642158A85669CF614889CCEC0FDC57.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.PE9.LambdaExtractorE936DC7EFAB4BCCDB9D857E54E6CAD16.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P4B.LambdaConsequence4B06DDACD1E17E521815C767487CE3A7.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_14
     */
    public static org.drools.model.Rule rule_LoanRule__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_14").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P3E.LambdaPredicate3EFE12F4FDA3E92A2AA9F7FE291D03CB.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0D.LambdaExtractor0DFBEE425BA40F22E23C5E5D3106C445.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.P57.LambdaPredicate573ED9F8003562AB827941BA113E5D51.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P15.LambdaExtractor15D46B55826A46DA924D41B47F6FC5F5.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_BAB857FAD4CC698CC458B0F7A92C9D06",
                                                                                                                                                org.kie.kogito.queries.P68.LambdaPredicate688D4979691DB221363D33BFEEA8CEB3.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.PE9.LambdaExtractorE936DC7EFAB4BCCDB9D857E54E6CAD16.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P4B.LambdaConsequence4B06DDACD1E17E521815C767487CE3A7.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_15
     */
    public static org.drools.model.Rule rule_LoanRule__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_15").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P3E.LambdaPredicate3EFE12F4FDA3E92A2AA9F7FE291D03CB.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0D.LambdaExtractor0DFBEE425BA40F22E23C5E5D3106C445.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.PBC.LambdaPredicateBC35CD6D01DED06EAC1421BEC933B579.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P15.LambdaExtractor15D46B55826A46DA924D41B47F6FC5F5.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_707D479969E8B848EF9C3113B0EF99EB",
                                                                                                                                                var_maxAmount,
                                                                                                                                                org.kie.kogito.queries.P33.LambdaPredicate339EEDB4B50AA9CD5BAF33F801D1C31E.INSTANCE,
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P4B.LambdaConsequence4B06DDACD1E17E521815C767487CE3A7.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_16
     */
    public static org.drools.model.Rule rule_LoanRule__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_16").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P3E.LambdaPredicate3EFE12F4FDA3E92A2AA9F7FE291D03CB.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0D.LambdaExtractor0DFBEE425BA40F22E23C5E5D3106C445.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.PBC.LambdaPredicateBC35CD6D01DED06EAC1421BEC933B579.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P15.LambdaExtractor15D46B55826A46DA924D41B47F6FC5F5.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_9749F5AE083B9EE7BEB30A1033439430",
                                                                                                                                                var_maxAmount,
                                                                                                                                                org.kie.kogito.queries.PB7.LambdaPredicateB76A6362852B80EC0E08E56C96A667ED.INSTANCE,
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P4B.LambdaConsequence4B06DDACD1E17E521815C767487CE3A7.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_17
     */
    public static org.drools.model.Rule rule_LoanRule__17() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_17").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_C570E3A565BEB9D33B4F22270CB9FB39",
                                                                                        org.kie.kogito.queries.PCF.LambdaPredicateCF46244E28E266F21ED85DB861675A48.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0D.LambdaExtractor0DFBEE425BA40F22E23C5E5D3106C445.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P4B.LambdaConsequence4B06DDACD1E17E521815C767487CE3A7.INSTANCE));
        return rule;
    }
}
