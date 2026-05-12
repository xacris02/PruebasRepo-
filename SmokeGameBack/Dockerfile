# Etapa 1: Dependencias y Compilación
FROM eclipse-temurin:17-jdk AS compile
WORKDIR /app

# Copiamos los archivos de Maven
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Damos permisos al wrapper y descargamos dependencias
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline -B

# Copiamos el código fuente y compilamos el JAR
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Etapa 2: Producción (Imagen final súper liviana)
FROM eclipse-temurin:17-jre AS prod
WORKDIR /app

# Copiamos SOLAMENTE el .jar generado en la etapa anterior
COPY --from=compile /app/target/*.jar /app.jar

# Exponemos el puerto de Spring Boot
EXPOSE 8080

# Comando para iniciar la aplicación
CMD ["java", "-jar", "/app.jar"]
