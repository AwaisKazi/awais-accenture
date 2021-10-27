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

public class StudentApplication {

    private String name;
    private int grade;
    private int mathScore;
    private int bioScore;
    private int chemScore;
    private int historyScore;
    private boolean approved = false;

    private StudentApplication() {

    }

    public StudentApplication(String name, int grade, int mathScore, int bioScore, int chemScore, int historyScore) {
        this.name = name;
        this.grade = grade;
        this.mathScore = mathScore;
        this.bioScore = bioScore;
        this.chemScore = chemScore;
        this.historyScore = historyScore;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMathScore() {
        return this.mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getBioScore() {
        return this.bioScore;
    }

    public void setBioScore(int bioScore) {
        this.bioScore = bioScore;
    }

    public int getChemScore() {
        return this.chemScore;
    }

    public void setChemScore(int chemScore) {
        this.chemScore = chemScore;
    }

    public int getHistoryScore() {
        return this.historyScore;
    }

    public void setHistoryScore(int historyScore) {
        this.historyScore = historyScore;
    }

    public boolean isApproved() {
        return this.approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}
