package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0 {

    /**
     * Rule name: CreditCardRule_13
     */
    public static org.drools.model.Rule rule_CreditCardRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_13").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_EC443F5492D53FA27FD693F4B9963668",
                                                                                              org.kie.kogito.queries.PC1.LambdaPredicateC1835B558068D1DF3ECF226B5A8FB2F5.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.P0C.LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("age")).expr("GENERATED_3837E5CCAA682597662095FC76BEDD3C",
                                                                                                                     org.kie.kogito.queries.P60.LambdaPredicate6009FACF580ACECE73F87CAE65DE73D7.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.PCA.LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36.INSTANCE,
                                                                                                                                      750),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P15.LambdaConsequence15CE464CC2B1D400E4887AE4E3F97B98.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_14
     */
    public static org.drools.model.Rule rule_CreditCardRule__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_14").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_A7C279C0563D4474C21CD98D66D38FC9",
                                                                                              org.kie.kogito.queries.PD4.LambdaPredicateD46A78BECDDAC0D7DCA34814622CA039.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.P0C.LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("age")).expr("GENERATED_FF5C9EFC836555380C920C447CBD5CC2",
                                                                                                                     org.kie.kogito.queries.P1F.LambdaPredicate1F7AF55D8C16652565C7C4D93220957D.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.PCA.LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36.INSTANCE,
                                                                                                                                      700),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P15.LambdaConsequence15CE464CC2B1D400E4887AE4E3F97B98.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_15
     */
    public static org.drools.model.Rule rule_CreditCardRule__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_15").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_A7C279C0563D4474C21CD98D66D38FC9",
                                                                                              org.kie.kogito.queries.PD4.LambdaPredicateD46A78BECDDAC0D7DCA34814622CA039.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.P0C.LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("age")).expr("GENERATED_3397490C8543BA786DC1A37A1338D891",
                                                                                                                     org.kie.kogito.queries.PF1.LambdaPredicateF1DC8AF19AA65F6733BDAC46172283AF.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.PCA.LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36.INSTANCE,
                                                                                                                                      700),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_16
     */
    public static org.drools.model.Rule rule_CreditCardRule__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_16").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_049F91F610D8B6530853BE9EEFB61F13",
                                                                                              org.kie.kogito.queries.P88.LambdaPredicate88C903A787557AA23A9141E5CF3421C3.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.P0C.LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2.INSTANCE,
                                                                                                               25),
                                                                                              D.reactOn("age")).expr("GENERATED_76AE061063BFAAFBB5C1144CD4EA4F5C",
                                                                                                                     org.kie.kogito.queries.P35.LambdaPredicate35F0EBAE493BC2CA7032172E34C875F7.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.PCA.LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36.INSTANCE,
                                                                                                                                      600),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P15.LambdaConsequence15CE464CC2B1D400E4887AE4E3F97B98.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_17
     */
    public static org.drools.model.Rule rule_CreditCardRule__17() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_17").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_049F91F610D8B6530853BE9EEFB61F13",
                                                                                              org.kie.kogito.queries.P88.LambdaPredicate88C903A787557AA23A9141E5CF3421C3.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.P0C.LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2.INSTANCE,
                                                                                                               25),
                                                                                              D.reactOn("age")).expr("GENERATED_63F0BCFBBBD16FEA7A49481E1584BA75",
                                                                                                                     org.kie.kogito.queries.P8E.LambdaPredicate8ED507253DD949544813AF94CE5842C9.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.PCA.LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36.INSTANCE,
                                                                                                                                      600),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_18
     */
    public static org.drools.model.Rule rule_CreditCardRule__18() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_18").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_4362AFF7F4DF0EB1816AEE897F3C8A0B",
                                                                                              org.kie.kogito.queries.P5E.LambdaPredicate5E0E88257A6F5A791DD2022393478E37.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.P0C.LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2.INSTANCE,
                                                                                                               35),
                                                                                              D.reactOn("age")).expr("GENERATED_53BB055CECFD18332B338182C21B68AE",
                                                                                                                     org.kie.kogito.queries.PEA.LambdaPredicateEAB7F04544B15CCF32881605456A3007.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.PCA.LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36.INSTANCE,
                                                                                                                                      550),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P15.LambdaConsequence15CE464CC2B1D400E4887AE4E3F97B98.INSTANCE));
        return rule;
    }
}
