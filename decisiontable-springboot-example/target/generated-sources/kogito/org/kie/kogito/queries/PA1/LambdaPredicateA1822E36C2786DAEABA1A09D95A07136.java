package org.kie.kogito.queries.PA1;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateA1822E36C2786DAEABA1A09D95A07136 implements org.drools.model.functions.Predicate2<org.kie.kogito.queries.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CF19A968DA9699C1B2DD9A6CC2630632";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.LoanApplication _this, Integer maxAmount) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAmount(), maxAmount);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("amount > maxAmount", "LoanRule_16", "C:\\Users\\jimmy.q.ellis\\Documents\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\LoanUnit.xls");
    }
}
