import java.util.Scanner;

class FactDecomp {

    public static String decomp(int n) {
        // your code
        int[] result = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int temp = i;
            for (int j = 2; j <= i; j++) {

                while (temp % j == 0) {
                    result[j]++;
                    temp /= j;
                }
                if (temp == 0 || temp == 1) {
                    break;
                }
            }
            if (temp == 0 || temp == 1) {
                break;
            }
        }


        for (int c: result) {
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
