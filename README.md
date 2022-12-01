#  Java + Junit Command Line Execution Example 
String contains method without using builtin function.  
In order to compile junit test cases from command line 2 jar files (junit-4.13.2.jar and hamcrest-core-1.3.jar 
are added to the project directory.)
## Built With
* Java
* JUnit4

## To Run Application from command Prompt

### Build

```console
 javac -d out/ -cp /Users/rutuja.dhore/Desktop/demo-projects/search/StringCompare/junit-4.13.2.jar src/*.java
> Specific full path to jar file
> out is the outpur directory of class files
```

### Run
```
 java src/MainClass.java
```

### Test
```
 java -cp out/:/Users/rutuja.dhore/Desktop/demo-projects/search/StringCompare/hamcrest-core-1.3.jar:/Users/rutuja.dhore/Desktop/demo-projects/search/StringCompare/junit-4.13.2.jar org.junit.runner.JUnitCore MainClassTest
```
### Output 
> JUnit version 4.13.2  
> Time: 0.006  
> OK (2 tests)  
