FROM openjdk:17
ADD target/docker-fo-configserver-0.0.1-SNAPSHOT.jar docker-fo-configserver-1.0.0.jar
EXPOSE 8888
ENTRYPOINT [ "java", "-jar", "docker-fo-configserver-1.0.0.jar" ]