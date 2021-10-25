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

public class SchoolScore {
    private int math;

    private int bio;

    private int chem;

    private boolean passed = false;

    public SchoolScore() {

    }

    public SchoolScore(int math, int bio, int chem) {
        this.math = math;
        this.bio = bio;
        this.chem = chem;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getBio() {
        return this.bio;
    }

    public void setBio(int bio) {
        this.bio = bio;
    }

    public int getChem() {
        return this.chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public boolean isPassed() {
        return this.passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
