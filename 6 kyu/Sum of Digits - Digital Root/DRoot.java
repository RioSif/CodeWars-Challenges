import java.util.Scanner;

public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        while (n > 10) {
            sum += n % 10;
            n /= 10;
            sum = digital_root(sum);
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digital_root(num));
    }
}

