import java.util.Scanner; public class Main {		public static void main(String[] args) {		Scanner in = new Scanner(System.in);		int n = in.nextInt();		int a = in.nextInt();		int b = in.nextInt();		if (b > 0) {			System.out.println((a + b % n - 1) % n +1);		} else {			System.out.println((a + n - (-b % n) - 1) % n + 1);		}	}	}  	 								     			  			 			 	
