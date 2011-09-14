/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.data.patient.service;

import org.openmrs.module.reporting.data.patient.EvaluatedPatientData;
import org.openmrs.module.reporting.data.patient.definition.PatientDataDefinition;
import org.openmrs.module.reporting.definition.service.BaseDefinitionService;
import org.openmrs.module.reporting.definition.service.DefinitionService;
import org.openmrs.module.reporting.evaluation.Definition;
import org.openmrs.module.reporting.evaluation.EvaluationContext;
import org.openmrs.module.reporting.evaluation.EvaluationException;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.springframework.transaction.annotation.Transactional;

/**
 *  Base Implementation of the PersonQueryService API
 */
public class PatientDataServiceImpl extends BaseDefinitionService<PatientDataDefinition> implements PatientDataService {

	/**
	 * @see DefinitionService#getDefinitionType()
	 */
	public Class<PatientDataDefinition> getDefinitionType() {
		return PatientDataDefinition.class;
	}
	
	/**
	 * @see DefinitionService#evaluate(Definition, EvaluationContext)
	 */
	@Transactional(readOnly = true)
	public EvaluatedPatientData evaluate(PatientDataDefinition definition, EvaluationContext context) throws EvaluationException {
		return (EvaluatedPatientData)super.evaluate(definition, context);
	}
	
	/**
	 * @see DefinitionService#evaluate(Mapped<Definition>, EvaluationContext)
	 */
	@Transactional(readOnly = true)
	public EvaluatedPatientData evaluate(Mapped<? extends PatientDataDefinition> mappedDefinition, EvaluationContext context) throws EvaluationException {
		return (EvaluatedPatientData)super.evaluate(mappedDefinition, context);
	}
}
