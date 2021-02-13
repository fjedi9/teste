FROM openjdk:8
MAINTAINER FELIPE LEITAO<vieira.felipe@gmail.com>
ADD target/vepilef.jar	vepilef.jar
COPY	target/vepilef.jar	vepilef.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "vepilef.jar"]