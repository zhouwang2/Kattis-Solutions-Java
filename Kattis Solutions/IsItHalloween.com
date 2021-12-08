import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] words = input.nextLine().split(" ");
        
        if(words[0].equals("OCT") && words[1].equals("31") || words[0].equals("DEC") && words[1].equals("25")) {
            System.out.println("yup");
        }
        else {
            System.out.println("nope");
        }
    }

}
