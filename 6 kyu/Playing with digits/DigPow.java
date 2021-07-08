import java.util.ArrayList;
import java.util.Scanner;

public class DigPow {

    public static long digPow(int n, int p) {
        // your code
       // int Digits;
        long sum = 0;
        int mynumber = n;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        for(int i = list.size() - 1;i >= 0; i--) {
            sum += Math.pow(list.get(i),p);
            p += 1;
        }

        if(sum % mynumber == 0) {
            return sum / mynumber;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number:");
        int number = sc.nextInt();
        System.out.println("Give p");
        int p = sc.nextInt();
        System.out.println(digPow(number, p));
    }
}

