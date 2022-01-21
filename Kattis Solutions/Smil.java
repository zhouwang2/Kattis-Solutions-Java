import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String in = sc.nextLine();
        
        for(int i = 0; i < in.length() - 1; i++){
            if(in.charAt(i) == ':' || in.charAt(i) == ';'){
                if(in.charAt(i+1) == ')'){
                    System.out.println(i);
                }
                else if(in.length() > i + 2 && in.charAt(i+1) == '-' ){
                    if (in.charAt(i+2) == ')'){
                        System.out.println(i);
                    }
                }
            }
        }
        sc.close();
        
    }

}
