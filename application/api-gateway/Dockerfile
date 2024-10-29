FROM openjdk:8-jre-alpine

# Expose port 8080 for the application
EXPOSE 8080

# Copy the built JAR file from the packaging stage to the new image
COPY target/api-gateway.jar app.jar

# Ensure the JAR file is accessible
RUN /bin/sh -c 'touch /app.jar'

# Define the command to run the application, setting memory limits and specifying the JAR file
ENTRYPOINT ["java", "-Xmx256m", "-Xss32m", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
