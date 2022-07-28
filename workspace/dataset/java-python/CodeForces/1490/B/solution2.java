import java.util.Arrays;
import java.util.Scanner;

public class _0640BalancedRemainders {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases>0) {
			int n=sc.nextInt();
			int[] arr = new int[3];
			for(int i=0;i<n;i++) {
				arr[sc.nextInt()%3]++;
			}
			int count=0;
			while(arr[0]!=arr[1] || arr[0]!=arr[2]) {
			for(int i=0;i<3;i++) {
				if(arr[i]>n/3) {	
					arr[i]--;
					arr[(i+1)%3]++;
					count++;
				}
			}
			}
			System.out.println(count);
			cases--;
		}
	}

}

