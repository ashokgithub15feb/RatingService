FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/RatingService-0.0.1-SNAPSHOT.jar ratingService.jar
ENTRYPOINT [ "java","-jar","/ratingService.jar" ]