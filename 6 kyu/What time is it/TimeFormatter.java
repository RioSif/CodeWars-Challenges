import java.util.Scanner;

public class TimeFormatter {

    public static String toHumanTime(String time) {
        // TODO: Code me!
        String[] hoursNumberToWord = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] minutesNumberToWord = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        int hours = Integer.parseInt(time.substring(0,1));
        int minutes = Integer.parseInt(time.substring(2,3));

        hours = hours > 12 ? hours / 2 : hours;

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputTime = sc.nextLine();
        toHumanTime(inputTime);



    }
}