import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of seconds to convert: ");
            String seconds = scanner.nextLine();

            System.out.println(TimeFormatter.formatDuration(Integer.parseInt(seconds)));

        }
    }
}
