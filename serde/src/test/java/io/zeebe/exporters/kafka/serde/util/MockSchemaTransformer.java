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
package io.zeebe.exporters.kafka.serde.util;

import com.google.protobuf.Message;
import io.zeebe.exporter.record.Record;
import io.zeebe.exporters.kafka.serde.SchemaTransformer;

public class MockSchemaTransformer implements SchemaTransformer<Record, Message> {
  private Record lastTransformed;
  private Message message;

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Record getLastTransformed() {
    return lastTransformed;
  }

  @Override
  public Message transform(Record record) {
    lastTransformed = record;
    return message;
  }
}