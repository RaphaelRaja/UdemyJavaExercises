package NumberOfDaysInMonth;

public class NumberOfDaysInMonthMain {
    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonthSolution.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonthSolution.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonthSolution.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonthSolution.isLeapYear(2000));
        System.out.println();

        System.out.println(NumberOfDaysInMonthSolution.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonthSolution.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonthSolution.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonthSolution.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonthSolution.getDaysInMonth(1, -2020));
    }
}
