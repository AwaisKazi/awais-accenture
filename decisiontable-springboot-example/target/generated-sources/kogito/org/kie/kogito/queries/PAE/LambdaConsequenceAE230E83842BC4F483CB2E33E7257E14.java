package org.kie.kogito.queries.PAE;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceAE230E83842BC4F483CB2E33E7257E14 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.EvenChecker>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "55DACD9688A3F2C2BD7575E731EEA490";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_EvenChecker_Metadata_INSTANCE, "even");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.EvenChecker $l) throws java.lang.Exception {
        {
            {
                ($l).setEven(true);
            }
            drools.update($l, mask_$l);
        }
    }
}
