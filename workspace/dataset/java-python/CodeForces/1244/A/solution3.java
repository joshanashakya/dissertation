 import java.util.Scanner; public class Main {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int t = sc.nextInt();		double a,b;		int c,d,e;		while(t-- != 0) {			a = sc.nextDouble();			b = sc.nextDouble();			c = sc.nextInt();			d = sc.nextInt();			e = sc.nextInt();			int pen = (int) Math.ceil(a/c);			int pencil = (int) Math.ceil(b/d);			if(pen + pencil <= e) {				System.out.println(pen+" "+pencil);			}else {				System.out.println(-1);			}		}	}}
