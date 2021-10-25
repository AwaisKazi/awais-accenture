package org.kie.kogito.queries.P27;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate275ADDF1AC2D794AFCE5D31944AA86FE implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.CreditCardApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B49D7D37180276DFC3FB191334338F9B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.CreditCardApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getCreditScore(), 700);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("creditScore >=700", "CreditRule_17", "C:\\Users\\jimmy.q.ellis\\Documents\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\CreditCardUnit.xls");
    }
}
