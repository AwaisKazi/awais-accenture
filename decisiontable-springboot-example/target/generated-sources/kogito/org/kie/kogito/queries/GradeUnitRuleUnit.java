/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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

import org.drools.core.ClockType;
import org.drools.core.RuleBaseConfiguration;
import org.drools.core.SessionConfigurationImpl;
import org.drools.core.impl.EnvironmentImpl;
import org.drools.core.impl.InternalKnowledgeBase;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionsPool;
import org.kie.kogito.rules.RuleEventListenerConfig;
import org.kie.kogito.rules.units.impl.AbstractRuleUnit;

@org.springframework.stereotype.Component()
public class GradeUnitRuleUnit extends AbstractRuleUnit<GradeUnit> {

    private static final InternalKnowledgeBase kb = createKnowledgeBase();

    @org.springframework.beans.factory.annotation.Autowired()
    public GradeUnitRuleUnit(org.kie.kogito.Application app) {
        super(GradeUnit.class.getCanonicalName(), app);
    }

    public org.kie.kogito.queries.GradeUnitRuleUnitInstance internalCreateInstance(GradeUnit value) {
        return new org.kie.kogito.queries.GradeUnitRuleUnitInstance(this, value, createLegacySession());
    }

    private KieSession createLegacySession() {
        SessionConfigurationImpl sessionConfig = new SessionConfigurationImpl();
        sessionConfig.setClockType(org.drools.core.ClockType.REALTIME_CLOCK);
        KieSession ks = kb.newKieSession(sessionConfig, new EnvironmentImpl());
        ((org.drools.core.impl.KogitoStatefulKnowledgeSessionImpl) ks).setStateless(/*$IsStateful$*/
        true);
        ((org.drools.core.impl.KogitoStatefulKnowledgeSessionImpl) ks).setApplication(app);
        org.kie.kogito.Config config = app.config();
        if (config != null) {
            RuleEventListenerConfig ruleEventListenerConfig = config.get(org.kie.kogito.rules.RuleConfig.class).ruleEventListeners();
            ruleEventListenerConfig.agendaListeners().forEach(ks::addEventListener);
            ruleEventListenerConfig.ruleRuntimeListeners().forEach(ks::addEventListener);
        }
        return ks;
    }

    private static InternalKnowledgeBase createKnowledgeBase() {
        RuleBaseConfiguration ruleBaseConfig = new RuleBaseConfiguration();
        ruleBaseConfig.setEventProcessingMode(org.kie.api.conf.EventProcessingOption.CLOUD);
        ruleBaseConfig.setSessionPoolSize(-1);
        InternalKnowledgeBase kb = org.drools.modelcompiler.builder.KieBaseBuilder.createKieBaseFromModel(new org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7_GradeUnit(), ruleBaseConfig);
        return kb;
    }
}
