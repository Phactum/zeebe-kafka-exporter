FROM maven:3.9.9-eclipse-temurin-17-alpine AS build
ENV HOME=/usr/app
RUN mkdir -p $HOME
RUN mvn dependency:copy -Dartifact=com.phactum.zeebe:zeebe-kafka-exporter:8.7.0:jar:jar-with-dependencies -DoutputDirectory=$HOME

FROM camunda/zeebe:8.7.15
USER root
#COPY zeebe-kafka-exporter-8.7.0-SNAPSHOT-jar-with-dependencies.jar /usr/local/zeebe/exporters/zeebe-kafka-exporter.jar
COPY --from=build /usr/app/zeebe-kafka-exporter-8.7.0-jar-with-dependencies.jar /usr/local/zeebe/exporters/zeebe-kafka-exporter.jar
USER 1001:1001
