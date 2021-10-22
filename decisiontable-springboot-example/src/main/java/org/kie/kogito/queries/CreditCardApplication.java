/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.queries;

public class CreditCardApplication {

    private String id;
    private Applicant applicant;
    private int creditScore;

    // private int amountOfCredit = 0;
    private boolean approved = false;

    public CreditCardApplication() {

    }

    public CreditCardApplication(String id, Applicant applicant, int creditScore) {
        this.id = id;
        this.applicant = applicant;
        this.creditScore = creditScore;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    // public int getAmountOfCredit() {
    //     return amountOfCredit;
    // }

    // public void setAmountOfCredit(int amountOfCredit) {
    //     this.amountOfCredit = amountOfCredit;
    // }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}
