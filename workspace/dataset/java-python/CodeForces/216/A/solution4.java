import java.util.*;import java.lang.*; // https://codeforces.com/contest/216/problem/Apublic class A216 { 	static Scanner sc;	public static void solve() {			}		public static void main(String[] args) {		sc = new Scanner(System.in);		int a = sc.nextInt();		int b = sc.nextInt();		int c = sc.nextInt();				System.out.println(			a * b + b*c + c * a - a - b - c + 1		);				sc.close();	} }