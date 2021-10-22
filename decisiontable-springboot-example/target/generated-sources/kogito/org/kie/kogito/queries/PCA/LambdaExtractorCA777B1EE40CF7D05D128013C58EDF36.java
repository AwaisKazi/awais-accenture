package org.kie.kogito.queries.PCA;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorCA777B1EE40CF7D05D128013C58EDF36 implements org.drools.model.functions.Function1<org.kie.kogito.queries.CreditCardApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C3443CD6E3A703A8241A8BD206B95C48";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.CreditCardApplication _this) {
        return _this.getScore();
    }
}
