import java.util.Scanner;


public class eqaution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			int cake=0;
			int[] ans=new int[n];
			for(int i=n-1;i>=0;i--) {
				cake=Math.max(cake, arr[i]);
				if(cake>0) {
					ans[i]=1;
					cake--;
				}
			}
			for(int v:ans) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}

	

}

