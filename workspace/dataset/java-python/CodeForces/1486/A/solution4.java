import java.util.*;
public class ShiftingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			long j=0,k=0;
			boolean is=true;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				j+=i;
				k+=a[i];
				if(j>k)
					is=false;
			}
				
				
				System.out.println(is?"YES":"NO");
			
			
		}
	}

}

