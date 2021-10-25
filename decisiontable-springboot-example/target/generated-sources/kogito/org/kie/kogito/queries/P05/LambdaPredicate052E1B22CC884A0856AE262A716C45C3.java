package org.kie.kogito.queries.P05;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.GradeUnit;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate052E1B22CC884A0856AE262A716C45C3 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.SchoolGrades>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "1ACE90D0CD8E60A5A96617D54F5CF890";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.SchoolGrades _this) throws java.lang.Exception {
        return _this.isPassed();
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("passed", "DidStudentPass", "C:\\Users\\jimmy.q.ellis\\Documents\\awais-accenture\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\GradeUnit.xls");
    }
}
