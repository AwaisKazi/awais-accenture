package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_EvenUnitRuleMethods0 {

    /**
     * Rule name: EvenRule_13
     */
    public static org.drools.model.Rule rule_EvenRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.EvenChecker> var_$l = D.declarationOf(org.kie.kogito.queries.EvenChecker.class,
                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_EvenChecker_Metadata_INSTANCE,
                                                                                                     "$l",
                                                                                                     D.entryPoint("evenChecks"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_EvenChecker_Metadata_INSTANCE,
                                                                                         "even");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "EvenRule_13").unit(org.kie.kogito.queries.EvenUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_A737940BB6378EAAEA2159D785CDA8D2",
                                                                                        org.kie.kogito.queries.PC5.LambdaPredicateC56E907BD86FD94E213B97BDC1F07753.INSTANCE,
                                                                                        D.reactOn("number")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PAE.LambdaConsequenceAE230E83842BC4F483CB2E33E7257E14.INSTANCE));
        return rule;
    }
}
