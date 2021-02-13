FROM openjdk:8
MAINTAINER FELIPE LEITAO<vieira.felipe@gmail.com>
ADD target/vepilef-springboot.jar	vepilef-springboot.jar
COPY	target/vepilef-springboot.jar	vepilef-springboot.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "vepilef-springboot.jar"]