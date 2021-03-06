import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        while(n --> 0) {
            String message = input.next();
            
            //Find next square number
            int m = message.length();
            int k = (int) Math.ceil(Math.sqrt(m)); //(int) --> convert to int
            while(Math.sqrt(m) * Math.sqrt(m) != m) {
                m++;
            }
            
            char[][] grid = new char[k][k]; //int padding = m - message.length()
            
            int strIndex = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(strIndex < message.length()) {
                        grid[i][j] = message.charAt(strIndex);
                        strIndex++;
                    }
                    else {
                        grid[i][j] = '*';
                    }
                }
            }
            for(int col = 0; col < grid[0].length; col++) {
                for(int row = grid.length - 1; row >= 0; row--) {
                    if(grid[row][col] != '*') {
                        System.out.print(grid[row][col]);
                    }
                }
            }
            System.out.println();
            
        }
        
    }

}
