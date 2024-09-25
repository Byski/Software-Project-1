import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int selection = 1;

        do {
         
           
            
            switch (selection) {
                case 1:
                    performDateCalculation(scanner);
                    System.out.println();
                    selection = getValidInput(scanner, "For new calculation enter 1, otherwise enter 0 to quit.");
                    System.out.println();
                    break;
                case 0:
                    exit = true;

                    System.out.println("Program Finished");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
            
           // System.out.println("1. Calculate day difference between two dates");
            //System.out.println("0. Exit");
                    
        } while (!exit);
        
        scanner.close();
    }
    
    private static void performDateCalculation(Scanner scanner) {
    	
        int day1 = getValidInput(scanner, "Enter date 1 day: ");
        int month1 = getValidInput(scanner, "Enter date 1 month: ");
        int year1 = getValidInput(scanner, "Enter date 1 year: ");
        
        //System.out.println("Please enter the second date:");
        
        System.out.println("");
        
        int day2 = getValidInput(scanner, "Enter date 2 day: ");
        int month2 = getValidInput(scanner, "Enter date 2 month: ");
        int year2 = getValidInput(scanner, "Enter date 2 year: ");
        
        String dateString1 = String.format("%02d %02d %04d", day1, month1, year1);
        String dateString2 = String.format("%02d %02d %04d", day2, month2, year2);
        
        int daysBetween = getDaysBetweenTwoDates(dateString1, dateString2);
        
        System.out.println("Days between the two dates: " + daysBetween);
        
      
     
    }
    
    private static int getValidInput(Scanner scanner, String prompt) {
        int input;
        do {
            System.out.print(prompt);
            input = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            if (input < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } while (input < 0);
        
        return input;
    }
    
    private static int getDaysBetweenTwoDates(String dateString1, String dateString2) {
        int days = 0;
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        
        try {
            Date date1 = myFormat.parse(dateString1);
            Date date2 = myFormat.parse(dateString2);
            long diff = date2.getTime() - date1.getTime();
            
            days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return Math.abs(days);
    }
}