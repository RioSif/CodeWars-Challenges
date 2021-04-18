import java.util.Scanner;

public class Kata
{
    public static String reverseWords(final String original) {
        // Have at it

        String[] Sentencearray = original.split(" ");

        if (Sentencearray.length == 0) {
            return original;
        } else {

            String revercedSentence = "";

            for (int i = 0; i < Sentencearray.length; i++) {
                String temp = "";
                for (int j = 1; j <= Sentencearray[i].length(); j++) {
                    temp += Sentencearray[i].charAt(Sentencearray[i].length() - j);
                }
                revercedSentence += i == Sentencearray.length - 1 ? String.format(temp) : String.format(temp + " ");
            }

            return revercedSentence;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Sentence = scanner.nextLine();
        System.out.println(reverseWords(Sentence));
    }
}