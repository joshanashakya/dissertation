import java.util.*;

public class CodeForces1491B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0;i<t;i++){
			int n = input.nextInt();
			int u = input.nextInt();
			int v = input.nextInt();

			int[] a = new int[n];
			for(int j = 0;j<n;j++){
				a[j] = input.nextInt();
			}

			int min = Integer.MAX_VALUE;
			for(int j = 1;j<n;j++){
				if(a[j] - a[j-1] == 0){
					min = Math.min(min,v+Math.min(u,v));
				}
				else if(Math.abs(a[j] - a[j-1]) > 1){
					min = 0;
					break;
				}
				else{
					min = Math.min(min,Math.min(u,v));
				}
			}

			System.out.println(min);
		}
	}
}
