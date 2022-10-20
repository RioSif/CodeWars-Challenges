public class TimeFormatter {

    public static String formatDuration(int seconds) {
        // your code goes here

        if (seconds == 0) {
            return "now";
        }

        int years = seconds / 31536000;
        int days = (seconds % 31536000) / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = (seconds % 3600) / 60;
        int rseconds = seconds % 60;

        int count = 0;

        if (years > 0) {
            count++;
        }
        if (days > 0) {
            count++;
        }
        if (hours > 0) {
            count++;
        }
        if (minutes > 0) {
            count++;
        }
        if (rseconds > 0) {
            count++;
        }

        StringBuilder sb = new StringBuilder();
        if (years > 0) {
            if (years > 1) {
                sb.append(years).append(" years");
            } else {
                sb.append(years).append(" year");
            }
            sb.append(numberOfItems(count));
            count--;
        }
        if (days > 0) {
            if (days > 1) {
                sb.append(days).append(" days");
            } else {
                sb.append(days).append(" day");
            }
            sb.append(numberOfItems(count));
            count--;

        }
        if (hours > 0) {
            if (hours > 1) {
                sb.append(hours).append(" hours");
            } else {
                sb.append(hours).append(" hour");
            }
            sb.append(numberOfItems(count));
            count--;
        }
        if (minutes > 0) {
            if (minutes > 1) {
                sb.append(minutes).append(" minutes");
            } else {
                sb.append(minutes).append(" minute");
            }
            sb.append(numberOfItems(count));
            count--;
        }
        if (rseconds > 0) {
            if (rseconds > 1) {
                sb.append(rseconds).append(" seconds");
            } else {
                sb.append(rseconds).append(" second");
            }
            sb.append(numberOfItems(count));
            count--;

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