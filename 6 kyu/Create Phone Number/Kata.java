public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder PhoneNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                PhoneNumber.append("(");
            } else if (i == 3) {
                PhoneNumber.append(") ");
            } else if (i == 6) {
                PhoneNumber.append("-");
            }
            PhoneNumber.append(numbers[i]);
        }

        return PhoneNumber.toString();

    }

    public static void main(String[] args) {
        System.out.println(Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0})); // => returns "(123) 456-7890"
    }
}