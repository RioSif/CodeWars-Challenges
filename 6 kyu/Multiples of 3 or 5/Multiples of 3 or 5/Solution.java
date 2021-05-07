import java.util.Scanner;

public class Solution {

    public static int solution(int number) {
        //TODO: Code stuff here
        int sum3 = 0, sum5 = 0, minus15 = 0;

        sum3 = (number - 1 - ((number - 1) % 3)) / 3;
        sum5 = (number - 1 - ((number - 1) % 5)) / 5;
        minus15 = (number - 1 - ((number - 1) % 15)) / 15;
        int c= 3 * sum3 * (sum3 + 1) / 2 + 5 * sum5 * (sum5 + 1) / 2 - 15 * minus15 * (minus15 + 1) / 2;

        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println(solution(t));

    }
}