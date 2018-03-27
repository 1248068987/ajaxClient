# Base image to use, this must be set as the first line
FROM java:8

VOLUME /tmp

ADD ajaxclient-0.0.1-SNAPSHOT.jar /app.jar

# EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
