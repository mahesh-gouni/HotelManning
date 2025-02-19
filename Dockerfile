FROM openjdk:17-jdk-alpine

# Copy the runnable JAR file into the cogintainer
COPY ./target/HotelManningMahiDev-0.0.1-SNAPSHOT.jar hotel.jar

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/hotel.jar"]

EXPOSE 8085