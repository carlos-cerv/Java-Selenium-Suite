# Java Selenium - E2E Suite

In the Maven project, you can create and run tests the same way you do in any other project using the default IntelliJ IDEA test runner.

Open source documentation: [Selenium](https://www.selenium.dev/),[Java](https://www.java.com/es/),[JDK](https://www.java.com/es/) .


## Pre-Conditions & Resources:

- [Install IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Install JDK](https://www.oracle.com/mx/java/technologies/downloads/)
- [Install Git](https://git-scm.com/downloads)
- [Install Maven](https://maven.apache.org/download.cgi)
- [Maven Repository](https://mvnrepository.com/)

## Set Up the Project:

1. Clone the project:

   `git clone https://github.com/carlos-cerv/Java-Selenium.git`

2. Open the project and run the next command in the terminal to install the libraries from package.json:

   `mvn clean install -U`

3. In the root folder create a new file with the next name:

   `.env`

   Update with your information and validate correct URL used locally, consider next base example:

   `URL_TESTPAGE=`

   `USER_PAGE=`

   `PASSWORD=`

4. Open the .env file and add the next variables. In BASE_URL add the home page url, in USER_SUCCESS and PASSWORD_SUCCESS add a valid email and password to login successfully to test application:

   `BASE_URL=https://baseurl.com/`

   `USER_SUCCESS=validuser@email.com`

   `PASSWORD_SUCCESS=validpassword`

## Run the Test Cases Scripts: Maven 3.9.0

5. Open the terminal and add the next commands to run the test scripts:

   `mvn test` : run existing test scripts