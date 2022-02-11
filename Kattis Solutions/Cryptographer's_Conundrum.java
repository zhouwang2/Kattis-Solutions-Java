import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int total = 0;
		
		for (int i = 0; i < s.length(); i++){
	        if (i%3 == 0 && s.charAt(i) != 'P')
	            total++;
	        if (i%3 == 1 && s.charAt(i) != 'E')
	            total++;
	        if (i%3 == 2 && s.charAt(i) != 'R')
	           total++;
	    }
		
		System.out.println(total);
		
	}
}
