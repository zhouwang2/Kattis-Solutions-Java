import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        String[] items = str.split(";");
        int pagecount = 0;
        for(int i = 0; i < items.length; i++) {
            
            String[] item = items[i].split("-");
            if(item.length == 1) {
                pagecount++;
            }
            if(item.length == 2) {
                pagecount = pagecount + Integer.parseInt(item[1]) -
                Integer.parseInt(item[0]) + 1;
            }
        }
        System.out.println(pagecount);
        
    }
    
}
