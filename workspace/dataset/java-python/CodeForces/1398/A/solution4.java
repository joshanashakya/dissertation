import java.util.*;
public class op
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int i,j;
        while(t-->0)
        {
            int n=in.nextInt();
            //int k=in.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            if(a[0]+a[1]<=a[n-1])
            System.out.println(1+" "+2+" "+n);
            else
            System.out.println(-1);
        }
    }
}
//https://codeforces.com/problemset/problem/1466/C
    
