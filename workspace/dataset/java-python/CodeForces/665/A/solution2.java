//package adhoc;`import java.util.*;	import java.io.*;public class ex20 {	public static void main (String []args) throws IOException { 		Scanner sc = new Scanner (System.in);				int a = sc.nextInt(), ta = sc.nextInt(), b = sc.nextInt(), tb = sc.nextInt();		sc.useDelimiter(":|\\s+");		int h = sc.nextInt();		int m = sc.nextInt();		int minutes = ((h - 5) * 60) + m;		int min = Math.max(0, minutes - tb + 1);		int n = 19 * 60;		int max = Math.min(n, minutes + ta);				int count = 0;		for (int i = 0; i <= n/b; i++) {			if (b * i >= min && b * i < max) {				count  ++;							}		}						System.out.print(count);		 														sc.close();			}}
