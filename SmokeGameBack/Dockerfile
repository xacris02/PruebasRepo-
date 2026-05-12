# Etapa 1: Dependencias y Compilación (Usamos la imagen oficial de Maven)
FROM maven:3.9.5-eclipse-temurin-17 AS compile
WORKDIR /app

# Copiamos solo el pom.xml y descargamos las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiamos el código fuente y compilamos el proyecto
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Producción (Imagen final súper liviana)
FROM eclipse-temurin:17-jre AS prod
WORKDIR /app

# Copiamos SOLAMENTE el .jar generado en la etapa anterior
COPY --from=compile /app/target/*.jar /app.jar

# Exponemos el puerto de Spring Boot
EXPOSE 8080

# Comando para iniciar la aplicación
CMD ["java", "-jar", "/app.jar"]
