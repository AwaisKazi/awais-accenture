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
                                                                                                               D.entryPoint("creditApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_13").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                              org.kie.kogito.queries.P83.LambdaPredicate83D9F5B5019AEE57B0ABEE3B1232D85B.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               -1,
                                                                                                               org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                               20),
                                                                                              D.reactOn("applicant")).expr("GENERATED_4BB1CFBF96E6308B9A40715A3757E4EC",
                                                                                                                           org.kie.kogito.queries.PBA.LambdaPredicateBAEA09CDC41D6FBE897B50206E662627.INSTANCE,
                                                                                                                           D.alphaIndexedBy(int.class,
                                                                                                                                            org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                            org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                            700),
                                                                                                                           D.reactOn("creditScore")).expr("GENERATED_38C47347DE9404DCD40DB4001504F9E6",
                                                                                                                                                          org.kie.kogito.queries.PC5.LambdaPredicateC5F17D57330D4EAF467D7295D9C06DCE.INSTANCE,
                                                                                                                                                          D.alphaIndexedBy(int.class,
                                                                                                                                                                           org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditLimit"),
                                                                                                                                                                           org.kie.kogito.queries.PEE.LambdaExtractorEED14086192D170128A6596398A8C810.INSTANCE,
                                                                                                                                                                           2000),
                                                                                                                                                          D.reactOn("creditLimit")),
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
                                                                                                               D.entryPoint("creditApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_14").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                              org.kie.kogito.queries.P83.LambdaPredicate83D9F5B5019AEE57B0ABEE3B1232D85B.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               -1,
                                                                                                               org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                               20),
                                                                                              D.reactOn("applicant")).expr("GENERATED_691F04EAEF37AA8090EEEFBA540DAE3C",
                                                                                                                           org.kie.kogito.queries.PC9.LambdaPredicateC9C1EFC029658031E3F4612B9D53CD0A.INSTANCE,
                                                                                                                           D.alphaIndexedBy(int.class,
                                                                                                                                            org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                            org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                            650),
                                                                                                                           D.reactOn("creditScore")).expr("GENERATED_C30087E578A4DA3613A1AA5546E3F77B",
                                                                                                                                                          org.kie.kogito.queries.PAB.LambdaPredicateAB54DAA1A8BC779867A6515E04940829.INSTANCE,
                                                                                                                                                          D.alphaIndexedBy(int.class,
                                                                                                                                                                           org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditLimit"),
                                                                                                                                                                           org.kie.kogito.queries.PEE.LambdaExtractorEED14086192D170128A6596398A8C810.INSTANCE,
                                                                                                                                                                           2000),
                                                                                                                                                          D.reactOn("creditLimit")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_15
     */
    public static org.drools.model.Rule rule_CreditCardRule__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_15").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                              org.kie.kogito.queries.P83.LambdaPredicate83D9F5B5019AEE57B0ABEE3B1232D85B.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               -1,
                                                                                                               org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                               20),
                                                                                              D.reactOn("applicant")).expr("GENERATED_91FF81F77C5C28CC967B978B7A7254E4",
                                                                                                                           org.kie.kogito.queries.P82.LambdaPredicate82FB4A77F9B3E7F9C723AC90E51D56B2.INSTANCE,
                                                                                                                           D.alphaIndexedBy(int.class,
                                                                                                                                            org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                            org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                            680),
                                                                                                                           D.reactOn("creditScore")).expr("GENERATED_F69900EDEB55A35D64A29C87BF22AFAE",
                                                                                                                                                          org.kie.kogito.queries.P49.LambdaPredicate495AD464ADF3197BF9E8BB9FCDCD3A94.INSTANCE,
                                                                                                                                                          D.alphaIndexedBy(int.class,
                                                                                                                                                                           org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditLimit"),
                                                                                                                                                                           org.kie.kogito.queries.PEE.LambdaExtractorEED14086192D170128A6596398A8C810.INSTANCE,
                                                                                                                                                                           5000),
                                                                                                                                                          D.reactOn("creditLimit")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P15.LambdaConsequence15CE464CC2B1D400E4887AE4E3F97B98.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CreditCardRule_16
     */
    public static org.drools.model.Rule rule_CreditCardRule__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.CreditCardApplication> var_$l = D.declarationOf(org.kie.kogito.queries.CreditCardApplication.class,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                                               "$l",
                                                                                                               D.entryPoint("creditApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_16").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_1194BAD07B7889752A101628B364EF96",
                                                                                              org.kie.kogito.queries.P83.LambdaPredicate83D9F5B5019AEE57B0ABEE3B1232D85B.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                               -1,
                                                                                                               org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                               20),
                                                                                              D.reactOn("applicant")).expr("GENERATED_96E09241C21012F939E63F24A966423D",
                                                                                                                           org.kie.kogito.queries.P52.LambdaPredicate521DD5EA812CD871B0E6FE1E41422FE0.INSTANCE,
                                                                                                                           D.alphaIndexedBy(int.class,
                                                                                                                                            org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                            org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                            740),
                                                                                                                           D.reactOn("creditScore")).expr("GENERATED_FF418F8A8A6B1EB1109C7C191BC129B0",
                                                                                                                                                          org.kie.kogito.queries.P45.LambdaPredicate45AE33847CB06FC2D198CA6586042567.INSTANCE,
                                                                                                                                                          D.alphaIndexedBy(int.class,
                                                                                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditLimit"),
                                                                                                                                                                           org.kie.kogito.queries.PEE.LambdaExtractorEED14086192D170128A6596398A8C810.INSTANCE,
                                                                                                                                                                           5000),
                                                                                                                                                          D.reactOn("creditLimit")),
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
                                                                                                               D.entryPoint("creditApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "CreditCardRule_17").unit(org.kie.kogito.queries.CreditCardUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_B3D232CB14F244BBC19A319189F8F5A3",
                                                                                              org.kie.kogito.queries.P8E.LambdaPredicate8EDB9618CD286C30A62620EECCD7FC7E.INSTANCE,
                                                                                              D.alphaIndexedBy(int.class,
                                                                                                               org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                               -1,
                                                                                                               org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                               18),
                                                                                              D.reactOn("applicant")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
        return rule;
    }
}
