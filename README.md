Alice and Her Bakery – Spring Boot Dependency Injection Demo

This project demonstrates clean, configuration-driven Dependency Injection in Spring Boot using a simple bakery domain model.

The application uses:

* Interfaces (Frosting, Syrup)
* Multiple implementations (Chocolate & Strawberry flavors)
* Dynamic bean loading using @ConditionalOnProperty
* Externalized configuration via application.properties
* By changing configuration values, the application dynamically switches between different frosting and syrup implementations without modifying any Java code.

Key Concepts Covered

* Spring Boot Dependency Injection (Constructor-based)
* Interface-driven design
* Multiple bean implementations
* @ConditionalOnProperty for runtime bean selection abd @Qualifier
* Externalized configuration (application.properties)
* Clean separation of concerns

Open/Closed Principle in practice
