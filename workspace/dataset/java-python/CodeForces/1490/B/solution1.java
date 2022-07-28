import java.util.*;

public class CodeForces1490B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int j = 0;j<t;j++){
			int n = input.nextInt();
			int[] a = new int[3];
			for(int i = 0;i<n;i++){
				int c = input.nextInt();
				a[c%3]++;
			}
			int count = 0;
			n/= 3;
			for(int i = 0;i<5;i++){
				if(a[i%3] > n){
					a[(i+1)%3]+= a[i%3]-n;
					count+= a[i%3]-n;
					a[i%3] = n;
				}
			}
			System.out.println(count);
		}
	}
}
