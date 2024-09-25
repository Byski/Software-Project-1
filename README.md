# Software Project 1: Days Between Two Dates Calculator

This Java program computes the number of days between two dates entered by the user. It utilizes the `SimpleDateFormat` class from the `java.text` package to parse the dates and convert them into `Date` objects.

## Features
- Prompts the user to enter two dates.
- Calculates the number of days between the two dates.
- Validates user input to ensure it's a positive integer.
- Allows users to repeat the process or exit.

## How the Code Works

### Import Statements
Essential classes are imported at the beginning:
```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

#Main Class
A class named Main contains the main method, serving as the program's entry point.

#Scanner for User Input
A Scanner object named scanner is created to read user input from the console.

#Input Loop
A do-while loop repeatedly prompts the user for input until they choose to exit.

#Switch Statement
A switch statement manages user selections, starting with case 1 by default.

#Date Input
Users are prompted to enter two dates (day, month, and year) using the getValidInput method.

#Calculating Days
The getDaysBetweenTwoDates method is invoked with the two date strings. It parses them into Date objects, calculates the difference in milliseconds, and converts this to days using TimeUnit.DAYS, returning the absolute value.

#Displaying the Result
The number of days between the two dates is printed to the console.

#Input Validation
The getValidInput method ensures user input is a positive integer.

#Loop Continuation
The program continues until the user exits by entering 0.

#Resource Management
The scanner object is closed to free up system resources.




