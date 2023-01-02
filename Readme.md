# Verify Legend With Map

## Technology:
- Tool: Selenium WebDriver
- IDE: IntelIJ IDEA
- Build tool: Gradle
- Language: Java
- Test runner: TestNG

## Prerequisite:
1. Need to install jdk 11, gradle and allure
2. Configure Environment variable for jdk 11, gradle and allure
3. Need good internet connectivity
4. Clone this project and unzip it
5. Open the project folder
6. Double-click on "build.gradle" and open it through IntelliJ IDEA
7. Let the project build successfully
8. Click on "Terminal" and run the automation scripts

## Run the automation script:
1. Type the command:

```sh
gradle clean test
```
2. Selenium will open the browser and start automation
3. To view report, type this command one after another:
```sh
allure generate allure-results --clean -o allure-report
allure serve allure-results
```
4. Navigate to "allure-report" folder
5. Open index.html in a browser to view report

## Here is the "Allure Report" of my project:
![img.png](img.png)
![img_1.png](img_1.png)