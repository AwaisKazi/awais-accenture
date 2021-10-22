package org.kie.kogito.queries.P0C;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor0C05C7A2FA356A5244316DCC79D924C2 implements org.drools.model.functions.Function1<org.kie.kogito.queries.CreditCardApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B4EE80DD9066E52093CA7A10590A1879";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.CreditCardApplication _this) {
        return _this.getAge();
    }
}
