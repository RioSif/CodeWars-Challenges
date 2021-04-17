public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String PhoneNumber = "";
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                PhoneNumber += "(";
            } else if (i == 3) {
                PhoneNumber += ") ";
            } else if (i == 6) {
                PhoneNumber += "-";
            }
            PhoneNumber += numbers[i];
        }

        return PhoneNumber;

    }

    public static void main(String[] args) {
        System.out.println(Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0})); // => returns "(123) 456-7890"
    }
}