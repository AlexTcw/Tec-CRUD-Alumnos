# Usamos una imagen de Maven como base
FROM maven:3.8.4-openjdk-17-slim
# Directorio de trabajo dentro del contenedor
WORKDIR /app
# Copiamos el archivo pom.xml al directorio de trabajo
COPY pom.xml .
# Descargamos las dependencias del proyecto
RUN mvn dependency:go-offline
# Copiamos todo el código fuente al directorio de trabajo
COPY src ./src
# Ejecutamos los comandos maven
RUN mvn clean install
RUN mvn clean package

#establecemos java
FROM openjdk:17

WORKDIR /app

COPY target/com.alumnos.system-1.0.jar /app/com.alumnos.system-1.0.jar

EXPOSE 8082

CMD ["java", "-jar", "com.alumnos.system-1.0.jar"]
