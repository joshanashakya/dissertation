import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(bf.readLine().trim());
		int in = n.intValue(), L = 0;
		while((in&1) == 0) {
			in>>=1; L++;
		}
		if (in==1) { System.out.printf("%d/1\n", L); return ;}
		n = new BigInteger(String.valueOf(in));
		BigInteger s = BigInteger.ONE, t = BigInteger.ONE, two = new BigInteger("2");
		int m = 0;
		for(int i=0;i<in;i++) {
			s = s.multiply(two);
			t = t.multiply(two).mod(n);
			if (t.equals(BigInteger.ONE)) {
				m = i+1; break;
			}
		}
		t = s.multiply(n);
		BigInteger r = s, ans = BigInteger.ZERO;
		int i = L;
		while(r.compareTo(BigInteger.ONE) > 0) {
			i++; t=t.divide(two);
			if (r.compareTo(t) > 0) {
				r = r.subtract(t);
				ans = ans.add(t.multiply(new BigInteger(String.valueOf(i))));
			}
		}
		ans = ans.add(new BigInteger(String.valueOf(m)));
		s = s.subtract(BigInteger.ONE);
		BigInteger d = ans.gcd(s);
		System.out.printf("%s/%s\n", ans.divide(d), s.divide(d));
	}
}

