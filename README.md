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

