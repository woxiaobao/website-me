FROM openjdk:8-jdk
WORKDIR /app
COPY ./target/myapp.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "myapp.jar"]