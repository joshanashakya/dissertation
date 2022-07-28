import java.util.*;

public class Solution {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t --> 0) {
			int n = sc.nextInt();

			int A[] = new int[n];
			for(int i=0; i<n; i++)
				A[i] = sc.nextInt();
			int min = Arrays.stream(A).min().getAsInt();
			int cnt = 0;
			for(int x: A) {
				if(x > min)
					cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();	
	}

}
