# Google Search Automation with Cucumber & Selenium

This project demonstrates automated testing of Google Search functionality using **Cucumber (BDD)** and **Selenium WebDriver** in Java.

## 📂 Project Structure
- **Stepdefinition/google.java**  
  Contains step definitions for navigating to Google, entering a search term, and clicking the search button.

## ⚙️ Prerequisites
- Java 8 or higher
- Maven/Gradle (for dependency management)
- Chrome browser
- ChromeDriver (compatible with your Chrome version)
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 📦 Dependencies
Add the following to your `pom.xml` (Maven):
```xml
<dependencies>
    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.15.0</version>
    </dependency>

    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.14.0</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.14.0</version>
        <scope>test</scope>
    </dependency>

    <!-- JUnit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
