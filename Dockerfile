FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN ./gradlew build --no-daemon

CMD ["java", "-jar", "build/libs/match-service-0.1-all.jar"]
