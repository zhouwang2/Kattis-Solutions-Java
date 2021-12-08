import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int p = input.nextInt();
        int q = input.nextInt();
        int s = input.nextInt();
        
        int count = 0;
        
        for(int i = 1; i <= s; i++) {
            if(i % p == 0 && i % q == 0) {
                count++;
            }
        }
        if(count > 0) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    
}
