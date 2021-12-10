import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++) {
            
            int rev = input.nextInt();
            int exp = input.nextInt();
            int cost = input.nextInt();
            
            if(exp - cost > rev) {
                System.out.println("advertise");
            }
            else if(exp - cost < rev) {
                System.out.println("do not advertise");
            }
            else {
                System.out.println("does not matter");
            }
            
        }

    }

}
