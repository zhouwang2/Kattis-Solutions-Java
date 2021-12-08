import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int capacity = input.nextInt();
        int numGroups = input.nextInt();
        
        int total = 0;
        int numRejected = 0;
        while(numGroups-- > 0) {//minuses after condition
            String action = input.next();
            int group = input.nextInt();
            
            if(action.equals("enter")) {
                if(total + group > capacity) {
                    numRejected++;
                }else {
                    total += group;
                }
            } else if(action.equals("leave")) {
                total -= group;
            }
            
        }
        System.out.println(numRejected);
    }

}
