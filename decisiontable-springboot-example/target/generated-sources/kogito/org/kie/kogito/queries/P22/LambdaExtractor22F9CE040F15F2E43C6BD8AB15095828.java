package org.kie.kogito.queries.P22;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor22F9CE040F15F2E43C6BD8AB15095828 implements org.drools.model.functions.Function1<org.kie.kogito.queries.SchoolGrades, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C00486E803D272BFBE56D1960BD1C96B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.SchoolGrades _this) {
        return _this.getApplicant().getAge();
    }
}
