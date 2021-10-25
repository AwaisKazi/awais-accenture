package org.kie.kogito.queries.P2B;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor2BEF985EB89E8D71AB8BC92FFFD39F47 implements org.drools.model.functions.Function1<org.kie.kogito.queries.SchoolGrades, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "BADA4F62786279C014FE9469BB0A01C2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.SchoolGrades _this) {
        return _this.getAverage();
    }
}
