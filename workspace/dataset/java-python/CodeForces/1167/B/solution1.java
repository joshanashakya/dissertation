import java.io.IOException;import java.util.Scanner; public class Main {	static Scanner in = new Scanner(System.in);		public static void main(String[] args) throws IOException {		int a2 = query(1, 2);		int a3 = query(1, 3);		int a4 = query(1, 4);		int a5 = query(1, 5);		int a1 = gcd(gcd(a2, a3), gcd(a4, a5));				if (a1 == 15 * 2 || a1 == 23 * 2) {			a1 /= 2;		}					a2 /= a1;		a3 /= a1;		a4 /= a1;		a5 /= a1;		int a6 = 4 + 8 + 15 + 16 + 23 + 42 - a1 - a2 - a3 - a4 - a5;		System.out.println("! " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);	}		public static int query(int i, int j) {		System.out.println("? " + i + " " + j);		System.out.flush();		return in.nextInt();	}		public static int gcd(int a, int b) {		return b == 0 ? a : gcd(b, a % b);	}	}
