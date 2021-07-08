import java.util.ArrayList;
import java.util.Scanner;

public class DigPow {

    public static long digPow(int n, int p) {
        // your code
       // int Digits;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0) {

            list.add(n/10);
            n /= 10;
        }
        for(int i = 0; i > list.size(); i++){
            System.out.println(list.get(i));
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number:");
        int number = sc.nextInt();
        System.out.println("Give p");
        int p = sc.nextInt();
        digPow(number, p);
    }
}

