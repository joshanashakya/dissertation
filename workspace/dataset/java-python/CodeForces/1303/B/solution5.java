import java.util.Scanner; public class Main {	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int t = input.nextInt();		while (t-- != 0){			long n = input.nextInt();			long g = input.nextInt();			long b = input.nextInt();			long half = (n+1) / 2;			long ans = half / g * (g + b);			if (half % g == 0){				ans -= b;			}else{				ans += half % g;			}			System.out.println((long)Math.max(ans, n));		}	}} 			   		 			  			 		 					  		
