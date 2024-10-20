FROM openjdk:21-jdk
LABEL maintainer="ismailrzouki7@gmail.com"

ARG SPRING_PROFILES_ACTIVE
ENV SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}


COPY target/*.jar app.jar
COPY /src/main/resources/test.txt /deployment/test.txt
ENTRYPOINT ["java", "-jar", "app.jar"]