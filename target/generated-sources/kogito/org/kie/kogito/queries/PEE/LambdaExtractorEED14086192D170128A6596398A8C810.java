package org.kie.kogito.queries.PEE;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorEED14086192D170128A6596398A8C810 implements org.drools.model.functions.Function1<org.kie.kogito.queries.CreditCardApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3CE7DA4BA5B3C36B094FD4C43F3049E9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.CreditCardApplication _this) {
        return _this.getCreditLimit();
    }
}
