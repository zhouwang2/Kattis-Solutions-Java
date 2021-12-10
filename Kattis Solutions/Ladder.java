import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double h = input.nextDouble();
        double v = input.nextDouble();
                
        double ladder = h / Math.sin(Math.toRadians(v));
        
        if ((ladder % 2 == 1) || (ladder % 2 == 0)) {
            System.out.println((int) ladder);
        }
        if ((ladder + 0.5) <= ((int) ladder - 1)) {
             System.out.println((int) ((int) ladder + 1));
        }
        else {
             System.out.println((int) ((int)ladder + 1));
        }
        
    }
    
}
