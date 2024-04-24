FROM openjdk:22-jdk
ADD target/spring-postgres-docker.jar spring-postgres-docker.jar
ENTRYPOINT ["java","-jar","/spring-postgres-docker.jar"]