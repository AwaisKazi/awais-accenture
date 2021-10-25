package org.kie.kogito.queries.PD4;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateD456E3DFDC77A661B8B3740E30DBEA4E implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.CreditCardApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "62A7F0DE59845F76D735761358FBC405";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.CreditCardApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getAge(), 25);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("age >= 25", "CreditCardRule_17", "C:\\Users\\matthew.sclar\\Documents\\Capital One\\Training\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\CreditCardUnit.xls");
    }
}
