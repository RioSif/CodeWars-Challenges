import java.util.Scanner;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        System.out.println(text.toLowerCase().replaceAll("[^a-z]", "9").replaceAll("(.)(?=.*\\1)", "8"));

        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(duplicateCount(str));
    }
}