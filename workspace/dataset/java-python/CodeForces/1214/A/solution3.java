import java.io.*;import java.util.Scanner;public class Main{	//static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	static Scanner in = new Scanner(System.in);	public static void main(String[] args) {		int n , d ,e;		int ans = Integer.MAX_VALUE ;		n = in.nextInt();d = in.nextInt() ; e = in.nextInt();	    int num1;	    for(int i = 0;i <= (n / (e * 5));i++) {	        num1 = (n - e*5 * i) % d;	        ans = Math.min(ans, num1);	    }		System.out.println(ans);			}}
