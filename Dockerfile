FROM openjdk:11
COPY ${JAR_FILE} /departmentserver.jar
ENTRYPOINT [ "java" ,"-jar" ,"/departmentserver.jar" ]
EXPOSE 8084
