import java.io.*;
import java.util.*;


public class CF704 {
	static int t;
	static long p, a, b, c;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			p = sc.nextLong();
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			
			System.out.println(Math.min((a - p % a) % a, Math.min((b - p % b) % b, (c - p % c) % c)));
		}
	}
}

