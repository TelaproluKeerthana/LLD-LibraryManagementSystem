# Library Management System — LLD (Java scaffold)

This folder is a minimal Java (Maven) scaffold for a Low-Level Design (LLD) project.

Quick commands (PowerShell):

```powershell
cd java
mvn -v
mvn clean package
mvn test
java -cp target/library-management-0.1.0.jar com.example.library.App
```

What’s included:
- `pom.xml` — Maven build file (Java 17, JUnit 5)
- `src/main/java/com/example/library/App.java` — sample entry point
- `src/test/java/com/example/library/AppTest.java` — sample unit test

Next steps:
- Replace `com.example.library` package with your preferred package name
- Add modules like `domain`, `service`, `repository`, and unit tests
- Consider converting to Gradle if preferred
