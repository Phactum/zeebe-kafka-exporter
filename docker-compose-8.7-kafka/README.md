# Camunda 8 Self-Managed - Docker Compose

## Usage

For end user usage, please check the official documentation of [Camunda 8 Self-Managed Docker Compose](https://docs.camunda.io/docs/8.6/self-managed/setup/deploy/local/docker-compose/).

## Known Issues

If docker build fails on MacOS with error message:
```
failed to solve: maven:3.9.9-eclipse-temurin-17-alpine: failed to resolve source metadata for docker.io/library/maven:3.9.9-eclipse-temurin-17-alpine: no match for platform in manifest: not found
```
then you have to adopt `docker-compose.yaml` by adding platform definition:

```yaml
  zeebe: # https://docs.camunda.io/docs/self-managed/platform-deployment/docker/#zeebe
    platform: linux/amd64
```

## Changes

In this copy of Camunda platform 8.7.15 these changes have been applied:

1. All containers restart policy is set to `no`.
1. Tenants enabled.
1. Kafka 3.7.2 added, configured to listen on localhost:9092.
1. Kafka exporter added to Zeebe.<br>
   For topic configuration see [exporter.yml](./exporters/exporter.yml).
