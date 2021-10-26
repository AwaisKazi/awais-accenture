package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_CreditCardUnitRuleMethods0 {

    /**
     * Rule name: CreditRule_13
     */
    public static org.drools.model.Rule rule_CreditRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditRule_13").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                            .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                          org.kie.kogito.queries.P33.LambdaPredicate3391FDA85E83A29D84E1453F00D034D1.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.PD1.LambdaExtractorD1B96BA1B3914C647BA03E917B9682DB.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_96A920546752728AF0AA0A6E79F48A6F",
                                                                                                                       org.kie.kogito.queries.PF0.LambdaPredicateF03FAD82F4DE6BB7EC2B878B9D3B448E.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P35.LambdaExtractor35E85972055D417CB01EECAFF605A207.INSTANCE,
                                                                                                                                        300),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P3E.LambdaConsequence3EE05234F5741077EC9FBF80C0A60B45.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditRule_14
     */
    public static org.drools.model.Rule rule_CreditRule__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditRule_14").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                            .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                          org.kie.kogito.queries.P33.LambdaPredicate3391FDA85E83A29D84E1453F00D034D1.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.PD1.LambdaExtractorD1B96BA1B3914C647BA03E917B9682DB.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_7D73CD5723637645118A3422CAC5AAB1",
                                                                                                                       org.kie.kogito.queries.P07.LambdaPredicate0726F8DCA1DEB7BB53748A4B1AD004CA.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P35.LambdaExtractor35E85972055D417CB01EECAFF605A207.INSTANCE,
                                                                                                                                        400),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P3E.LambdaConsequence3EE05234F5741077EC9FBF80C0A60B45.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditRule_15
     */
    public static org.drools.model.Rule rule_CreditRule__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditRule_15").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                            .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                          org.kie.kogito.queries.P33.LambdaPredicate3391FDA85E83A29D84E1453F00D034D1.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.PD1.LambdaExtractorD1B96BA1B3914C647BA03E917B9682DB.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_CCCB09D9E4F77140768FA03DED37E82A",
                                                                                                                       org.kie.kogito.queries.P5C.LambdaPredicate5C67D4D7CE0ED5B62AB5D7C0162FC574.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P35.LambdaExtractor35E85972055D417CB01EECAFF605A207.INSTANCE,
                                                                                                                                        500),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P3E.LambdaConsequence3EE05234F5741077EC9FBF80C0A60B45.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditRule_16
     */
    public static org.drools.model.Rule rule_CreditRule__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditRule_16").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                            .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                          org.kie.kogito.queries.P33.LambdaPredicate3391FDA85E83A29D84E1453F00D034D1.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.PD1.LambdaExtractorD1B96BA1B3914C647BA03E917B9682DB.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_6AE18AC0AB78FF6960CF1003F25F6095",
                                                                                                                       org.kie.kogito.queries.P9F.LambdaPredicate9FA855A395435A86897A2024349A7FA6.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P35.LambdaExtractor35E85972055D417CB01EECAFF605A207.INSTANCE,
                                                                                                                                        501),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P3E.LambdaConsequence3EE05234F5741077EC9FBF80C0A60B45.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditRule_17
     */
    public static org.drools.model.Rule rule_CreditRule__17() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditCardApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditRule_17").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                            .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                          org.kie.kogito.queries.P33.LambdaPredicate3391FDA85E83A29D84E1453F00D034D1.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.PD1.LambdaExtractorD1B96BA1B3914C647BA03E917B9682DB.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_F6FE239412628933321DB64F9B6AF0CC",
                                                                                                                       org.kie.kogito.queries.P27.LambdaPredicate275ADDF1AC2D794AFCE5D31944AA86FE.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P35.LambdaExtractor35E85972055D417CB01EECAFF605A207.INSTANCE,
                                                                                                                                        700),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P8C.LambdaConsequence8C5EFB70493CE2EE8F7A95F06571EB64.INSTANCE));
        return rule;
    }
}
