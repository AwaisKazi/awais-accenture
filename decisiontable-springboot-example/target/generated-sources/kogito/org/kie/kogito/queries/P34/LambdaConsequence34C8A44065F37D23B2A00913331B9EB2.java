package org.kie.kogito.queries.P34;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence34C8A44065F37D23B2A00913331B9EB2 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "FE570A66E52AF09D77B617147BF6A44D";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE, "approved");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) throws java.lang.Exception {
        {
            {
                ($l).setApproved(true);
            }
            drools.update($l, mask_$l);
        }
    }
}
