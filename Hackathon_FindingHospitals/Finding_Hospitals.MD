**Project Name: Finding Hospitals(Practo.com)**


# Overview
This project aims to automate different scenarios in the website Practo.com like getting doctor details of a particular city, getting popular surgeries list, booking a demo for the organization. 

## Libraries and Dependencies
- **Maven Repository:** Maven 3.12.0
- **Apache POI:** 5.2.4
- **TestNG:** 7.8.0
- **Extent Report-cucumber:** 1.14.0
- **Selenium WebDriver:** 5.6.2
- **Loggers:** 3.0.0
- **Jenkins:** 2.426.1
- **Cucumber:** 7.16.1

##Problem Statement : Finding Hospitals

1. Search Doctors (any one speciality like Dentist, Cardiologist, etc) for any City (like Chennai, Bangalore, Pune, etc). Apply filters for Patient Stories, Experience, Fees, Availability and any one Sorting; Fetch & display the first 5 Doctor details
2. Go to "Surgeries". Extract & store all the surgeries in a List & display them in console output.
3. Under "For Corporate -> Health and Wellness Plan", fill the form with invalid email id & valid details for other fields, validate if "Taking a demo" button is disabled. Print the observation in console output. Then provide email in valid format & click the button and validate "Thank You" message is displayed

## Automation Flow
1.	Launch browser.
2.	Open the application website.
3.	Enter the city and speciality.
4.	Apply filters for Patient Stories, Experience, Fees, Availability and any one Sorting.
5.	Then collect the information of the first five doctors after sorting.
6.	Navigate to practo site.
7.	Click on Surgeries tab in the header.
8.	Collect all the surgeries in a list, Print the surgeries list in the console and Enter the list in excel.
9.	Navigate to practo site.
10.	Click on For Corporate.
11.	Click on Health and Wellness Plan and from the dropdown.
12.	Enter the Name, organization, organization size and interested in.
13.	Enter the Invalid credentials (Email and Phone no.) and check whether the Schedule a demo button is enabled.
14.	Navigate to practo site.
15.	Click on For Corporate.
16.	Click on Health and Wellness Plan and from the dropdown.
17.	Enter the Name, organization, organization size and interested in.
18.	Enter the valid credentials (Email and Phone no.) and check whether the Schedule a demo button is enabled.
19.	Click on Schedule a demo button.
20.	Validate "Thank You" message is displayed.

## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **Apache POI:** Handles Excel operations for data-driven testing.
- **Cucumber:** To develop test cases for the behavior of software's functionality..
- **Cucumber-extent reports:** Generates comprehensive cucumber extent reports.
- **Selenium WebDriver:** Automates browser interactions.
- **Loggers:** Facilitates logging for better debugging.

## Screenshots
Screenshots are captured at relevant steps for documentation and analysis.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run Junit:**
   - Locate the test Runner file
   - Right-click on the file and choose `Run As` -> `JUnit`.

6. **View Reports:**
   - After execution, open the `test-output` folder.
   - Find the SparkReport (CucumberExtentReport.html) for detailed test case reports.

## Reporting
1. **Locate Test Reports:**
   - After the execution, navigate to the `test-output` folder in the project directory.

2. **Open Extent Report:**
   - Inside the `test-output` folder, find the Extent Report HTML file named `CucumberExtentReport.html`.

3. **View Test Reports:**
   - Open the `CucumberReport.html` file using any web browser.
   - This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.

4. **Screenshots and Logs:**
   - Screenshots captured during test execution and relevant logs for test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the Extent Report to quickly identify test status and any issues encountered during the test run.

## Contributors

## Contributors
- **1)	Prajwal Dudalkar 		     |	2318520**
- **2)	Rahul N 			     |	2318465**
- **3)	Satya veera siva kumari yalla        |	2318477**
- **4)	Arun Kumar Avulakkagari 	     |	2318449**



## Known Issues
- **Issue 1:Internet Bandwidth**  
  - Description: As the internet bandwidth is weak which becomes an issue while running the project.
  - Workaround: Run the project with strong bandwith so that the issue is resolved.

- **Issue 2: Selecting the Filters**
  - Description: During automating the script the number of doctors become less than five when the filters are selected.
  - Workaround: By selecting the different city and speciality.

## Future Enhancements
- **Enhancement 1: Multi-Browser Support**
  - Description: Implement support for multiple browsers to enhance cross-browser compatibility.
  - Timeline: Targeting the next release.

- **Enhancement 2: Enhanced Logging**
  - Description: Introduce more detailed logging to aid in debugging and analysis of test results.
  - Timeline: Considered for the upcoming sprint.

- **Enhancement 3: Test Data Generation**
  - Description: Develop a module for generating test data dynamically to increase test coverage.
  - Timeline: Long-term goal for improved data-driven testing.

- **Enhancement 4: Integration with CI/CD**
  - Description: Integrate the automation script with popular CI/CD platforms for continuous testing.
  - Timeline: Targeting a future release for streamlined workflows.


