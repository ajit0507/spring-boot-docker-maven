FROM openjdk:8
EXPOSE 7001
ADD target/spring-boo-docker-maven.jar spring-boo-docker-maven.jar
ENTRYPOINT [ "java","-jar","spring-boo-docker-maven.jar" ]