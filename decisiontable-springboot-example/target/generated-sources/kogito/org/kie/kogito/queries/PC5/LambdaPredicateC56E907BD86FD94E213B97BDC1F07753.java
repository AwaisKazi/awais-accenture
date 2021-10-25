package org.kie.kogito.queries.PC5;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateC56E907BD86FD94E213B97BDC1F07753 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.EvenChecker>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "570A3EDA6645A9B95A8973B256113EEA";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.EvenChecker _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNumbersNullSafeEquals(_this.getNumber() % 2, 0);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("number%2== 0", "EvenRule_13", "C:\\Users\\matthew.sclar\\Documents\\Capital One\\Training\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\EvenUnit.xls");
    }
}
