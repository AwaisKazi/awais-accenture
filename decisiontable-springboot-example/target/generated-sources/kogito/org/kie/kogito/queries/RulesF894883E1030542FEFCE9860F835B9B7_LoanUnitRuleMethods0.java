package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.StudentApplication;
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
                                                          .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                                     10)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.PA5.LambdaPredicateA53BF2AB8C27AD9A3691D41FE8A46AA5.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0C.LambdaExtractor0C05107A8B41CC7A16E46437A0014207.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.P09.LambdaPredicate095DCD764952413B2F4F7994F095B28D.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P34.LambdaExtractor349E94C19ABDBB8B54067DD2AC165418.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_1AD31B24F12D00D0BD69FE81C5F56A63",
                                                                                                                                                org.kie.kogito.queries.P81.LambdaPredicate81C5F8718D4156A6A61DE1FFA52B5A20.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P95.LambdaExtractor95E89E31BE0D5452D9E3E97DF9E83958.INSTANCE,
                                                                                                                                                                 1900),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PCD.LambdaConsequenceCD429D3BFE3046629DE7D0BC45754FC4.INSTANCE));
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
                                                          .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                                     20)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.PA5.LambdaPredicateA53BF2AB8C27AD9A3691D41FE8A46AA5.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0C.LambdaExtractor0C05107A8B41CC7A16E46437A0014207.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.P09.LambdaPredicate095DCD764952413B2F4F7994F095B28D.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P34.LambdaExtractor349E94C19ABDBB8B54067DD2AC165418.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_BAB857FAD4CC698CC458B0F7A92C9D06",
                                                                                                                                                org.kie.kogito.queries.P2D.LambdaPredicate2DD91D8582517322242601D2B07C182E.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P95.LambdaExtractor95E89E31BE0D5452D9E3E97DF9E83958.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PCD.LambdaConsequenceCD95E84CBF2228540A3DDCC628B6BC31.INSTANCE));
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
                                                          .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                                     30)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.PA5.LambdaPredicateA53BF2AB8C27AD9A3691D41FE8A46AA5.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0C.LambdaExtractor0C05107A8B41CC7A16E46437A0014207.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.P15.LambdaPredicate15D88A783ADC1A71404753D3292FB049.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P34.LambdaExtractor349E94C19ABDBB8B54067DD2AC165418.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_707D479969E8B848EF9C3113B0EF99EB",
                                                                                                                                                var_maxAmount,
                                                                                                                                                org.kie.kogito.queries.P38.LambdaPredicate38F4441B8C378189726D23AD8392B964.INSTANCE,
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PCD.LambdaConsequenceCD429D3BFE3046629DE7D0BC45754FC4.INSTANCE));
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
                                                          .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                                     40)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.PA5.LambdaPredicateA53BF2AB8C27AD9A3691D41FE8A46AA5.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0C.LambdaExtractor0C05107A8B41CC7A16E46437A0014207.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.P15.LambdaPredicate15D88A783ADC1A71404753D3292FB049.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P34.LambdaExtractor349E94C19ABDBB8B54067DD2AC165418.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_9749F5AE083B9EE7BEB30A1033439430",
                                                                                                                                                var_maxAmount,
                                                                                                                                                org.kie.kogito.queries.P1A.LambdaPredicate1AD70F1259E8B50061D0677388929BC6.INSTANCE,
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PCD.LambdaConsequenceCD95E84CBF2228540A3DDCC628B6BC31.INSTANCE));
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
                                                          .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                                     50)
                                                          .build(D.pattern(var_$l).expr("GENERATED_C570E3A565BEB9D33B4F22270CB9FB39",
                                                                                        org.kie.kogito.queries.PEA.LambdaPredicateEAE7B36AAC8AF6896D0444EE9CD25278.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0C.LambdaExtractor0C05107A8B41CC7A16E46437A0014207.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PCD.LambdaConsequenceCD95E84CBF2228540A3DDCC628B6BC31.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_18
     */
    public static org.drools.model.Rule rule_LoanRule__18() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_18").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .attribute(org.drools.model.Rule.Attribute.SALIENCE,
                                                                     5)
                                                          .build(D.pattern(var_$l).expr("GENERATED_F5CBE8D0B2DB6CF78C92F2F4802E92EB",
                                                                                        org.kie.kogito.queries.P49.LambdaPredicate49608F4F0F089A1B4D6647D31356F53B.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P0C.LambdaExtractor0C05107A8B41CC7A16E46437A0014207.INSTANCE,
                                                                                                         100),
                                                                                        D.reactOn("applicant")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PCD.LambdaConsequenceCD429D3BFE3046629DE7D0BC45754FC4.INSTANCE));
        return rule;
    }
}
