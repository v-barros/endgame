FROM amazoncorretto:19.0.2-alpine3.17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} "app.jar"
ENTRYPOINT ["java","-jar","/app.jar"]