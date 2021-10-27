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

public class StudentGrade {
    private String name;
    private int mathGrade;
    private int chemistryGrade;
    private int biologyGrade;
    private boolean passed;

    public StudentGrade() {
    }

    public StudentGrade(String name, int mathGrade, int chemistryGrade, int biologyGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.chemistryGrade = chemistryGrade;
        this.biologyGrade = biologyGrade;
        this.passed = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathGrade() {
        return this.mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getChemistryGrade() {
        return this.chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public int getBiologyGrade() {
        return this.biologyGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public boolean isPassed() {
        return this.passed;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

}
