import java.util.Scanner;

public class TimeFormatter {

    public static String toHumanTime(String time) {
        // TODO: Code me!
        String[] hoursNumberToWord = {"twelve", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven"};
        String[] minutesNumberToWord = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String[] preposition = {"o'clock", "quarter", "past", "half", "to", "minute", "minutes"};
        int hours = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3,5));

        hours = hours >= 12 ? hours -= 12 : hours;

        StringBuilder timeString = new StringBuilder();
        switch (minutes) {
            case 0:
                timeString.append(hoursNumberToWord[hours]).append(" ").append(preposition[0]);
                break;
            case 15:
                timeString.append(preposition[1]).append(" ").append(preposition[2]).append(" ").append(hoursNumberToWord[hours]);
                break;
            case 30:
                timeString.append(preposition[3]).append(" ").append(preposition[2]).append(" ").append(hoursNumberToWord[hours]);
                break;
            case 45:
                timeString.append(preposition[1]).append(" ").append(preposition[4]).append(" ").append(hoursNumberToWord[hours + 1]);
                break;
            default:
                if (minutes == 1 || ((minutes - 60) * -1) == 1) {
                    timeString.append(minutesNumberToWord[minutes]).append(" ").append(preposition[5]).append(" ").append(preposition[2]).append(" ").append(hoursNumberToWord[hours]);
                } else {
                    minutes = (minutes - 60) * -1;
                    timeString.append(minutesNumberToWord[minutes / 10 * 10]).append("-").append(minutesNumberToWord[minutes % 10]).append(" ").append(preposition[6]).append(" ").append(preposition[4]).append(" ").append(hoursNumberToWord[hours + 1]);
                }
                else if (minutes <= 20) {
                    timeString.append(minutesNumberToWord[minutes]).append(" ").append(preposition[6]).append(" ").append(preposition[2]).append(" ").append(hoursNumberToWord[hours]);
                } else if (minutes < 30) {
                    timeString.append(minutesNumberToWord[minutes / 10 * 10]).append("-").append(minutesNumberToWord[minutes % 10]).append(" ").append(preposition[6]).append(" ").append(preposition[2]).append(" ").append(hoursNumberToWord[hours]);
                } else if (minutes >= 40){
                    minutes = (minutes - 60) * -1;
                    timeString.append(minutesNumberToWord[minutes]).append(" ").append(preposition[6]).append(" ").append(preposition[4]).append(" ").append(hoursNumberToWord[hours + 1]);
                } else {
                    minutes = (minutes - 60) * -1;
                    timeString.append(minutesNumberToWord[minutes / 10 * 10]).append("-").append(minutesNumberToWord[minutes % 10]).append(" ").append(preposition[6]).append(" ").append(preposition[4]).append(" ").append(hoursNumberToWord[hours + 1]);
                }

        }

        String timeIs = timeString.toString();
        return timeIs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputTime = sc.nextLine();
        System.out.println(toHumanTime(inputTime));



    }
}