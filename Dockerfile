#Imágen base a utilizar
FROM openjdk:20-ea-11-oraclelinux8 as builder
#Información del equipo de contacto
LABEL maintainer="antoniohdezcts@icloud.com"
#Archivo Jar de la aplicación(Será asignado por el #pluging de Maven)
ARG JAR_FILE
#Agregar el Jar al contenedor
COPY ${JAR_FILE} /store-selling-products-1.0.1-SNAPSHOT.jar
#Ejecución de la aplicación
ENTRYPOINT ["java","-jar","/store-selling-products-1.0.1-SNAPSHOT.jar"]