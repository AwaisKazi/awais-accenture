package org.kie.kogito.queries.P4A;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4ABE41F9C3CEB2FA9D89AD49B506FF1C implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.CreditCardApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "544AB70CCFF32B9486056D9D2B165DDB";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE, "approved");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.CreditCardApplication $l) throws java.lang.Exception {
        {
            {
                ($l).setApproved(true);
            }
            drools.update($l, mask_$l);
        }
    }
}
