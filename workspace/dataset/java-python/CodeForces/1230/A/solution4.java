import java.util.Arrays;import java.util.Scanner; public class Main { 	public static void main(String[] args) throws Exception {		Scanner in = new Scanner(System.in);		int[] a = new int[4];		for (int i = 0; i < 4; i++)			a[i] = in.nextInt();		Arrays.sort(a);		int x = 0;		int y = 0; 		x = x + a[3];		y = y + a[2] + a[1];		if (x + a[0] == y) {			System.out.println("YES");			return;		}		if (y + a[0] == x) {			System.out.println("YES");			return;		}		System.out.println("NO"); 	}}
