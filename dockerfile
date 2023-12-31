# docker image
FROM maven:3.8.5-openjdk-17 as builder
COPY . .
RUN mvn clean package -DskipTests

# using java to run the application
FROM openjdk:17.0.1-jdk-slim
COPY --from=builder /target/chatty-0.0.1-SNAPSHOT.jar chatty.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","chatty.jar"]