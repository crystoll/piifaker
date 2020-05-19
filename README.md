# Vault76 test data generator API

## How to use?

This is typical Maven+Spring Boot project. You need at least Java 14. You can compile, package project with your normal commands:

```
./mvnw compile
./mvnw test
./mvnw package
./mvnw spring-boot:run
```

Once running, app should respond in port 8080. So point your browser to http://localhost:8080/person for a quick test. It should generate and return Person construct as JSON.

