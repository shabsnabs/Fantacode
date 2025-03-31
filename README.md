 Amazon Automation project. 

### README.md


# Amazon Automation Project 

## Project Overview
This project automates the testing of Amazon's website using **Selenium WebDriver** with **TestNG** in **Java**. It verifies the following scenarios:-
Uses the design pattern Page Object Model (POM) with PageFactory
- Search and filter AmazonBasics products.
- Select amazon basics product and verify product details.
- Add to cart and confirm the cart contains the correct item.
---
## Technologies Used-Programming Language: Java,Build Tool: Maven,Testing Framework: TestNG,Web Automation: Selenium WebDriver,Browser Drivers: Chrome( WebDriverManager)
---

## Project Structure
www.fantacode.com
     # Page classes (POM)
         # Amazon home page actions
         # Amazon cart verification
         # Amazon product page interactions
    # Config file with URL and settings(Configure Browser and URL)
        # Test execution classes
        # Test cases 
        # BaseClass
        # TestNG configuration suite
        #testNG.xml       
    CAPTCHA Handling:
   - If the website asks for CAPTCHA verification, need to manually resolve it or implement a wait mechanism


The project structure is organized into the following folders and files:

---
Root Directory: `www.fantacode.com`
- The main project folder that contains all the source code, configuration files, and dependencies.

---

`src` Folder
- This is the source folder containing the main and test code, as well as configuration resources.

---

`main` Folder
- Contains the core implementation files used in the automation project.

####  `java`
- Holds the **Page Object Model (POM)** classes that define the actions and elements for different pages on the Amazon website.

#####  `pageClass`
- **`AmazonHome.java`:** Contains methods for interacting with the Amazon homepage (e.g., searching for products).
- **`AmazonCart.java`:** Handles cart-related actions, such as verifying items in the cart.
- **`ProductPage.java`:** Contains actions specific to the product details page, such as selecting a product and adding it to the cart.

####  `resources`
- Contains the configuration files required for the project.
- **`Config.properties`:** Stores environment-specific configurations, such as the Amazon website URL.

---

###  **`test` Folder**
- Contains the **test classes** and execution configurations.

####  `java`
- Holds the test classes responsible for executing the automated test cases.

#####  `ExecuteTestClass`
- **`AmazonTestClass.java`:** Contains the test methods that automate and validate Amazon product searches, selections, and cart operations.
- **`BaseClass.java`:** Sets up and tears down the WebDriver, handles browser initialization, and manages test configuration.
- **`Full.java`:** (Optional) An additional test execution class, which may contain more test cases.

####  `resources`
- Contains the **TestNG configuration suite**:
- **`testngFantacode.xml`:** Defines the test suite, parameters, and test execution configuration.

---

### 📄 **Other Files in the Project**
- **`pom.xml`:**
  - Maven configuration file containing the dependencies for Selenium, TestNG, WebDriverManager, and other required libraries.
- **`README.md`:**
  - The documentation file containing instructions, setup steps, and execution guidelines.

 .
---
## Prerequisites 
Before running the project, ensure you have the following installed:
- **Java JDK (11 or higher)**: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven**: [Install Maven](https://maven.apache.org/download.cgi)
- **IDE:** IntelliJ IDEA, Eclipse, or VS Code
- **Browser:** Chrome  (Ensure the browser versions are up to date)
- **TestNG Plugin:** Install TestNG plugin in your IDE


###  **Execute the Test**
- Run the project using TestNG in IDE:

  - Right-click `testngFantacode.xml`
  - Select Run As > TestNG Suite


### pom.xml
Ensure you have the following dependencies in your `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.10.0</version>
    </dependency>

    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.5.0</version>
    </dependency>

    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.8.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

##  **TestNG Execution Suite**
`testngFantacode.xml`:
```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="SuiteFantacode" parallel="classes" thread-count="5">
    <test name="Amazon Tests">
        <parameter name="browser" value="Chrome"/>
        <classes>
            <class name="ExecuteTestClass.AmazonTestClass"/>
        </classes>
    </test>
</suite>
```

---

## **Author
👩‍💻 **Shabana Sulthana**  
📧 shabanassl@gmail.com  
📁 [GitHub Profile](https://github.com/your-profile)

