import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        Boolean condition = false;
        
        for(int i = 0; i < word.length(); i++) {
            if(word.contains("ss")) {
                condition = true;
            }
        }
        if(condition == true) {
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
    
}
