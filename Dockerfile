FROM amazoncorretto:11-alpine-jdk
MAINTAINER JNLA
COPY jnla-0.0.1-SNAPSHOT.jar jnla-app.jar
ENTRYPOINT ["java","-jar","/jnla-app.jar"]
EXPOSE 8080