FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# 로컬에서 빌드된 JAR 파일을 복사
COPY ./build/libs/*.jar app.jar

# 컨테이너 실행 시 JAR 파일을 실행
ENTRYPOINT ["java", "-jar", "app.jar"]