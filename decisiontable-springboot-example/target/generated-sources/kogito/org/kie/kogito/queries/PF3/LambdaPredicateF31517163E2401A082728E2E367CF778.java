package org.kie.kogito.queries.PF3;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateF31517163E2401A082728E2E367CF778 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "39528017FE8430751F1ABA28D5D9A248";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getDeposit(), 1000);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("deposit < 1000", "LoanRule_14", "C:\\Users\\matthew.sclar\\Documents\\Capital One\\Training\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\LoanUnit.xls");
    }
}
