import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        HashSet<String> uni = new HashSet<String>();
        
        uni.add(null);
        uni.size();
        uni.contains(null);
        
        int count = 0;
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String a = in.next();
            String b = in.next();
            
            if(!uni.contains(a)) {
                uni.add(a);
                System.out.println(a + " " + b);
                count++;
            }
            if(count >= 12) {
                break;
            }
        }
        
    }
    
}
