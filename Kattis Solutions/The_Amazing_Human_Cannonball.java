import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int tests = input.nextInt();
        
        for(int i = 0; i < tests; i++) {
            double v = input.nextDouble();
            double theta = input.nextDouble();
            double x = input.nextDouble();
            double h1 = input.nextDouble();
            double h2 = input.nextDouble();
            
            double t = x / v / Math.cos(Math.toRadians(theta));
            double g = 9.81;
            
            double y = v * t * Math.sin(Math.toRadians(theta)) - 0.5 * g * t*t;
            
            if(y > h1+1 && y < h2-1) {
                System.out.println("Safe");
            }
            else {
                System.out.println("Not Safe");
            }
        }
        
    }
    
}
