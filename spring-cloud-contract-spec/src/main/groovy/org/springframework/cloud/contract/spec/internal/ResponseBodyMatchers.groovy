/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.contract.spec.internal

import groovy.transform.CompileStatic
import groovy.transform.ToString

/**
 * Body matchers for the response side (output message, REST response)
 *
 * @author Marcin Grzejszczak
 * @author Tim Ysewyn
 * @since 1.0.3
 */
@CompileStatic
@ToString(includePackage = false, includeSuper = true)
class ResponseBodyMatchers extends BodyMatchers {

	MatchingTypeValue byType() {
		return new MatchingTypeValue(type: MatchingType.TYPE)
	}

	MatchingTypeValue byCommand(String execute) {
		return new MatchingTypeValue(MatchingType.COMMAND, new ExecutionProperty(execute))
	}

	MatchingTypeValue byNull() {
		return new MatchingTypeValue(MatchingType.NULL, null)
	}
}
