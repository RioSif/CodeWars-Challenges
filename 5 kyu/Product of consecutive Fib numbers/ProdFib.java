import java.util.Scanner;

public class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {
        // your code
        int n = 1;
        long[] result = {0, 0, 0};
        long fProd;
        long fibN0 = 0;
        long fibN = 1;
        long fibN1;

        while (prod >= (fProd = fibN * (fibN1 = fib(n + 1)))) {
            if (prod == fProd) {
                result[2] = 1;
            }
            fibN0 = fibN;
            fibN = fibN1;
            n++;
        }

        result = result[2] == 1 ? new long[] {fibN0, fibN, 1} : new long[] {fibN, fibN1, 0};


        return result;
    }

    public static long fib(int num) {
        long[] f = new long[num + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= num; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return (f[num - 1] + f[num - 2]) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long prod = sc.nextLong();
        for (long c : productFib(prod)) {
            System.out.print(c + " ");
        }
    }
}