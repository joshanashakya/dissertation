import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class NewClass1 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int t = ob.nextInt();
		while (t-- > 0) {
			int n = ob.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = ob.nextInt();
				b[a[i] - 1] = i;
			}
			int s;
			int e = n;
			for (int i = a.length - 1; i >= 0; i--) {
				s = b[i];
				if (s < e) {
					for (int j = s; j < e; j++) {
						System.out.print(a[j] + " ");
					}
					e = s;
				}
			}
			System.out.println();
		}
	}
}

