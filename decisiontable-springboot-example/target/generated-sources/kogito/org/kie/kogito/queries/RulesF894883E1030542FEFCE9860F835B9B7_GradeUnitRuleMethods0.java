package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_GradeUnitRuleMethods0 {

    /**
     * Rule name: GradeRule_13
     */
    public static org.drools.model.Rule rule_GradeRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.SchoolGrades> var_$l = D.declarationOf(org.kie.kogito.queries.SchoolGrades.class,
                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE,
                                                                                                      "$l",
                                                                                                      D.entryPoint("schoolGrades"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE,
                                                                                         "passed");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "GradeRule_13").unit(org.kie.kogito.queries.GradeUnit.class)
                                                           .build(D.pattern(var_$l).expr("GENERATED_DF79F4904F505B92344705718D208569",
                                                                                         org.kie.kogito.queries.P4D.LambdaPredicate4D0E68044EAB2A96CFF7AC111E06569C.INSTANCE,
                                                                                         D.alphaIndexedBy(int.class,
                                                                                                          org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                          DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE.getPropertyIndex("average"),
                                                                                                          org.kie.kogito.queries.P2B.LambdaExtractor2BEF985EB89E8D71AB8BC92FFFD39F47.INSTANCE,
                                                                                                          70),
                                                                                         D.reactOn("average")).expr("GENERATED_B3C554ABBAFE6ADD554CD58AE7EDE13A",
                                                                                                                    org.kie.kogito.queries.PB6.LambdaPredicateB66108DFDE3ACE179CC9DF0F1652C321.INSTANCE,
                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                     org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                     -1,
                                                                                                                                     org.kie.kogito.queries.P22.LambdaExtractor22F9CE040F15F2E43C6BD8AB15095828.INSTANCE,
                                                                                                                                     1),
                                                                                                                    D.reactOn("applicant")),
                                                                  D.on(var_$l).execute(org.kie.kogito.queries.PC8.LambdaConsequenceC8EEDB349D0317B335CA06893BD46361.INSTANCE));
        return rule;
    }

    /**
     * Rule name: GradeRule_14
     */
    public static org.drools.model.Rule rule_GradeRule__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.SchoolGrades> var_$l = D.declarationOf(org.kie.kogito.queries.SchoolGrades.class,
                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE,
                                                                                                      "$l",
                                                                                                      D.entryPoint("schoolGrades"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE,
                                                                                         "passed");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "GradeRule_14").unit(org.kie.kogito.queries.GradeUnit.class)
                                                           .build(D.pattern(var_$l).expr("GENERATED_E2E1172A8CC7E0840BA935F68D638BF5",
                                                                                         org.kie.kogito.queries.PF5.LambdaPredicateF5C02AAC01A40370A277E6132AF08CDE.INSTANCE,
                                                                                         D.alphaIndexedBy(int.class,
                                                                                                          org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                          DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE.getPropertyIndex("average"),
                                                                                                          org.kie.kogito.queries.P2B.LambdaExtractor2BEF985EB89E8D71AB8BC92FFFD39F47.INSTANCE,
                                                                                                          70),
                                                                                         D.reactOn("average")).expr("GENERATED_B3C554ABBAFE6ADD554CD58AE7EDE13A",
                                                                                                                    org.kie.kogito.queries.PB6.LambdaPredicateB66108DFDE3ACE179CC9DF0F1652C321.INSTANCE,
                                                                                                                    D.alphaIndexedBy(int.class,
                                                                                                                                     org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                     -1,
                                                                                                                                     org.kie.kogito.queries.P22.LambdaExtractor22F9CE040F15F2E43C6BD8AB15095828.INSTANCE,
                                                                                                                                     1),
                                                                                                                    D.reactOn("applicant")),
                                                                  D.on(var_$l).execute(org.kie.kogito.queries.P03.LambdaConsequence03D6D66A1E0EB5257EBC03E0C025F265.INSTANCE));
        return rule;
    }
}
