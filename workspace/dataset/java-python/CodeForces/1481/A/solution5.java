import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Practice {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while ((t--) > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			String str=s.next();
			int u=0,d=0,l=0,r=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='U') {
					u++;
				}else if(str.charAt(i)=='D') {
					d--;
				}else if(str.charAt(i)=='L') {
					l--;
				}else {
					r++;
				}
			}
			if(n>=l&&n<=r&&m>=d&&m<=u) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}

