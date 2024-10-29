# Use a lightweight JRE for running the application
FROM openjdk:8-jre

# Expose port 8084 for the application
EXPOSE 8084

# Copy the built JAR file from the package stage to the new image
# The JAR file is named based on the artifactId and version
COPY target/service-two.jar /app.jar

# Ensure the JAR file is accessible
RUN /bin/sh -c 'touch /app.jar'

# Define the command to run the application, setting memory limits and specifying the JAR file
ENTRYPOINT ["java", "-Xmx256m", "-Xss32m", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
