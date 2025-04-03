# Camunda 8 Self-Managed - Docker Compose

## Usage

For end user usage, please check the offical documentation of [Camunda 8 Self-Managed Docker Compose](https://docs.camunda.io/docs/8.6/self-managed/setup/deploy/local/docker-compose/).

## Changes

In this copy of Camunda platform 8.6.9 these changes have been applied:

1. All containers restart policy is set to `no`.
1. Tenants enabled.
1. Kafka 3.7.2 added, configured to listen on localhost:9092.
1. Kafka exporter added to Zeebe.<br>
   For topic configuration see [exporter.yml](./exporters/exporter.yml).
