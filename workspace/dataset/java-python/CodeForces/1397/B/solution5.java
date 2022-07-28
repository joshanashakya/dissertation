import java.util.*;
import java.io.*;

public class Main
{
    public static long MIN(long a,long b)
    {
        if(a<b)
            return a;
        return b;
    }
    public static int MAX(int a,int b)
    {
        if(a>b)
            return a;
        return b;
    }
    public static int BS(int[] x,int val,int n)
    {
       // int n = x.length;
        int l=0,h=n-1,ans=0;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(x[mid]<=val)
            {
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] inp2 = br.readLine().split(" ");
        for(int i=0;i<n;i++)
        a[i] = Integer.parseInt(inp2[i]);
        Arrays.sort(a);
        long cost2 = Long.MAX_VALUE;
        int j = n-1;
        long cost=0;
        int floor =(int) Math.floor(Math.pow(a[j],1/(float)(j)));
        int ceil = (int)Math.ceil(Math.pow(a[j],1/(float)(j)));
        int floorpow = (int)Math.pow(floor,j);
        int ceilpow = (int)Math.pow(ceil,j);
        int diff = Math.abs(floorpow-a[j]);
        int c = floor;
        int diff2 = Math.abs(ceilpow-a[j]);
        for(int i=0;i<n;i++)
        {
            cost+=Math.abs(Math.pow(c,i)-a[i]);
        }
        cost2 = MIN(cost,cost2);
        cost =0;
        c = ceil;
        
        for(int i=0;i<n;i++)
        {
            cost+=Math.abs(Math.pow(c,i)-a[i]);
        }
        cost2 = MIN(cost,cost2);
        bw.write(cost2+"\n");
        
        bw.flush();
}
}
class pair{
    int x,y;
    pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}
