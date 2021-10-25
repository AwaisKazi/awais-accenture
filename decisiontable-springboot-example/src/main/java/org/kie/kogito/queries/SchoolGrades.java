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

public class SchoolGrades {

    private int mathGrade;
    private int chemistryGrade;
    private int biologyGrade;
    private int average = 0;
    private boolean passed = true;
    private Applicant applicant;

    public SchoolGrades() {

    }

    public SchoolGrades(Applicant applicant, int mathGrade, int chemistryGrade, int biologyGrade) {
        this.applicant = applicant;
        this.mathGrade = mathGrade;
        this.chemistryGrade = chemistryGrade;
        this.biologyGrade = biologyGrade;
        this.average = (this.mathGrade + this.chemistryGrade + this.biologyGrade) / 3;

    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public int getAverage() {
        this.average = (this.mathGrade + this.chemistryGrade + this.biologyGrade) / 3;
        return average;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public void setAverage(int average) {
        this.average = (this.mathGrade + this.chemistryGrade + this.biologyGrade) / 3;
        this.average = average;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant() {
        return applicant;
    }

}
