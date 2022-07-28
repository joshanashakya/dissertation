import java.math.BigInteger;
import java.util.Scanner;

public class B implements Runnable {
	public static final double eps = 1e-6;

	public static void main(String[] args) {
		new Thread(null, new B(), "Solver", 1L << 26).start();
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		seen = new boolean[10_001];
		cycleEntry = -1;

		long n = scan.nextLong();
		if (n == 1) {
			System.out.println("0/1");
			return;
		}
		Fraction ans = solve((int) n, 1).l;
		ans.reduce();
		System.out.println(ans);
	}

	static BigInteger gcd(BigInteger a, BigInteger b) {
		if (b.equals(BigInteger.ZERO))
			return a;
		return gcd(b, a.mod(b));
	}

	static BigInteger lcm(BigInteger a, BigInteger b) {
		return a.divide(gcd(a, b)).multiply(b);
	}

	static class Fraction {
		BigInteger a, b;

		public Fraction(BigInteger a, BigInteger b) {
			this.a = a;
			this.b = b;
			if(Math.random() < .001)
				this.reduce();
		}

		public Fraction(long a, long b) {
			this(BigInteger.valueOf(a), BigInteger.valueOf(b));
		}

		public void reduce() {
			BigInteger gcd = gcd(a, b);
			a = a.divide(gcd);
			b = b.divide(gcd);
		}

		public Fraction add(Fraction f) {
			BigInteger cd = lcm(b, f.b);

			return new Fraction(cd.divide(b).multiply(a).add(cd.divide(f.b).multiply(f.a)), cd);
		}

		public Fraction multiply(Fraction f) {
			return new Fraction(a.multiply(f.a), b.multiply(f.b));
		}

		public String toString() {
			return a + "/" + b;
		}
	}

	static int cycleEntry;
	static boolean[] seen;

	static Pair solve(int n, int k) {
		int state = k;
		if (k == 0) {
			return new Pair(new Fraction(0, 1), new Fraction(0, 1));
		}
		if (seen[state]) {
			cycleEntry = k;
			return new Pair(new Fraction(0, 1), new Fraction(1, 1));
		}
		seen[state] = true;
		int lg = Integer.highestOneBit((n + k - 1) / k);
		if (lg == (n + k - 1) / k)
			lg = Integer.numberOfTrailingZeros(lg);
		else
			lg = Integer.numberOfTrailingZeros(lg) + 1;
		k *= (1 << lg);
		Pair next = solve(n, k - n);
		Fraction f = new Fraction(k - n, k);
		Pair ans = next.multiply(f).add(new Fraction(lg, 1));
		if (state == cycleEntry) {
			// System.out.println("found recurrence, T(" + state +") = " + ans.l
			// + " + " + ans.r + " * T(" + state + ")" );
			return new Pair(ans.l.multiply(new Fraction(ans.r.b, ans.r.b.subtract(ans.r.a))), new Fraction(0, 1));
		}
		return ans;
	}

	static class Pair {
		Fraction l, r;

		public Pair(Fraction l, Fraction r) {
			this.l = l;
			this.r = r;
		}

		public Pair add(Fraction f) {
			return new Pair(l.add(f), r);
		}

		public Pair multiply(Fraction f) {
			return new Pair(l.multiply(f), r.multiply(f));
		}

		@Override
		public String toString() {
			return "(" + l + "," + r + ")";
		}
	}
}

