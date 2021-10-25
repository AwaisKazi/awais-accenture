package org.kie.kogito.queries;
public class DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7 {

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_queries_CreditCardApplication_Metadata_INSTANCE = new org_kie_kogito_queries_CreditCardApplication_Metadata();
    private static class org_kie_kogito_queries_CreditCardApplication_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.queries.CreditCardApplication.class;
        }

        @Override
        public int getPropertiesSize() {
            return 3;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "age": return 0;
                case "approved": return 1;
                case "score": return 2;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.queries.CreditCardApplication");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE = new org_kie_kogito_queries_LoanApplication_Metadata();
    private static class org_kie_kogito_queries_LoanApplication_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.queries.LoanApplication.class;
        }

        @Override
        public int getPropertiesSize() {
            return 5;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "amount": return 0;
                case "applicant": return 1;
                case "approved": return 2;
                case "deposit": return 3;
                case "id": return 4;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.queries.LoanApplication");
        }
    }

    public static final org.drools.model.DomainClassMetadata java_lang_String_Metadata_INSTANCE = new java_lang_String_Metadata();
    private static class java_lang_String_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.lang.String.class;
        }

        @Override
        public int getPropertiesSize() {
            return 3;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "blank": return 0;
                case "bytes": return 1;
                case "empty": return 2;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class java.lang.String");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_queries_EvenChecker_Metadata_INSTANCE = new org_kie_kogito_queries_EvenChecker_Metadata();
    private static class org_kie_kogito_queries_EvenChecker_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.queries.EvenChecker.class;
        }

        @Override
        public int getPropertiesSize() {
            return 2;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "even": return 0;
                case "number": return 1;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.queries.EvenChecker");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_rules_DataStore_Metadata_INSTANCE = new org_kie_kogito_rules_DataStore_Metadata();
    private static class org_kie_kogito_rules_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.rules.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 0;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.kie.kogito.rules.DataStore");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_queries_SchoolScore_Metadata_INSTANCE = new org_kie_kogito_queries_SchoolScore_Metadata();
    private static class org_kie_kogito_queries_SchoolScore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.queries.SchoolScore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "bio": return 0;
                case "chem": return 1;
                case "math": return 2;
                case "passed": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.queries.SchoolScore");
        }
    }

}