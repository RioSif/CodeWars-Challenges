public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        int numsorted = num;
        int numlenght = String.valueOf(num).length();
        int[] number = new int[numlenght];
        for (int i = numlenght - 1; i >= 0; i--) {
            number[i] = numsorted % 10;
            numsorted /= 10;
        }
        boolean issorted = false;
        while (!issorted){
            issorted = true;
            for (int i = 0; i < numlenght - 1; i++) {
                if (number[i] < number[i + 1]) {
                    int temp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = temp;
                    issorted = false;
                }
            }
        }

        for (int c: number) {
            numsorted = numsorted * 10 + c;
        }

        return numsorted;
    }

    public static void main(String[] args) {

    }
}