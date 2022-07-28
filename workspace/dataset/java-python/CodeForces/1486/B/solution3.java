import java.util.*;
public class EasternExhibition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long a[]=new long[n];
			long b[]=new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				b[i]=sc.nextLong();
			}
			if(n%2==1)
				System.out.println("1");
			else {
				Arrays.sort(a);
				Arrays.sort(b);
				System.out.println((a[n/2]-a[n/2-1]+1L)*(b[n/2]-b[n/2-1]+1L));
			}
		}
	}

}

