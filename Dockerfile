FROM alpine:3.18

RUN apk add openjdk17

COPY build/libs/cats-api-kuber.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]