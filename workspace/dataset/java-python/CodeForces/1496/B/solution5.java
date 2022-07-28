import java.util.*;


public class Main {
	private static final int N= (int) 1e6+10;
    public static void main(String[] args) {
		int t, n, k;
		Scanner r = new Scanner(System.in);
		t = r.nextInt();
		while (t-- > 0) {
			int[] a = new int[N];
			n = r.nextInt();
			k = r.nextInt();
			int i;
			for(i=1;i<=n;i++)
				a[i]=r.nextInt();
			Arrays.sort(a,1,n+1);
			int mex=n,max=a[n];
			for(i=1;i<=n;i++)
				if(a[i]!=i-1)
				{
					mex=i-1;
					break;
				}
			if(k==0)
				System.out.println(n);
			else if(max==n-1 && mex==n)
				System.out.println((n+k));
			else
			{
				int v=(mex+max+1)/2,f=1;
				//System.out.println(mex+" "+max+" "+v);
				for(i=1;i<=n;i++)
					if(a[i]==v)
					{
						f=0;
						break;
					}
				System.out.println(n+f);
			}
		}
	}

}
