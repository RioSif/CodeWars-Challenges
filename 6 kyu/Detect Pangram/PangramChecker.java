import java.util.Scanner;

class PangramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aSentence = sc.nextLine();
        System.out.println(check(aSentence));
    }

    public static boolean check(String sentence){
        //code
        return sentence.toLowerCase().replaceAll("[^a-z]", "").replaceAll("(.)(?=.*\\1)", "").length() == 26;
    }
}