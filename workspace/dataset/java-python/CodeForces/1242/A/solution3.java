import java.util.Scanner; public class TilePainting { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		long n = sc.nextLong();		long ans = n;		for (long i = 2; i * i <= n; i++) {			if (n % i == 0) {				ans = gcd(ans, i);				ans = gcd(ans, n / i);			}		}		System.out.println(ans);	} 	private static long gcd(long a, long b) {		// TODO Auto-generated method stub		return b == 0 ? a : gcd(b, a % b);	} }