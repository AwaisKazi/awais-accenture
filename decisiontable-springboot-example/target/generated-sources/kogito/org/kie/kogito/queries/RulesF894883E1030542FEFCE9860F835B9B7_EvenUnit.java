package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_EvenUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".EvenUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@60e91f55
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_EvenUnitRuleMethods0.rule_EvenRule__13());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindEvens = query_FindEvens();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindEvens() {
        final org.drools.model.Variable<org.kie.kogito.queries.EvenChecker> var_$l = D.declarationOf(org.kie.kogito.queries.EvenChecker.class,
                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_EvenChecker_Metadata_INSTANCE,
                                                                                                     "$l",
                                                                                                     D.entryPoint("evenChecks"));
        org.drools.model.Query FindEvens_build = queryDef_FindEvens.build(D.pattern(var_$l,
                                                                                    D.entryPoint("evenChecks")).expr("GENERATED_3E5367400A53C3059EB0BC1A9DBD8191",
                                                                                                                     org.kie.kogito.queries.P32.LambdaPredicate32D2BE8A32AED9EF804901D7E494C096.INSTANCE,
                                                                                                                     D.reactOn("even")));
        return FindEvens_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindEvens);
    }
}
