FROM openjdk:17-jdk-slim
ARG JAR_FILE_PATH=build/libs/*.jar
COPY ${JAR_FILE_PATH} app.jar
CMD ["java","-jar", "app.jar"]


