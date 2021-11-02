package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.StudentApplication;
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
                                                            .build(D.pattern(var_$l).expr("GENERATED_EF0A3E3BEAC6BCCEC848445002A70D21",
                                                                                          org.kie.kogito.queries.P67.LambdaPredicate67AB569711CCDC5406A94DAFC3D18E72.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                           org.kie.kogito.queries.P21.LambdaExtractor2178C5F616031C3EF709F4C11A65E280.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("age")).expr("GENERATED_70D13CF3D74AF3D655FB98A1F9B702CD",
                                                                                                                 org.kie.kogito.queries.P14.LambdaPredicate14269AA0F1DD3FA04AB4B8E543E2E8A6.INSTANCE,
                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                  org.kie.kogito.queries.PCD.LambdaExtractorCD41A4C8F1D18964393DB8105D2E2E99.INSTANCE,
                                                                                                                                  300),
                                                                                                                 D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P2A.LambdaConsequence2A43BEA8EB601ECF60080E573952C998.INSTANCE));
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
                                                            .build(D.pattern(var_$l).expr("GENERATED_2FEAE5AA6ADD786D69BC21AE5FE55459",
                                                                                          org.kie.kogito.queries.P4A.LambdaPredicate4A1904F944E40BCD103B166527216136.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                           org.kie.kogito.queries.P21.LambdaExtractor2178C5F616031C3EF709F4C11A65E280.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("age")).expr("GENERATED_FAEA9DFABAA8307EB7DE36F7A67FD725",
                                                                                                                 org.kie.kogito.queries.P8D.LambdaPredicate8D3BB5063E60DDCF7326AB040517A541.INSTANCE,
                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                  org.kie.kogito.queries.PCD.LambdaExtractorCD41A4C8F1D18964393DB8105D2E2E99.INSTANCE,
                                                                                                                                  600),
                                                                                                                 D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P2A.LambdaConsequence2A43BEA8EB601ECF60080E573952C998.INSTANCE));
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
                                                            .build(D.pattern(var_$l).expr("GENERATED_EF0A3E3BEAC6BCCEC848445002A70D21",
                                                                                          org.kie.kogito.queries.P67.LambdaPredicate67AB569711CCDC5406A94DAFC3D18E72.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                           org.kie.kogito.queries.P21.LambdaExtractor2178C5F616031C3EF709F4C11A65E280.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("age")).expr("GENERATED_33A13C6DED5A13E8FD0F7E19E555F215",
                                                                                                                 org.kie.kogito.queries.P33.LambdaPredicate339CF8626419029EE427914FA0CB4EA2.INSTANCE,
                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                  org.kie.kogito.queries.PCD.LambdaExtractorCD41A4C8F1D18964393DB8105D2E2E99.INSTANCE,
                                                                                                                                  850),
                                                                                                                 D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P2A.LambdaConsequence2A43BEA8EB601ECF60080E573952C998.INSTANCE));
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
                                                            .build(D.pattern(var_$l).expr("GENERATED_A7C279C0563D4474C21CD98D66D38FC9",
                                                                                          org.kie.kogito.queries.P9A.LambdaPredicate9AA4BED9BEDD32018761E385A304B26C.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                           org.kie.kogito.queries.P21.LambdaExtractor2178C5F616031C3EF709F4C11A65E280.INSTANCE,
                                                                                                           18),
                                                                                          D.reactOn("age")).expr("GENERATED_FAEA9DFABAA8307EB7DE36F7A67FD725",
                                                                                                                 org.kie.kogito.queries.P8D.LambdaPredicate8D3BB5063E60DDCF7326AB040517A541.INSTANCE,
                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("creditScore"),
                                                                                                                                  org.kie.kogito.queries.PCD.LambdaExtractorCD41A4C8F1D18964393DB8105D2E2E99.INSTANCE,
                                                                                                                                  600),
                                                                                                                 D.reactOn("creditScore")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.PD7.LambdaConsequenceD7B0413E72B8AFD8F7A1F6098CC4CFC3.INSTANCE));
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
                                                            .build(D.pattern(var_$l).expr("GENERATED_F30AF5B74BEBAB8898E4EF23508B76AC",
                                                                                          org.kie.kogito.queries.P65.LambdaPredicate656CB7688C9F1FE8F654DA7521482941.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                           DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                           org.kie.kogito.queries.P21.LambdaExtractor2178C5F616031C3EF709F4C11A65E280.INSTANCE,
                                                                                                           20),
                                                                                          D.reactOn("age")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.P2A.LambdaConsequence2A43BEA8EB601ECF60080E573952C998.INSTANCE));
        return rule;
    }
}
