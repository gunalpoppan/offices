FROM eclipse-temurin:17
COPY target/office.jar office.jar
CMD [ "java","-jar","office.jar" ]
