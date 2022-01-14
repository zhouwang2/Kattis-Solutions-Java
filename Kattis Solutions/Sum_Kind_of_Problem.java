import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++) {
			int c = sc.nextInt();
			int n = sc.nextInt();
			
			int s1 = (n * (2 * 1 + (n-1)*1))/2;
			int s2 = (n * (2 * 1 + (n-1)*2))/2;
			int s3 = (n * (2 * 2 + (n-1)*2))/2;
			
			System.out.println(c + " " + s1 + " " + s2 + " " + s3);
		}
		
	}

}
