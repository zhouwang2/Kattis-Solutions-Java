import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double cost = Double.parseDouble(input.nextLine());
        
        int lawns = Integer.parseInt(input.nextLine());
        
        double result = 0;
        
        for(int i = 0; i < lawns; i++) {
            String[] str = input.nextLine().split(" ");
            result = result + cost * Double.parseDouble(str[0]) * Double.parseDouble(str[1]);
        }
        System.out.println(result); 
    }
