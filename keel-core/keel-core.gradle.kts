/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  `java-library`
  id("kotlin-spring")
}

dependencies {
  api(project(":keel-api"))
  api("com.fasterxml.jackson.core:jackson-databind")
  api("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
  api("com.fasterxml.jackson.module:jackson-module-kotlin")
  api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
  api("de.danielbechler:java-object-diff")
  api("org.springframework:spring-context")
  api("org.springframework.boot:spring-boot-autoconfigure")
  api("com.netflix.frigga:frigga")
  api("com.netflix.spinnaker.kork:kork-core")
  api("net.swiftzer.semver:semver:1.1.0")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j")
  api("org.apache.commons:commons-lang3")
  api("com.github.ben-manes.caffeine:caffeine")

  implementation("org.springframework:spring-tx")
  implementation ("io.github.resilience4j:resilience4j-kotlin")
  implementation ("io.github.resilience4j:resilience4j-retry")
  implementation("com.newrelic.agent.java:newrelic-api:6.1.0")

  testImplementation(project(":keel-test"))
  testImplementation(project(":keel-core-test"))
  testImplementation("io.strikt:strikt-jackson")
  testImplementation("dev.minutest:minutest")

  testImplementation("org.assertj:assertj-core")
  testImplementation("org.springframework.boot:spring-boot-test-autoconfigure")
}
