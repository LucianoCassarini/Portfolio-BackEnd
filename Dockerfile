FROM amazoncorretto:17-alpine-jdk

MAINTAINER lcassarini

COPY target/lgc-0.0.1-SNAPSHOT.jar lgc-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/lgc-0.0.1-SNAPSHOT.jar"]
