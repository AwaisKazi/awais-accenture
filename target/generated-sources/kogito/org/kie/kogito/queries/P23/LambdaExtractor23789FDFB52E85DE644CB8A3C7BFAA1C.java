package org.kie.kogito.queries.P23;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor23789FDFB52E85DE644CB8A3C7BFAA1C implements org.drools.model.functions.Function1<org.kie.kogito.queries.CreditCardApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4A86EA74EEAF322F1FCEB3B313F52C11";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.CreditCardApplication _this) {
        return _this.getCreditScore();
    }
}
