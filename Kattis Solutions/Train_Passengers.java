import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int capacity = sc.nextInt();
		int stations = sc.nextInt();
		
		boolean possible = true;
		
		int current = 0;
		int left = 0;
		int enter = 0;
		int wait = 0;
		
		for(int i = 0; i < stations; i++) {
			
			left = sc.nextInt();
			enter = sc.nextInt();
			wait = sc.nextInt();
			
			if(left > current) {
				possible = false;
			}
			
			current += enter - left;
			
			if((current != capacity && wait > 0) || (current > capacity) || (current < 0) || (i == stations - 1 && wait > 0)){
				possible = false;
			}
    }
    
		if(current != 0) {
			possible = false;
		}
		
		if(possible) {
			System.out.println("possible");
		}
		else {
			System.out.println("impossible");
		}
		
	}
}
