package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.CreditCardUnit;
import org.kie.kogito.queries.SchoolScore;
import org.kie.kogito.queries.EvenUnit;
import org.kie.kogito.queries.LoanApplication;

public abstract class RulesF894883E1030542FEFCE9860F835B9B7 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.kie.kogito.queries";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("evenChecks"),
                                       D.entryPoint("schoolScores"),
                                       D.entryPoint("creditCardApplications"),
                                       D.entryPoint("loanApplications"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_evenChecks = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                            "org.kie.kogito.queries",
                                                                                                            "evenChecks");

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_schoolScores = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                              "org.kie.kogito.queries",
                                                                                                              "schoolScores");

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_creditCardApplications = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                                        "org.kie.kogito.queries",
                                                                                                                        "creditCardApplications");

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_loanApplications = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                                  "org.kie.kogito.queries",
                                                                                                                  "loanApplications");

    public static final org.drools.model.Global<Integer> var_maxAmount = D.globalOf(Integer.class,
                                                                                    "org.kie.kogito.queries",
                                                                                    "maxAmount");

    public static final org.drools.model.Query0Def queryDef_FindNotApprovedIdAndAmount = D.query("org.kie.kogito.queries",
                                                                                                 "FindNotApprovedIdAndAmount");

    public static final org.drools.model.Query0Def queryDef_FindPassing = D.query("org.kie.kogito.queries",
                                                                                  "FindPassing");

    public static final org.drools.model.Query0Def queryDef_FindEvens = D.query("org.kie.kogito.queries",
                                                                                "FindEvens");

    public static final org.drools.model.Query0Def queryDef_FindCreditCardApproved = D.query("org.kie.kogito.queries",
                                                                                             "FindCreditCardApproved");

    public static final org.drools.model.Query0Def queryDef_FindApproved = D.query("org.kie.kogito.queries",
                                                                                   "FindApproved");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_evenChecks);
        globals.add(var_schoolScores);
        globals.add(var_creditCardApplications);
        globals.add(var_loanApplications);
        globals.add(var_maxAmount);
    }
}
