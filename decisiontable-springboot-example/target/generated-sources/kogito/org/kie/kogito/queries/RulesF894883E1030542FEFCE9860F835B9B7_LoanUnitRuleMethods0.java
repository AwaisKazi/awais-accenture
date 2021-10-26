package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
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
                                                                                        org.kie.kogito.queries.P0B.LambdaPredicate0B648D25A9C50CB3844E98556BB4F3D7.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.PA3.LambdaExtractorA3E83B81688CE035B01A565D58507472.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.PF8.LambdaPredicateF8A0ED3135F3675D26CC86585D6B6691.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P21.LambdaExtractor2161DE6FA0AF74CF5DCAD28D132A07C9.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_C756ECFAB3372DF62FB33D616A3015EB",
                                                                                                                                                org.kie.kogito.queries.P5A.LambdaPredicate5ADBC4DFBA88D3FFEDD65D1D15F6132A.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P7A.LambdaExtractor7A7E2A044AE46C70951C8C0DF2A5BE18.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P34.LambdaConsequence34C8A44065F37D23B2A00913331B9EB2.INSTANCE));
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
                                                                                        org.kie.kogito.queries.P0B.LambdaPredicate0B648D25A9C50CB3844E98556BB4F3D7.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.PA3.LambdaExtractorA3E83B81688CE035B01A565D58507472.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.PF8.LambdaPredicateF8A0ED3135F3675D26CC86585D6B6691.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P21.LambdaExtractor2161DE6FA0AF74CF5DCAD28D132A07C9.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_BAB857FAD4CC698CC458B0F7A92C9D06",
                                                                                                                                                org.kie.kogito.queries.PD2.LambdaPredicateD27DB63F48D77B7027EB3BA6F3D37A57.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P7A.LambdaExtractor7A7E2A044AE46C70951C8C0DF2A5BE18.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PA5.LambdaConsequenceA5B752B82B0746BE34E6984DFDE2D45B.INSTANCE));
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
                                                                                        org.kie.kogito.queries.P0B.LambdaPredicate0B648D25A9C50CB3844E98556BB4F3D7.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.PA3.LambdaExtractorA3E83B81688CE035B01A565D58507472.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.PC7.LambdaPredicateC780A1BF25A7BC413872CC02B021C717.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P21.LambdaExtractor2161DE6FA0AF74CF5DCAD28D132A07C9.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_0EBEFC5049CD05C2E9D31788F5F82111",
                                                                                                                                                org.kie.kogito.queries.P96.LambdaPredicate9641493CA134C2CC4F3B2BDA5C241697.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P7A.LambdaExtractor7A7E2A044AE46C70951C8C0DF2A5BE18.INSTANCE,
                                                                                                                                                                 5000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P34.LambdaConsequence34C8A44065F37D23B2A00913331B9EB2.INSTANCE));
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
                                                                                        org.kie.kogito.queries.P0B.LambdaPredicate0B648D25A9C50CB3844E98556BB4F3D7.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.PA3.LambdaExtractorA3E83B81688CE035B01A565D58507472.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.PC7.LambdaPredicateC780A1BF25A7BC413872CC02B021C717.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P21.LambdaExtractor2161DE6FA0AF74CF5DCAD28D132A07C9.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_251393CB2ADBEE4B495F731CD918CA30",
                                                                                                                                                org.kie.kogito.queries.P61.LambdaPredicate61FAAA387A8F860A7BEB1F10A8621F6B.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P7A.LambdaExtractor7A7E2A044AE46C70951C8C0DF2A5BE18.INSTANCE,
                                                                                                                                                                 5000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PA5.LambdaConsequenceA5B752B82B0746BE34E6984DFDE2D45B.INSTANCE));
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
                                                                                        org.kie.kogito.queries.PE2.LambdaPredicateE2D96BA61C733B42051B0ACDEB505F2B.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.PA3.LambdaExtractorA3E83B81688CE035B01A565D58507472.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_E2F767EA5ECB0C9AAE0657BB8F5415C0",
                                                                                                                     org.kie.kogito.queries.P46.LambdaPredicate463CFCD3233B3BF640A00C4BB4F7DA32.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P21.LambdaExtractor2161DE6FA0AF74CF5DCAD28D132A07C9.INSTANCE,
                                                                                                                                      10000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_AC6736D5D0CCA400FF94606F4B129CB7",
                                                                                                                                                org.kie.kogito.queries.PAE.LambdaPredicateAE3C75C20A3851599695035448725B36.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P7A.LambdaExtractor7A7E2A044AE46C70951C8C0DF2A5BE18.INSTANCE,
                                                                                                                                                                 100),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P34.LambdaConsequence34C8A44065F37D23B2A00913331B9EB2.INSTANCE));
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
                                                          .build(D.pattern(var_$l).expr("GENERATED_C570E3A565BEB9D33B4F22270CB9FB39",
                                                                                        org.kie.kogito.queries.PE2.LambdaPredicateE2D96BA61C733B42051B0ACDEB505F2B.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.PA3.LambdaExtractorA3E83B81688CE035B01A565D58507472.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_AB4DB09FBBD4CC75CB8AE817B961F723",
                                                                                                                     org.kie.kogito.queries.PBA.LambdaPredicateBADF6064148ECCE61CF7677780F9009C.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P21.LambdaExtractor2161DE6FA0AF74CF5DCAD28D132A07C9.INSTANCE,
                                                                                                                                      50),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_7E93E06FD842C75FC5E02E69FEEACA76",
                                                                                                                                                org.kie.kogito.queries.P12.LambdaPredicate12ED98281340F4931166FE546F57BF19.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P7A.LambdaExtractor7A7E2A044AE46C70951C8C0DF2A5BE18.INSTANCE,
                                                                                                                                                                 1000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P34.LambdaConsequence34C8A44065F37D23B2A00913331B9EB2.INSTANCE));
        return rule;
    }
}
