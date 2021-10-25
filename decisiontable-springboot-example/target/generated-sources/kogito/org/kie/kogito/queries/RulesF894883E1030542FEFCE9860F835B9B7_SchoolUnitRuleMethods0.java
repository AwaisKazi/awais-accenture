package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_SchoolUnitRuleMethods0 {

    /**
     * Rule name: SchoolRule_13
     */
    public static org.drools.model.Rule rule_SchoolRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.SchoolScore> var_$l = D.declarationOf(org.kie.kogito.queries.SchoolScore.class,
                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolScore_Metadata_INSTANCE,
                                                                                                     "$l",
                                                                                                     D.entryPoint("schoolScores"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolScore_Metadata_INSTANCE,
                                                                                         "passed");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "SchoolRule_13").unit(org.kie.kogito.queries.SchoolUnit.class)
                                                            .build(D.pattern(var_$l).expr("GENERATED_CBFE390C337C127DB35E4E01365083D4",
                                                                                          org.kie.kogito.queries.PD2.LambdaPredicateD25207EEBC7CBA338991EB12C8BD1A92.INSTANCE,
                                                                                          D.reactOn("chem",
                                                                                                    "bio",
                                                                                                    "math")),
                                                                   D.on(var_$l).execute(org.kie.kogito.queries.PCB.LambdaConsequenceCB6D81E4E19A96A9001016E63E2E4231.INSTANCE));
        return rule;
    }
}
