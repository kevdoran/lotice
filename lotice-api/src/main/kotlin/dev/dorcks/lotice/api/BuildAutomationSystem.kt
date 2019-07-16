/*
 * Copyright 2019 dev.dorcks Lotice
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.dorcks.lotice.api

import dev.dorcks.lotice.api.dependency.DependencyScanner
import dev.dorcks.lotice.api.dependency.DependencySource

interface BuildAutomationSystem : DependencySource, DependencyScanner {

    /**
     * Queries the [Set] of [DependencySource]s of the [BuildAutomationSystem] and must contain zero null elements.
     *
     * @return A [Set] of [DependencySource]s containing zero null elements
     */

    fun getDependencySources(): Set<DependencySource>
    val fileExtension: String
}