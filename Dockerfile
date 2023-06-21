gFROM maven:3.6.3-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim-sid
COPY --from=build /target/ensa-0.0.1-SNAPSHOT.jar ensa.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "ensa.jar"]