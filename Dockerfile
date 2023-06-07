FROM openjdk:11
EXPOSE 8080
ADD target/cloudrun-springboot.jar cloudrun-springboot.jar
ENTRYPOINT["java","-jar","cloudrun-springboot.jar"]