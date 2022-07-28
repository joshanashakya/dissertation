
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static int n;
    static Fraction[] memo = new Fraction[100100];
    static boolean[] vis = new boolean[100100];

    static Fraction DP(int root, long depth) {
        int n2 = 0;
        while (n % 2 == 0) {
            n >>= 1;
            ++n2;
        }
        if (n == 1) {
            return new Fraction(n2, 1);
        }
        Fraction A = new Fraction(0, 1);
        Fraction B = new Fraction(1, 1);
        int lastRem = 1;
        int cnt = 0;
        while (root != 0) {
            int k;
            for (k = 0; (lastRem << k) < n; k++);
            int rem = (lastRem << k) - n;
            A = A.add(B.multiply(k));
            B = B.multiply(rem);
            B.b = B.b.shiftLeft(k).multiply(BigInteger.valueOf(lastRem));
            if (rem == 1) {
                B.a = B.b.subtract(B.a);
                A = A.devide(B);
                break;
            }
            lastRem = rem;
            cnt++;
            if (cnt % 30 == 0) {
                A.reduce();
                B.reduce();
            }
        }
        A.a = A.a.add(A.b.multiply(BigInteger.valueOf(n2)));
        return A;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n == 0) {
            System.out.println("0/1");
            return;
        }
        Fraction ans = DP(1, 0);
        ans.reduce();
        PrintWriter out = new PrintWriter(System.out);
        out.print(ans.a + "/" + ans.b);
        out.close();
    }
}

class Fraction {

    BigInteger a = new BigInteger("0");
    BigInteger b = new BigInteger("1");

    Fraction() {

    }

    Fraction(long a, long b) {
        this.a = new BigInteger("" + a);
        this.b = new BigInteger("" + b);
    }

    Fraction(BigInteger a, BigInteger b) {
        this.a = a;
        this.b = b;
    }

    Fraction add(BigInteger x) {
        Fraction ans = new Fraction(a, b);
        ans.a = ans.a.add(x.multiply(b));
        return ans;
    }

    Fraction multiply(BigInteger x) {
        Fraction ans = new Fraction(this.a, this.b);
        ans.a = ans.a.multiply(x);
        return ans;
    }

    Fraction add(long rhs) {
        BigInteger r = BigInteger.valueOf(rhs);
        BigInteger d = r.gcd(this.b);
        r = r.divide(d);
        return new Fraction(this.a.multiply(r), this.b.divide(d));
    }

    Fraction multiply(long x) {
        BigInteger bx = new BigInteger("" + x);
        Fraction ans = multiply(bx);
        return ans;
    }

    Fraction add(Fraction rhs) {
        BigInteger d = this.b.gcd(rhs.b);
        BigInteger y = this.b.divide(d).multiply(rhs.b);
        BigInteger x = this.a.multiply(y.divide(this.b)).add(rhs.a.multiply(y.divide(rhs.b)));
        return new Fraction(x, y);
    }

    Fraction multiply(Fraction rhs) {
        BigInteger arb = this.a.gcd(rhs.b);
        BigInteger bra = this.b.gcd(rhs.a);
        BigInteger x = this.a.divide(arb).multiply(rhs.a.divide(bra));
        BigInteger y = this.b.divide(bra).multiply(rhs.b.divide(arb));
        return new Fraction(x, y);
    }

    Fraction devide(Fraction x) {
        Fraction y = new Fraction(x.b, x.a);
        Fraction ans = multiply(y);
        return ans;
    }

    BigInteger GCD(BigInteger a, BigInteger b) {
        for (;;) {
            if (a.equals(BigInteger.ZERO)) {
                return b;
            }
            b = b.mod(a);
            if (b.equals(BigInteger.ZERO)) {
                return a;
            }
            a = a.mod(b);
        }
    }

    void reduce() {
        BigInteger G = a.gcd(b);
        a = a.divide(G);
        b = b.divide(G);
    }
}

