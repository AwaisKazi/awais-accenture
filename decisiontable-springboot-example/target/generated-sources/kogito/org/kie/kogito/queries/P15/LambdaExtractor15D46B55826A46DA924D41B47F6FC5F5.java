package org.kie.kogito.queries.P15;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor15D46B55826A46DA924D41B47F6FC5F5 implements org.drools.model.functions.Function1<org.kie.kogito.queries.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8C764FA9714FC7D360E28924C7E27212";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.LoanApplication _this) {
        return _this.getDeposit();
    }
}
