import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int cases = input.nextInt();
        
        for(int c = 0; c < cases; c++) {
            int cities = input.nextInt();
            String[] city = new String[cities];
            for(int i = 0; i < city.length; i++) {
                city[i] = input.next();
            }
            int count = 0;
            for(int i = 0; i < city.length; i++) {
                boolean found = false;
                for(int j = 0; j < i; j++) {
                    if(city[i].equals(city[j])) {
                        found = true;
                    }
                }
                if(!found) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
