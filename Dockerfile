FROM openjdk:11
VOLUME /tmp
EXPOSE 8090
ADD ./target/springboot-servicio-gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver.jar
ENTRYPOINT ["java","-jar","/gatewayserver.jar"]