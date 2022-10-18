public class TimeFormatter {

    public static String formatDuration(int seconds) {
        // your code goes here
        int years = seconds / 31536000;
        int days = (seconds % 31536000) / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = (seconds % 3600) / 60;
        int rseconds = seconds % 60;
        StringBuilder sb = new StringBuilder();
        if (years > 0) {
            if (years > 1) {
                sb.append(years).append(" years, ");
            } else {
                sb.append(years).append(" year, ");
            }
        }
        if (days > 0) {
            if (days > 1) {
                sb.append(days).append(" days, ");
            } else {
                sb.append(days).append(" day, ");
            }
        }
        if (hours > 0) {
            if (hours > 1) {
                sb.append(hours).append(" hours, ");
            } else {
                sb.append(hours).append(" hour, ");
            }
        }
        if (minutes > 0) {
            if (minutes > 1) {
                sb.append(minutes).append(" minutes, ");
            } else {
                sb.append(minutes).append(" minute and ");
            }
        }
        if (rseconds > 0) {
            if (rseconds > 1) {
                sb.append(rseconds).append(" seconds");
            } else {
                sb.append(rseconds).append(" second");
            }

        }
        return sb.toString();
    }
}