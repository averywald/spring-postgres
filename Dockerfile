# #Build stage
# FROM gradle:latest AS BUILD
# WORKDIR /usr/app/
# COPY . . 
# RUN gradle build

# # Package stage
# FROM openjdk:latest

# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring

# ENV JAR_NAME=app.jar
# ENV APP_HOME=/usr/app/
# WORKDIR $APP_HOME
# COPY --from=BUILD $APP_HOME .

# EXPOSE 8080
# # CMD "exec java -jar $APP_HOME/build/libs/$JAR_NAME"
# ENTRYPOINT ["java","-jar","/app.jar"]


FROM openjdk:21
WORKDIR /spring-web
CMD ["./gradlew", "clean", "bootJar"]
COPY ./build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]