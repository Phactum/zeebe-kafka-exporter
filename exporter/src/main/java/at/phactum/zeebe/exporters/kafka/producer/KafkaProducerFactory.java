/*
 * Copyright © 2019 camunda services GmbH (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.phactum.zeebe.exporters.kafka.producer;

import at.phactum.zeebe.exporters.kafka.config.ProducerConfig;
import at.phactum.zeebe.exporters.kafka.serde.RecordId;
import org.apache.kafka.clients.producer.Producer;

/**
 * Implementations may or may not make use of the given configuration, but must always return a
 * valid producer.
 */
@FunctionalInterface
public interface KafkaProducerFactory {

  Producer<RecordId, byte[]> newProducer(final ProducerConfig config, final String producerId);

  static KafkaProducerFactory defaultFactory() {
    return new DefaultKafkaProducerFactory();
  }
}
