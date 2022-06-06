FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} departmentserver.jar
ENTRYPOINT ["java","-jar","/departmentserver.jar"]
EXPOSE 8084
