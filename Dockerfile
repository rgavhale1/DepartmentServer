FROM openjdk:11
ADD target/departmentserver.jar departmentserver.jar
ENTRYPOINT [ "java" ,"-jar" ,"/departmentserver.jar" ]
EXPOSE 8084
