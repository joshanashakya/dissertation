import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int a1=Integer.MAX_VALUE;
            int b1=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                if(a[j]<a1)
                {
                    a1=a[j];
                }    
                
            }
            for(int j=0;j<n;j++)
            {
                b[j]=sc.nextInt();
                if(b1>b[j])
                {
                    b1=b[j];
                }
            }
            long ans=0;
            for(int j=0;j<n;j++)
            {
                ans=ans+Math.max(a[j]-a1,b[j]-b1);
               /* while(a[j]>a1 || b[j]>b1)
                {
                    if(a[j]>a1 && b[j]>b1)
                    {
                        a[j]--;
                        b[j]--;
                        ans++;
                    }else if(a[j]>a1)
                    {
                       a[j]--;
                       ans++;
                    }else{
                        b[j]--;
                        ans++;
                    }
                }*/
            }
            System.out.println(ans);
        }
    }
}
