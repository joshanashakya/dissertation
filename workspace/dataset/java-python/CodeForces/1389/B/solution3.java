import java.util.*;
 
public class B_Array_Walk {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0)
        {
            int n = sc.nextInt();
            int k=sc.nextInt();
            int z=sc.nextInt();
            int ar[]=new int[n];
            int i=0;
            for(i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            
            long ans=0;
            for(int t=0;t<=z;t++)
            {
                int pos=k-2*t;
                if(pos<0)continue;
                long s=0;
                long max=0;
                for(i=0;i<=pos;i++)
                {
                    if(i!=n-1)
                    {
                        max=Math.max(max,(long)(ar[i]+ar[i+1]));
                    }
                    s+=ar[i];
                }
                
                s+=(t)*max;
                ans=Math.max(ans,s);
            }
            System.out.println(ans);
        }
    }
}
