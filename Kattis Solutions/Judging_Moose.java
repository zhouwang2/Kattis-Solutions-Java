import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        if(a == 0 && b == 0) {
            System.out.println("Not a moose");
        }
        else if(a > 0 && b > 0 && a == b) {
            System.out.println("Even " + 2*a);
        }
        else {
            if(a < b) {
                System.out.println("Odd " + 2*b);
            }
            else {
                System.out.println("Odd " + 2*a);
            }
        }

    }
    
}
