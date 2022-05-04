FROM openjdk:11
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} DepartmentServer.jar
ENTRYPOINT [ "java" ,"-jar" ,"/DepartmentServer.jar" ]
EXPOSE 8084