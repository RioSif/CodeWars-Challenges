import java.util.Scanner;

class FactDecomp {

    public static String decomp(int n) {
        // your code
        int[] array = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            int temp = i;
            for (int j = 2; j <= i; j++) {
                while (temp % j == 0) {
                    array[j]++;
                    temp /= j;
                }
                if (temp == 0 || temp == 1) {
                    break;
                }
            }
        }

        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int c : array) {
            if (c != 0) {
                result.append(count == 2 ? "" : " * ").append(count).append(c > 1 ? "^" : "").append(c > 1 ? c : "");

            }
            count++;
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(decomp(fact));
    }
}
