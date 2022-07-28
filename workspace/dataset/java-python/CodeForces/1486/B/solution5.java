import java.util.*;

public class CodeForces1486B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0;i<t;i++){
			int n = input.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];

			for(int j = 0;j<n;j++){
				x[j] = input.nextInt();
				y[j] = input.nextInt();
			}

			Arrays.sort(x);
			Arrays.sort(y);

			if(n%2 == 1){
				System.out.println(1);
			}
			else{
				long a = x[n/2] - x[n/2-1] + 1;
				long b = y[n/2] - y[n/2-1] + 1;
				System.out.println(a*b);
			}	
		}
	}
}
