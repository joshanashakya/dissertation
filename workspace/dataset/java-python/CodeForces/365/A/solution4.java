import java.util.Scanner; public class GoodNumber {	public static void main(String[] args) { 		Scanner in = new Scanner(System.in);		int n = in.nextInt(), k = in.nextInt(), i, j, c = 0;		for (i = 0; i < n; i++) { 			String s = in.next();			char[] a = new char[10];			boolean b = true;						for (j = 0; j < s.length(); j++) {				int l = Integer.valueOf(s.substring(j, j + 1));				a[l]++;			}			for (j = 0; j < 10; j++) {				if (a[j] < 1 && j <= k) {					b = false;					break;				}			}			if (b)				c++;		}		in.close();		System.out.println(c);	}}
