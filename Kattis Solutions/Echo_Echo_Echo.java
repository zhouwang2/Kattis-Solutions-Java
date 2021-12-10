import java.util.Scanner;

public class EchoEchoEcho {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        for(int i = 0; i < 3; i++){
            System.out.println(word + " ");
        }
        
    }
    
}
