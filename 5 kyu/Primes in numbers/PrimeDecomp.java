import java.util.Scanner;

public class PrimeDecomp {

    public static String factors(int n) {
        // your code
        int[] array = new int[n + 1];

            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    array[i]++;
                    n /= i;
                }
                if (n == 0 || n == 1) {
                    break;
                }
            }

        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int c : array) {
            if (c != 0) {
                result.append(count == 2 ? "" : ")(").append(count).append(c > 1 ? "**" : "").append(c > 1 ? c : "");

            }
            count++;
        }

        return String.valueOf("(" + result + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(factors(fact));
    }
}