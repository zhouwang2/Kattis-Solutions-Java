import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String[] words = input.nextLine().split(" ");
        
        int count = 0;
        
        for(int i = 0; i < words.length; i++) {
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                }
            }
        }
        if(count > 0) {
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }
    }
    
}
