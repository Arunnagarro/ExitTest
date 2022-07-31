###Exit Test (Appium + Cucumber) 

mvn clean test</br>

or

mvn test</br>


####Packages Description

####src/main/java description

1.**BaseTest**: Initialize drivers

2.**POM**: Defines different screen page and assertions

3.**com.AppiumTesting_Exit_test.Utility**: Defines appium server,desired capabilities

4.**ReusableMethods**: Defines the vertical and horizontal scroll methods.


####Resources description

1.**log4j2.xml**: It defines log4j2 file for logger information

####src/test/java file description

1.**Feature**: Define feature files

2.**Runner**: Define glue,tags feature file in a single file for run appium

3.**StepDefinitions**: Define all the steps for feature files

4.**Hooks**: Define Screenshot for failed test cases , start and stop appium server

####APK File

1.API_Demos.apk

####logs folder description 

1.**prints.log**: It contains all the logger informations

####Reports

1.Extent report gets generated after the run under \Reports\extentreport.html

####test-output

1.TestNG report as "emailable-report.html" gets generated under \test-output.

####GitHub link

git@github.com:Arunnagarro/ExitTest.git
