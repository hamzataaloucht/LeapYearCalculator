public class LeapYearCalculator {

    // Implementing the method isLeapYear
    public static boolean isLeapYear(int year) {
        // Verifying if the year is valid
        if (year < 1 || year > 9999) {
            return false;
        }
        // Returning true if year is a leap year and false otherwise
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    public static void main(String[] args) {
        // Testing the method isLeapYear
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
