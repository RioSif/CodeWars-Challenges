import java.util.Arrays;
import java.util.Scanner;

public class Stat {

    public static String stat(String strg) {
        // your code

        String[] raceResults = strg.split(", ");
        int[] resultsInSec = new int[raceResults.length];
        String[] indResults = new String[3];

        for (int i = 0; i < raceResults.length; i++) {
            indResults = raceResults[i].split("\\|");
            resultsInSec[i] = Integer.parseInt(indResults[0]) * 3600 + Integer.parseInt(indResults[1]) * 60 + Integer.parseInt(indResults[2]);
        }

        Arrays.sort(resultsInSec);

        return calcRange(resultsInSec) + " " + calcMoA(resultsInSec) + " " + calcMedian(resultsInSec);
    }

    public static String calcRange(int[] args) {
        int rang = args[args.length - 1] - args[0];
        String range = "Range: " + formatTime(rang);

        return range;
    }

    public static String calcMoA(int[] args) {
        int avg = 0;
        for (int i = 0; i < args.length; i++) {
            avg += args[i];
        }
        avg /= args.length;
        String average = "Average: " + formatTime(avg);

        return average;
    }

    public static String calcMedian(int[] args) {

        int med = args.length % 2 == 0 ? (args[args.length / 2 - 1] + args[args.length / 2]) / 2 : args[args.length / 2];
        String median = "Median: " + formatTime(med);

        return median;
    }

    public static String formatTime(int val) {
        int hh = val / 3600;
        int mm = (val % 3600) / 60;
        int ss = val % 60;
        String formatTime = String.format("%02d", hh) + "|" + String.format("%02d", mm) + "|" + String.format("%02d", ss);

        return formatTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String results = sc.nextLine();

        System.out.println(stat(results));
    }
}