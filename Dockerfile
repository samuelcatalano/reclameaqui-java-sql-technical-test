FROM openjdk:8-jdk-alpine

MAINTAINER Samuel Catalano <samuel.catalano@reclameaqui.com.br>

VOLUME /tmp
ADD target/reclameaqui-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]