import java.util.Scanner; public class Balloons {	public static void main(String[] args) { 		Scanner in = new Scanner(System.in);		int n = in.nextInt(), i, a[] = new int[n], s = 0; 		for (i = 0; i < n; i++) {			a[i] = in.nextInt();			s += a[i];		}		in.close(); 		for (i = 0; i < n; i++) {			if (a[i] != s - a[i] && s != a[i]) { 				System.out.println(1 + "\n" + (i + 1));				return;			}		}		System.out.println(-1);	}}
