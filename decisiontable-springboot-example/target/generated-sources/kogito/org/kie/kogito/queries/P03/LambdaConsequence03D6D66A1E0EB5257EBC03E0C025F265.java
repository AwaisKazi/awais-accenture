package org.kie.kogito.queries.P03;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence03D6D66A1E0EB5257EBC03E0C025F265 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.SchoolGrades>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6DDA8A5A887A1C933871E4A8F0B60AD1";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE, "passed");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.SchoolGrades $l) throws java.lang.Exception {
        {
            {
                ($l).setPassed(false);
            }
            drools.update($l, mask_$l);
        }
    }
}
