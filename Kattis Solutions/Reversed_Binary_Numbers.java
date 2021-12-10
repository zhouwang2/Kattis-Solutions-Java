
import java.util.Scanner;

public class Kattis {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String binary = "";
        
        while(n > 0) {
            if(n % 2 == 1) {
                binary = '1' + binary;
            }
            else {
                binary = '0' + binary;
            }
            n = n / 2;
        }
        
        int power = 1;
        int answer = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                answer = answer + power;
            }
            power = power * 2;
        }
        System.out.println(answer);
    
    }
}
