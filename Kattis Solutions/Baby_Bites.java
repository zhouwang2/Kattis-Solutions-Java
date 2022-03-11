import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        
        String[] words = input.nextLine().split(" ");
        
        boolean condition = true;

        for (int i = 0; i < words.length; i++) {
              if(!words[i].equals("mumble") && !words[i].equals(Integer.toString(i+1))) {
                  condition = false;
              }
        }
        if(condition) {
            System.out.println("makes sense");
        }
        else {
            System.out.println("something is fishy");
        }
        
    }

}
