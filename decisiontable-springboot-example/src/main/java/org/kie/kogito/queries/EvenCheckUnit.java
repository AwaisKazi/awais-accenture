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

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class EvenCheckUnit implements RuleUnitData {

    private DataStore<EvenCheck> evenChecks;

    public EvenCheckUnit() {
        this(DataSource.createStore());
    }

    public EvenCheckUnit(DataStore<EvenCheck> evenChecks) {
        this.evenChecks = evenChecks;
    }

    public DataStore<EvenCheck> getEvenChecks() {
        return evenChecks;
    }

    public void setEvenChecks(DataStore<EvenCheck> evenChecks) {
        this.evenChecks = evenChecks;
    }

}
