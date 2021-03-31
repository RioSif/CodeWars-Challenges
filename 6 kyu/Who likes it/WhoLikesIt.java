import java.lang.reflect.Array;
import java.util.Scanner;

class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        String result = "";
        if (names.length != 0) {
            if (names.length == 1) {
                result = String.format("%s likes this", names[0]);
            } else if (names.length == 2) {
                result = String.format("%s and %s like this", names[0], names[1]);
            } else if (names.length == 3) {
                result = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            } else if (names.length > 3) {
                int likes = names.length - 2;
                result = String.format("%s, %s and %d others like this", names[0], names[1], likes);
            }
        } else {
            result = ("no one likes this");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str != null) {
            String[] names = str.replaceAll("\"", "").split(", ");
            System.out.println(whoLikesIt(names));
        } else {
            System.out.println("no one likes this");
        }
    }
}