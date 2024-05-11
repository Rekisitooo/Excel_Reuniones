FROM openjdk:17
EXPOSE 8080
ADD target/excelReuniones.jar excelReuniones.jar
ENTRYPOINT ["java", "-jar", "/excelReuniones.jar"]  