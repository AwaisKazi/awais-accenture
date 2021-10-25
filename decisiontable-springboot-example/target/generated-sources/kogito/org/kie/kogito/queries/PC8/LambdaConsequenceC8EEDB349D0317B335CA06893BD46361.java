package org.kie.kogito.queries.PC8;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceC8EEDB349D0317B335CA06893BD46361 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.SchoolGrades>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "BCAECBF47E176F194988C8FBFD0C2D66";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolGrades_Metadata_INSTANCE, "passed");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.SchoolGrades $l) throws java.lang.Exception {
        {
            {
                ($l).setPassed(true);
            }
            drools.update($l, mask_$l);
        }
    }
}
