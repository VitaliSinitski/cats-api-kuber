./gradlew clean build
docker build . -t vitalisin/cats-api:1.0.0
docker push vitalisin/cats-api:1.0.0