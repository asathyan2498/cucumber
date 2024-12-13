# Cucumber Maven Project

## Description
This project demonstrates a Cucumber-Selenium framework for automating UI tests on eBay's advanced search page. The framework uses:
- **Cucumber**: To write test scenarios in Gherkin syntax.
- **Selenium**: To interact with the browser.
- **Maven**: For dependency management.
- **JUnit**: For running the tests.

---

## Prerequisites
To set up and run this project, you need the following:
1. **Java**:
    - Install JDK 8 or later from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [Adoptium](https://adoptium.net/).
    - Verify installation:
      ```sh
      java -version
      ```
2. **Maven**:
    - Install Maven from [Apache Maven](https://maven.apache.org/download.cgi).
    - Verify installation:
      ```sh
      mvn -version
      ```
3. **Google Chrome**:
    - Install the latest version of Google Chrome.
4. **Chromedriver**:
    - Download the Chromedriver compatible with your Chrome browser version from [Google Chrome Labs](https://googlechromelabs.github.io/chrome-for-testing/#stable).
    - Place the `chromedriver.exe` file in the `webdrivers/` folder located in the project root.

---

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/cucumber-maven-project.git

cucumber-maven-project
├── pom.xml                 # Maven configuration file
├── webdrivers/             # Folder for Chromedriver
│   └── chromedriver.exe    # Chromedriver executable
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── steps/      # Step definitions package
│   │   │   │   ├── Hooks.java
│   │   │   │   └── EbayAdvancedSearchSteps.java
│   │   │   └── runner/     # Test runner package
│   │   │       └── TestRunner.java
│   │   └── resources/
│   │       └── features/   # Gherkin feature files
│   │           └── search.feature
