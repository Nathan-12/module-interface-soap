FROM openjdk:17-ea-10-jdk-slim
WORKDIR /app
COPY --from=build ./app/target/*.jar ./module-interface-soap-0.0.1-SNAPSHOT.jar
ENTRYPOINT java -jar module-interface-soap-0.0.1-SNAPSHOT.jar