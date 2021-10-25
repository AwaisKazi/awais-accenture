package org.kie.kogito.queries.PF8;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateF884294870D0611DE787A0D8A608B3F0 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.CreditCardApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "53B1355DCA9A42D88361D21B6144088D";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.CreditCardApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getScore(), 700);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("score >= 700", "CreditCardRule_14", "C:\\Users\\matthew.sclar\\Documents\\Capital One\\Training\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\CreditCardUnit.xls");
    }
}
