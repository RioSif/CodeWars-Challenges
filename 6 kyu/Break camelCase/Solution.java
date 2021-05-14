import java.util.Scanner;

class Solution {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        String uppercase = input.toUpperCase();
        for (int i = 0; i < input.length(); i++){
            result.append(input.charAt(i) == uppercase.charAt(i) ? " " + input.charAt(i) : input.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(camelCase(input));
    }
}