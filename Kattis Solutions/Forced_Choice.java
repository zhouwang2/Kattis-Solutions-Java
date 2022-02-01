import java.util.*;

public class Kattis {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int s = sc.nextInt();

        while (sc.hasNextInt()) {
            int numCards = sc.nextInt();
            boolean remove = true;
            for (int i = 0; i < numCards; i++) {
                int num = sc.nextInt();
                if (num == p) {
                    remove = false;
                }
            }

            if (remove) {
                System.out.println("REMOVE");
            }
            else {
                System.out.println("KEEP");
            }
        }
    }
}
