import java.util.Scanner; public class P570B {		public static void main(String[] args) { 		Scanner s = new Scanner(System.in);		int n = s.nextInt();		int m = s.nextInt();		if (n == 1) {			System.out.println(1);		} else {			if (n - m > m - 1) {				System.out.println(m + 1);			} else {				System.out.println(m - 1);			}		} 	} }