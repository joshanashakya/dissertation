import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class Test
{
	public static void main(String[] args) {
		int T;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		while (T-->0) {
			int n = in.nextInt(), k = in.nextInt();
			k--;
			int ans; 
			if (n%2 == 0) ans = (k % n) + 1;
			else ans = (k + (k/(n/2))) % n + 1;
			
			System.out.println(ans);
		}
	}
}

