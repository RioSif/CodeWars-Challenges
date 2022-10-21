import java.util.ArrayList;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        // your code goes here
        if (seconds == 0) {
            return "now";
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(seconds / 31536000);
        list.add(seconds % 31536000 / 86400);
        list.add(seconds % 86400 / 3600);
        list.add(seconds % 3600 / 60);
        list.add(seconds % 60);

        ArrayList<String> durationNames = new ArrayList<>();
        durationNames.add("year");
        durationNames.add("day");
        durationNames.add("hour");
        durationNames.add("minute");
        durationNames.add("second");

        int count = 0;

        for (Integer listItem: list) {
            if (listItem > 0) {
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                if (list.get(i) > 1) {
                    sb.append(list.get(i) + " ").append(durationNames.get(i)).append("s");
                } else {
                    sb.append(list.get(i) + " ").append(durationNames.get(i));
                }
                sb.append(numberOfItems(count));
                count--;
            }
        }
        return sb.toString();
    }

    public static String numberOfItems(int count) {
        if (count > 2) {
            return ", ";
        } else if (count == 2) {
            return " and ";
        }
        return "";
    }
}