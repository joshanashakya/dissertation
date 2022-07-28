import java.util.Scanner;


public class eqaution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int[] a=new int[n+1];
			int[] b=new int[n+1];
			for(int i=1;i<=n;i++) {
				a[i]=scn.nextInt();
				b[i]=scn.nextInt();
			}
			int[] tm=new int[n+1];
			for(int i=1;i<=n;i++) {
				tm[i]=scn.nextInt();
			}
			
			int last=0;
			int ans=0;
			for(int i=1;i<=n;i++) {
				
				int arrival=a[i]-b[i-1]+last+tm[i];
				ans=arrival;
//				System.out.println(arrival);
				if(arrival==a[i]) {
					last=arrival+b[i]-a[i];
				}else {
					last=arrival+(int)Math.ceil((b[i]-a[i])/2.0);
				}
//				System.out.println(last);
			}
			System.out.println(ans);
		}
	}

	

}

