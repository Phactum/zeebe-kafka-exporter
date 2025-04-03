FROM --platform=${BUILDPLATFORM} ubuntu:noble AS base
RUN echo ${BUILDPLATFORM}
RUN apt-get update && apt-get install -y apt-transport-https && apt-get install -y socat

FROM maven:3.9.9-eclipse-temurin-17-alpine AS build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
RUN mvn dependency:copy -Dartifact=com.phactum.zeebe:zeebe-kafka-exporter:8.6.0:jar:jar-with-dependencies -DoutputDirectory=$HOME

FROM camunda/zeebe:8.6.9
USER root
COPY --from=base /usr/bin/socat /usr/bin/socat
#RUN socat tcp-1:29092,fork kafka:29092 &
COPY --from=build /usr/app/zeebe-kafka-exporter-8.6.0-jar-with-dependencies.jar /usr/local/zeebe/exporters/zeebe-kafka-exporter.jar
USER 1001:1001
