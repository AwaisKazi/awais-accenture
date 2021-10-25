package org.kie.kogito.queries.PD2;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateD25207EEBC7CBA338991EB12C8BD1A92 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.SchoolScore>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "BD96859F34B39EB099FE6E6D861F76E5";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.SchoolScore _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers((_this.getMath() + _this.getBio() + _this.getChem()) / 3, 50);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("(math  + bio  + chem ) / 3 > 50", "SchoolRule_13", "C:\\Users\\matthew.sclar\\Documents\\Capital One\\Training\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\SchoolUnit.xls");
    }
}
