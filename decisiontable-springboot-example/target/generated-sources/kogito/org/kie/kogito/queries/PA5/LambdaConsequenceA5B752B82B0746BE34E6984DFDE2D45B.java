package org.kie.kogito.queries.PA5;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceA5B752B82B0746BE34E6984DFDE2D45B implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CFAEA75EF2E3A9B01D3376397BF244A0";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE, "approved");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.LoanApplication $l) throws java.lang.Exception {
        {
            {
                ($l).setApproved(false);
            }
            drools.update($l, mask_$l);
        }
    }
}
