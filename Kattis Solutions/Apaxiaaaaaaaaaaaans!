import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        String answer = "" + word.charAt(0);
        
        for(int i = 1; i < word.length(); i++) {
            if (word.charAt(i) != answer.charAt(answer.length()-1)) {
                answer = answer + word.charAt(i);
            }
        }
        System.out.println(answer);
        
    }
}
