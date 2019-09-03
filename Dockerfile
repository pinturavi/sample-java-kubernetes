FROM openjdk:8-jre-alpine

RUN mkdir /opt/data

VOLUME /opt/data

WORKDIR /opt

COPY ./target/java-sample-0.0.1-SNAPSHOT.jar ./sample.jar

ENV LOCATION /opt/data/application.properties

CMD ["java", "-jar", "sample.jar"]