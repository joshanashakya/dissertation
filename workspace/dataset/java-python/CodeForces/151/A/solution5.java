//package codeforces; import java.util.Scanner; public class CapitalSmall {		public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int k = sc.nextInt();		int l = sc.nextInt();		int c = sc.nextInt();		int d = sc.nextInt();		int p = sc.nextInt();		int nl = sc.nextInt();		int np = sc.nextInt();				sc.close();				int drinks = (k * l) / nl;		int salt = p / np;		int limes = c * d;				System.out.println(Math.min(Math.min(drinks, salt), limes) / n);	}}
