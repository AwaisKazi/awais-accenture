package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
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
                                                                                          org.kie.kogito.queries.PBE.LambdaPredicateBE67D3791E8CAC84645F956D238565D8.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_96A920546752728AF0AA0A6E79F48A6F",
                                                                                                                       org.kie.kogito.queries.P09.LambdaPredicate09E976626CD9254E3FF8F548C8375860.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                        300),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
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
                                                                                          org.kie.kogito.queries.PBE.LambdaPredicateBE67D3791E8CAC84645F956D238565D8.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_7D73CD5723637645118A3422CAC5AAB1",
                                                                                                                       org.kie.kogito.queries.PB3.LambdaPredicateB30F21A0F11EDE39F0EE98EC6BF57381.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                        400),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
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
                                                                                          org.kie.kogito.queries.PBE.LambdaPredicateBE67D3791E8CAC84645F956D238565D8.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_CCCB09D9E4F77140768FA03DED37E82A",
                                                                                                                       org.kie.kogito.queries.P08.LambdaPredicate0807BE5D32231F9932F11485F6E83001.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                        500),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
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
                                                                                          org.kie.kogito.queries.PBE.LambdaPredicateBE67D3791E8CAC84645F956D238565D8.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_6AE18AC0AB78FF6960CF1003F25F6095",
                                                                                                                       org.kie.kogito.queries.P28.LambdaPredicate28B2257784971FB1B01AA720D9638407.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                        501),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.PA4.LambdaConsequenceA4819B0886AAEC18C0BA78613AA674AC.INSTANCE));
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
                                                                                          org.kie.kogito.queries.PBE.LambdaPredicateBE67D3791E8CAC84645F956D238565D8.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           -1,
                                                                                                           org.kie.kogito.queries.P6F.LambdaExtractor6FD195D62B749BDB0F5EA20D18B3AA86.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("applicant")).expr("GENERATED_F6FE239412628933321DB64F9B6AF0CC",
                                                                                                                       org.kie.kogito.queries.P95.LambdaPredicate95AC16E55811C339C572AD96EE808C63.INSTANCE,
                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                        org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                        DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                        org.kie.kogito.queries.P23.LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C.INSTANCE,
                                                                                                                                        700),
                                                                                                                       D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P15.LambdaConsequence15CE464CC2B1D400E4887AE4E3F97B98.INSTANCE));
        return rule;
    }
}
