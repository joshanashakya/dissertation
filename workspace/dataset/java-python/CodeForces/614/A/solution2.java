import java.util.*; public class CodeForces614A{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		long l = input.nextLong();		long r = input.nextLong();		long k = input.nextLong();		long ans = 1;		long c = 0;		for (int p = 0; p < 62; p++) {			if (ans >= l && ans <= r) {				System.out.print(ans + " ");				c++;			}			if (Math.log10(ans) + Math.log10(k) > 18) {				break;			} else {				ans *= k;			}		}		if (c == 0) {			System.out.println("-1");		}	}}