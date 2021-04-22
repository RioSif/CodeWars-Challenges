import java.util.Scanner;

class FactDecomp {

    public static long factorial(int n) {
        long[] result = new long[n + 1];
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] * i;
        }
        return result[n];
    }

    public static String decomp(int n) {
        // your code
        long factorial = factorial(n);
        int[] divider = new int[n];
        for (int i = 2; i < n; i++) {
            divider[i] = 0;
            while (factorial % i == 0 && (factorial != 1 || factorial != 0)) {
                factorial /= i;
                divider[i]++;
            }
        }

        for (int c: divider) {
            System.out.print(c + " ");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(decomp(fact));
    }
}
