import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        int count = 0;
        
        for(int i = 0; i < word.length(); i++) {
            for(int j = i+1; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
        }
        if(count > 0) {
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }
    }
    
}
