package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.StudentApplication;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_StudentUnitRuleMethods0 {

    /**
     * Rule name: StudentRule_13
     */
    public static org.drools.model.Rule rule_StudentRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.StudentApplication> var_$l = D.declarationOf(org.kie.kogito.queries.StudentApplication.class,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                                            "$l",
                                                                                                            D.entryPoint("studentApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "StudentRule_13").unit(org.kie.kogito.queries.StudentUnit.class)
                                                             .build(D.pattern(var_$l).expr("GENERATED_D6FFB88E40DBE312EFD57248118108D6",
                                                                                           org.kie.kogito.queries.P55.LambdaPredicate55B808381A4613676C937818B6BAB57B.INSTANCE,
                                                                                           D.alphaIndexedBy(int.class,
                                                                                                            org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("mathScore"),
                                                                                                            org.kie.kogito.queries.P26.LambdaExtractor26EE17DEAE42369C76424350FBECD215.INSTANCE,
                                                                                                            50),
                                                                                           D.reactOn("mathScore")).expr("GENERATED_8471B4FE84DEC0D62FB9CE9909BA9CC9",
                                                                                                                        org.kie.kogito.queries.P05.LambdaPredicate05960B38354F451880B019D21F7BCCE3.INSTANCE,
                                                                                                                        D.alphaIndexedBy(int.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("bioScore"),
                                                                                                                                         org.kie.kogito.queries.PFD.LambdaExtractorFDB616DB1BE5F54C2ABC3B6568C3A3D0.INSTANCE,
                                                                                                                                         60),
                                                                                                                        D.reactOn("bioScore")).expr("GENERATED_F984E62E47314FC96624606EE2788E91",
                                                                                                                                                    org.kie.kogito.queries.P9A.LambdaPredicate9AE18B6F4E72451FB1576A3DD9C55419.INSTANCE,
                                                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                                                     org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("chemScore"),
                                                                                                                                                                     org.kie.kogito.queries.P29.LambdaExtractor29AD35006E414E443A1A6E96560FCDCE.INSTANCE,
                                                                                                                                                                     60),
                                                                                                                                                    D.reactOn("chemScore")).expr("GENERATED_1EE6D706827E3FB3783110403C5A4F14",
                                                                                                                                                                                 org.kie.kogito.queries.P7F.LambdaPredicate7F4094F1110FBA95B0D9C11212649B53.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("historyScore"),
                                                                                                                                                                                                  org.kie.kogito.queries.P57.LambdaExtractor5735E700A98861D5F075CE4D8DEC1C87.INSTANCE,
                                                                                                                                                                                                  50),
                                                                                                                                                                                 D.reactOn("historyScore")),
                                                                    D.on(var_$l).execute(org.kie.kogito.queries.P1D.LambdaConsequence1DF50E636A06A4144039427928D9D016.INSTANCE));
        return rule;
    }

    /**
     * Rule name: StudentRule_14
     */
    public static org.drools.model.Rule rule_StudentRule__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.StudentApplication> var_$l = D.declarationOf(org.kie.kogito.queries.StudentApplication.class,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                                            "$l",
                                                                                                            D.entryPoint("studentApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "StudentRule_14").unit(org.kie.kogito.queries.StudentUnit.class)
                                                             .build(D.pattern(var_$l).expr("GENERATED_CAAD6C8051280BB0DDD828F3A4932F1D",
                                                                                           org.kie.kogito.queries.PD0.LambdaPredicateD09AC9FA5A01C5844D958AC0E23DCA70.INSTANCE,
                                                                                           D.alphaIndexedBy(int.class,
                                                                                                            org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("mathScore"),
                                                                                                            org.kie.kogito.queries.P26.LambdaExtractor26EE17DEAE42369C76424350FBECD215.INSTANCE,
                                                                                                            50),
                                                                                           D.reactOn("mathScore")).expr("GENERATED_8471B4FE84DEC0D62FB9CE9909BA9CC9",
                                                                                                                        org.kie.kogito.queries.P05.LambdaPredicate05960B38354F451880B019D21F7BCCE3.INSTANCE,
                                                                                                                        D.alphaIndexedBy(int.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("bioScore"),
                                                                                                                                         org.kie.kogito.queries.PFD.LambdaExtractorFDB616DB1BE5F54C2ABC3B6568C3A3D0.INSTANCE,
                                                                                                                                         60),
                                                                                                                        D.reactOn("bioScore")).expr("GENERATED_F984E62E47314FC96624606EE2788E91",
                                                                                                                                                    org.kie.kogito.queries.P9A.LambdaPredicate9AE18B6F4E72451FB1576A3DD9C55419.INSTANCE,
                                                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                                                     org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("chemScore"),
                                                                                                                                                                     org.kie.kogito.queries.P29.LambdaExtractor29AD35006E414E443A1A6E96560FCDCE.INSTANCE,
                                                                                                                                                                     60),
                                                                                                                                                    D.reactOn("chemScore")).expr("GENERATED_1EE6D706827E3FB3783110403C5A4F14",
                                                                                                                                                                                 org.kie.kogito.queries.P7F.LambdaPredicate7F4094F1110FBA95B0D9C11212649B53.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("historyScore"),
                                                                                                                                                                                                  org.kie.kogito.queries.P57.LambdaExtractor5735E700A98861D5F075CE4D8DEC1C87.INSTANCE,
                                                                                                                                                                                                  50),
                                                                                                                                                                                 D.reactOn("historyScore")),
                                                                    D.on(var_$l).execute(org.kie.kogito.queries.P84.LambdaConsequence8456C72C0EE784B09EB94ABE62B7F22E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: StudentRule_15
     */
    public static org.drools.model.Rule rule_StudentRule__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.StudentApplication> var_$l = D.declarationOf(org.kie.kogito.queries.StudentApplication.class,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                                            "$l",
                                                                                                            D.entryPoint("studentApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "StudentRule_15").unit(org.kie.kogito.queries.StudentUnit.class)
                                                             .build(D.pattern(var_$l).expr("GENERATED_D6FFB88E40DBE312EFD57248118108D6",
                                                                                           org.kie.kogito.queries.P55.LambdaPredicate55B808381A4613676C937818B6BAB57B.INSTANCE,
                                                                                           D.alphaIndexedBy(int.class,
                                                                                                            org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("mathScore"),
                                                                                                            org.kie.kogito.queries.P26.LambdaExtractor26EE17DEAE42369C76424350FBECD215.INSTANCE,
                                                                                                            50),
                                                                                           D.reactOn("mathScore")).expr("GENERATED_8471B4FE84DEC0D62FB9CE9909BA9CC9",
                                                                                                                        org.kie.kogito.queries.P05.LambdaPredicate05960B38354F451880B019D21F7BCCE3.INSTANCE,
                                                                                                                        D.alphaIndexedBy(int.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("bioScore"),
                                                                                                                                         org.kie.kogito.queries.PFD.LambdaExtractorFDB616DB1BE5F54C2ABC3B6568C3A3D0.INSTANCE,
                                                                                                                                         60),
                                                                                                                        D.reactOn("bioScore")).expr("GENERATED_F984E62E47314FC96624606EE2788E91",
                                                                                                                                                    org.kie.kogito.queries.P9A.LambdaPredicate9AE18B6F4E72451FB1576A3DD9C55419.INSTANCE,
                                                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                                                     org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("chemScore"),
                                                                                                                                                                     org.kie.kogito.queries.P29.LambdaExtractor29AD35006E414E443A1A6E96560FCDCE.INSTANCE,
                                                                                                                                                                     60),
                                                                                                                                                    D.reactOn("chemScore")).expr("GENERATED_71929BA4E4CBF0338A330410DB3482B0",
                                                                                                                                                                                 org.kie.kogito.queries.P56.LambdaPredicate564686E049A8675C5FF43779314BA98B.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("historyScore"),
                                                                                                                                                                                                  org.kie.kogito.queries.P57.LambdaExtractor5735E700A98861D5F075CE4D8DEC1C87.INSTANCE,
                                                                                                                                                                                                  50),
                                                                                                                                                                                 D.reactOn("historyScore")),
                                                                    D.on(var_$l).execute(org.kie.kogito.queries.P84.LambdaConsequence8456C72C0EE784B09EB94ABE62B7F22E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: StudentRule_16
     */
    public static org.drools.model.Rule rule_StudentRule__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.StudentApplication> var_$l = D.declarationOf(org.kie.kogito.queries.StudentApplication.class,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                                            "$l",
                                                                                                            D.entryPoint("studentApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "StudentRule_16").unit(org.kie.kogito.queries.StudentUnit.class)
                                                             .build(D.pattern(var_$l).expr("GENERATED_D6FFB88E40DBE312EFD57248118108D6",
                                                                                           org.kie.kogito.queries.P55.LambdaPredicate55B808381A4613676C937818B6BAB57B.INSTANCE,
                                                                                           D.alphaIndexedBy(int.class,
                                                                                                            org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("mathScore"),
                                                                                                            org.kie.kogito.queries.P26.LambdaExtractor26EE17DEAE42369C76424350FBECD215.INSTANCE,
                                                                                                            50),
                                                                                           D.reactOn("mathScore")).expr("GENERATED_524D64196CE0CE0644F7AF6BEFAAA246",
                                                                                                                        org.kie.kogito.queries.PA2.LambdaPredicateA28CDB3C850DC7586EB3D8350891F31B.INSTANCE,
                                                                                                                        D.alphaIndexedBy(int.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("bioScore"),
                                                                                                                                         org.kie.kogito.queries.PFD.LambdaExtractorFDB616DB1BE5F54C2ABC3B6568C3A3D0.INSTANCE,
                                                                                                                                         60),
                                                                                                                        D.reactOn("bioScore")).expr("GENERATED_F984E62E47314FC96624606EE2788E91",
                                                                                                                                                    org.kie.kogito.queries.P9A.LambdaPredicate9AE18B6F4E72451FB1576A3DD9C55419.INSTANCE,
                                                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                                                     org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("chemScore"),
                                                                                                                                                                     org.kie.kogito.queries.P29.LambdaExtractor29AD35006E414E443A1A6E96560FCDCE.INSTANCE,
                                                                                                                                                                     60),
                                                                                                                                                    D.reactOn("chemScore")).expr("GENERATED_1EE6D706827E3FB3783110403C5A4F14",
                                                                                                                                                                                 org.kie.kogito.queries.P7F.LambdaPredicate7F4094F1110FBA95B0D9C11212649B53.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("historyScore"),
                                                                                                                                                                                                  org.kie.kogito.queries.P57.LambdaExtractor5735E700A98861D5F075CE4D8DEC1C87.INSTANCE,
                                                                                                                                                                                                  50),
                                                                                                                                                                                 D.reactOn("historyScore")),
                                                                    D.on(var_$l).execute(org.kie.kogito.queries.P84.LambdaConsequence8456C72C0EE784B09EB94ABE62B7F22E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: StudentRule_17
     */
    public static org.drools.model.Rule rule_StudentRule__17() {
        final org.drools.model.Variable<org.kie.kogito.queries.StudentApplication> var_$l = D.declarationOf(org.kie.kogito.queries.StudentApplication.class,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                                            "$l",
                                                                                                            D.entryPoint("studentApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "StudentRule_17").unit(org.kie.kogito.queries.StudentUnit.class)
                                                             .build(D.pattern(var_$l).expr("GENERATED_D6FFB88E40DBE312EFD57248118108D6",
                                                                                           org.kie.kogito.queries.P55.LambdaPredicate55B808381A4613676C937818B6BAB57B.INSTANCE,
                                                                                           D.alphaIndexedBy(int.class,
                                                                                                            org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                            DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("mathScore"),
                                                                                                            org.kie.kogito.queries.P26.LambdaExtractor26EE17DEAE42369C76424350FBECD215.INSTANCE,
                                                                                                            50),
                                                                                           D.reactOn("mathScore")).expr("GENERATED_8471B4FE84DEC0D62FB9CE9909BA9CC9",
                                                                                                                        org.kie.kogito.queries.P05.LambdaPredicate05960B38354F451880B019D21F7BCCE3.INSTANCE,
                                                                                                                        D.alphaIndexedBy(int.class,
                                                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("bioScore"),
                                                                                                                                         org.kie.kogito.queries.PFD.LambdaExtractorFDB616DB1BE5F54C2ABC3B6568C3A3D0.INSTANCE,
                                                                                                                                         60),
                                                                                                                        D.reactOn("bioScore")).expr("GENERATED_B65B53CDED20C858368A8E910390D642",
                                                                                                                                                    org.kie.kogito.queries.PC3.LambdaPredicateC3217B85E167A909C8E92453F229AC76.INSTANCE,
                                                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                                                     org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("chemScore"),
                                                                                                                                                                     org.kie.kogito.queries.P29.LambdaExtractor29AD35006E414E443A1A6E96560FCDCE.INSTANCE,
                                                                                                                                                                     60),
                                                                                                                                                    D.reactOn("chemScore")).expr("GENERATED_1EE6D706827E3FB3783110403C5A4F14",
                                                                                                                                                                                 org.kie.kogito.queries.P7F.LambdaPredicate7F4094F1110FBA95B0D9C11212649B53.INSTANCE,
                                                                                                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                                                                                  DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_StudentApplication_Metadata_INSTANCE.getPropertyIndex("historyScore"),
                                                                                                                                                                                                  org.kie.kogito.queries.P57.LambdaExtractor5735E700A98861D5F075CE4D8DEC1C87.INSTANCE,
                                                                                                                                                                                                  50),
                                                                                                                                                                                 D.reactOn("historyScore")),
                                                                    D.on(var_$l).execute(org.kie.kogito.queries.P84.LambdaConsequence8456C72C0EE784B09EB94ABE62B7F22E.INSTANCE));
        return rule;
    }
}
