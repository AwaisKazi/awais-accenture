package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_SchoolUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".SchoolUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@7dc9e9d7
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_SchoolUnitRuleMethods0.rule_SchoolRule__13());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindPassing = query_FindPassing();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindPassing() {
        final org.drools.model.Variable<org.kie.kogito.queries.SchoolScore> var_$l = D.declarationOf(org.kie.kogito.queries.SchoolScore.class,
                                                                                                     DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_SchoolScore_Metadata_INSTANCE,
                                                                                                     "$l",
                                                                                                     D.entryPoint("schoolScores"));
        org.drools.model.Query FindPassing_build = queryDef_FindPassing.build(D.pattern(var_$l,
                                                                                        D.entryPoint("schoolScores")).expr("GENERATED_A923EB7C91B80541D2CC22F695D62A93",
                                                                                                                           org.kie.kogito.queries.PC0.LambdaPredicateC07BE1C793686FFAEDDB0D1FBB443E71.INSTANCE,
                                                                                                                           D.reactOn("passed")));
        return FindPassing_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindPassing);
    }
}
