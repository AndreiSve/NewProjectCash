FROM openjdk:19-jdk-slim
WORKDIR /app
COPY target/NewProjectCash.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080