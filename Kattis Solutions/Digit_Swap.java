import java.util.Scanner;

public class Kattis {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        StringBuilder a = new StringBuilder(sc.next()).reverse();
        
        int x = Integer.parseInt(a.toString());
        
        System.out.println(a);
    
    }
}
