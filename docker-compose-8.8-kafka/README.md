# Camunda 8 Self-Managed - Docker Compose

## Usage

For end user usage, please check the official documentation of [Camunda 8 Self-Managed Docker Compose](https://docs.camunda.io/docs/self-managed/quickstart/developer-quickstart/docker-compose/).

## Changes done

Provide ready-to-use `docker-compose.yaml`:

1. renamed `docker-compose.yaml` to `docker-compose-min.yaml`
1. copied `docker-compose-full.yaml` to `docker-dompose.yaml`
1. deactivated `Optimize`, `Webmodeler` and `Console`
2. added Kafka 3.7.2 single-node
3. updated service dependencies
4. changed image of `Orchestration` to custom image from [./orchestration/Dockerfile](./orchestration/Dockerfile)
5. customized `application.yaml` (see [./exporters/README.md](./exporters/README.md))

