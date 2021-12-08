import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int max = 0;
        int winner = 0;
        int sum = 0;
        
        for(int i = 0; i < 5; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            
            sum = a+b+c+d;
            if(sum > max) {
                max = sum;
                winner = i;
            }
        }
        System.out.println(winner + 1 + " " + max);
    }

}
