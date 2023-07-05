
import java.util.Scanner;

public class Lab01_64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = "";
        int year=0;
        int days = 0;

        // Get input for month and year
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter month (full name, abbreviation, or in number): ");
            month = scanner.nextLine().trim();
            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine().trim();

            // Validate year input
            try {
                year = Integer.parseInt(yearInput);
                validInput = year > 0;
            } catch (NumberFormatException e) {
                validInput = false;
            }

            if (!validInput) {
                System.out.println("Invalid year. Please try again.");
                continue;
            }

            // Switch statement for month input
            switch (month.toLowerCase()) {
                case "january":
                case "jan":
                case "jan.":
                case "1":
                    days = 31;
                    validInput = true;
                    break;
                case "february":
                case "feb":
                case "feb.":
                case "2":
                    // Check for leap year
                    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                    days = isLeapYear ? 29 : 28;
                    validInput = true;
                    break;
                case "march":
                case "mar":
                case "mar.":
                case "3":
                    days = 31;
                    validInput = true;
                    break;
                case "april":
                case "apr":
                case "apr.":
                case "4":
                    days = 30;
                    validInput = true;
                    break;
                case "may":
                case "5":
                    days = 31;
                    validInput = true;
                    break;
                case "june":
                case "jun":
                case "jun.":
                case "6":
                    days = 30;
                    validInput = true;
                    break;
                case "july":
                case "jul":
                case "jul.":
                case "7":
                    days = 31;
                    validInput = true;
                    break;
                case "august":
                case "aug":
                case "aug.":
                case "8":
                    days = 31;
                    validInput = true;
                    break;
                case "september":
                case "sep":
                case "sep.":
                case "9":
                    days = 30;
                    validInput = true;
                    break;
                case "october":
                case "oct":
                case "oct.":
                case "10":
                    days = 31;
                    validInput = true;
                    break;
                case "november":
                case "nov":
                case "nov.":
                case "11":
                    days = 30;
                    validInput = true;
                    break;
                case "december":
                case "dec":
                case "dec.":
                case "12":
                    days = 31;
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid month. Please try again.");
            }
        }

        scanner.close();

        month = month.substring(0, 1).toUpperCase() + month.substring(1);
        System.out.println(month + " " + year + " has " + days + " days.");
    }
}
