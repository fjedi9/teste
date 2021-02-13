FROM openjdk:8
MAINTAINER RODRIGO TENORIO DE BOA VENTURA<boaventura19@yahoo.com.br>
ADD target/PlatformBuilders-springboot.jar	PlatformBuilders-springboot.jar
COPY	target/PlatformBuilders-springboot.jar	PlatformBuilders-springboot.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "PlatformBuilders-springboot.jar"]