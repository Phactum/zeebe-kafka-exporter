# Camunda 8 Self-Managed - Docker Compose

## Usage

For end user usage, please check the official documentation of [Camunda 8 Self-Managed Docker Compose](https://docs.camunda.io/docs/self-managed/quickstart/developer-quickstart/docker-compose/).

## Known Issues

If docker build fails on MacOS with error message:
```
failed to solve: maven:3.9.9-eclipse-temurin-17-alpine: failed to resolve source metadata for docker.io/library/maven:3.9.9-eclipse-temurin-17-alpine: no match for platform in manifest: not found
```
then you have to adopt `docker-compose.yaml` by adding platform definition:

```yaml
  orchestration: # Consolidated Zeebe + Operate + Tasklist - https://docs.camunda.io/docs/self-managed/setup/deploy/other/docker/#zeebe
    platform: linux/amd64
```

## Changes done

In this copy of Camunda platform 8.8.8. These changes have been applied:

1. renamed `docker-compose.yaml` to `docker-compose-min.yaml`
1. copied `docker-compose-full.yaml` to `docker-dompose.yaml`
1. deactivated `Optimize`, `Webmodeler` and `Console`
2. added Kafka 3.7.2 single-node
3. updated service dependencies
4. changed image of `Orchestration` to custom image from [./orchestration/Dockerfile](./orchestration/Dockerfile)
5. customized `application.yaml` (see [./exporters/README.md](./exporters/README.md))

