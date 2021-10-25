package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
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
                                                                                              org.kie.kogito.queries.PAC.LambdaPredicateACCF2600DFAA4B788A6F4D6400D5FED3.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.PF7.LambdaExtractorF72490D623356674AB7C80BCF60356C3.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("age")).expr("GENERATED_3837E5CCAA682597662095FC76BEDD3C",
                                                                                                                     org.kie.kogito.queries.P23.LambdaPredicate2384E6B09CBB952B596BD2152F6D4A51.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.P6E.LambdaExtractor6EB202843AD0C40B3BDBD2BB103BDD7E.INSTANCE,
                                                                                                                                      750),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P4A.LambdaConsequence4ABE41F9C3CEB2FA9D89AD49B506FF1C.INSTANCE));
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
                                                                                              org.kie.kogito.queries.P72.LambdaPredicate72EAAE25ECCCB898C9CEAC4EFAA7CB62.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.PF7.LambdaExtractorF72490D623356674AB7C80BCF60356C3.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("age")).expr("GENERATED_FF5C9EFC836555380C920C447CBD5CC2",
                                                                                                                     org.kie.kogito.queries.PF8.LambdaPredicateF884294870D0611DE787A0D8A608B3F0.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.P6E.LambdaExtractor6EB202843AD0C40B3BDBD2BB103BDD7E.INSTANCE,
                                                                                                                                      700),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P4A.LambdaConsequence4ABE41F9C3CEB2FA9D89AD49B506FF1C.INSTANCE));
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
                                                                                              org.kie.kogito.queries.P72.LambdaPredicate72EAAE25ECCCB898C9CEAC4EFAA7CB62.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.PF7.LambdaExtractorF72490D623356674AB7C80BCF60356C3.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("age")).expr("GENERATED_3397490C8543BA786DC1A37A1338D891",
                                                                                                                     org.kie.kogito.queries.P9E.LambdaPredicate9E695B272A62211930768ED837777BF6.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.P6E.LambdaExtractor6EB202843AD0C40B3BDBD2BB103BDD7E.INSTANCE,
                                                                                                                                      700),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P40.LambdaConsequence40B88178895E80256BD4187443D0608B.INSTANCE));
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
                                                                                              org.kie.kogito.queries.PC9.LambdaPredicateC964A400FE9CBC9033295C53F43C44EC.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.PF7.LambdaExtractorF72490D623356674AB7C80BCF60356C3.INSTANCE,
                                                                                                               25),
                                                                                              D.reactOn("age")).expr("GENERATED_76AE061063BFAAFBB5C1144CD4EA4F5C",
                                                                                                                     org.kie.kogito.queries.PBB.LambdaPredicateBB0C659AADE388FD5EED45451B6C3CD7.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.P6E.LambdaExtractor6EB202843AD0C40B3BDBD2BB103BDD7E.INSTANCE,
                                                                                                                                      600),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P4A.LambdaConsequence4ABE41F9C3CEB2FA9D89AD49B506FF1C.INSTANCE));
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
                                                                                              org.kie.kogito.queries.PC9.LambdaPredicateC964A400FE9CBC9033295C53F43C44EC.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.PF7.LambdaExtractorF72490D623356674AB7C80BCF60356C3.INSTANCE,
                                                                                                               25),
                                                                                              D.reactOn("age")).expr("GENERATED_63F0BCFBBBD16FEA7A49481E1584BA75",
                                                                                                                     org.kie.kogito.queries.PAF.LambdaPredicateAFDF78A7E9A38028CF87DFD1366B2B96.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.P6E.LambdaExtractor6EB202843AD0C40B3BDBD2BB103BDD7E.INSTANCE,
                                                                                                                                      600),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P40.LambdaConsequence40B88178895E80256BD4187443D0608B.INSTANCE));
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
                                                                                              org.kie.kogito.queries.PA2.LambdaPredicateA2B900ADB197185D7FB32FD2947F7320.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                               org.kie.kogito.queries.PF7.LambdaExtractorF72490D623356674AB7C80BCF60356C3.INSTANCE,
                                                                                                               35),
                                                                                              D.reactOn("age")).expr("GENERATED_53BB055CECFD18332B338182C21B68AE",
                                                                                                                     org.kie.kogito.queries.PB7.LambdaPredicateB7329062961CF32E7633E4EE45118557.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("score"),
                                                                                                                                      org.kie.kogito.queries.P6E.LambdaExtractor6EB202843AD0C40B3BDBD2BB103BDD7E.INSTANCE,
                                                                                                                                      550),
                                                                                                                     D.reactOn("score")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P4A.LambdaConsequence4ABE41F9C3CEB2FA9D89AD49B506FF1C.INSTANCE));
        return rule;
    }
}
