package org.kie.kogito.queries.PCB;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceCB6D81E4E19A96A9001016E63E2E4231 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.SchoolScore>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7DB28A66361786BD7ACDD43DFC4A337B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolScore_Metadata_INSTANCE, "passed");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.SchoolScore $l) throws java.lang.Exception {
        {
            {
                ($l).setPassed(true);
            }
            drools.update($l, mask_$l);
        }
    }
}
