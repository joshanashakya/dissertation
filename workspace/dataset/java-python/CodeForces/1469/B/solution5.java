import java.util.*;public class anb{    public static void main(String args[])    {        Scanner in=new Scanner(System.in);        int t=in.nextInt();        int i,j;        while(t-->0)        {            int n=in.nextInt();            int a[]=new int[n];            int ar[]=new int[n];            for(i=0;i<n;i++)            {                a[i]=in.nextInt();                if(i!=0)                ar[i]=ar[i-1]+a[i];                else                ar[i]=a[i];            }            int m=in.nextInt();            int b[]=new int[m];            int br[]=new int[m];            for(i=0;i<m;i++)            {                b[i]=in.nextInt();                if(i!=0)                br[i]=br[i-1]+b[i];                else                br[i]=b[i];            }            int max1=0,max2=0;            for(i=0;i<n;i++)            {                if(ar[i]>max1)                max1=ar[i];            }            for(i=0;i<m;i++)            {                if(br[i]>max2)                max2=br[i];            }            System.out.println(max1+max2);        }    }}    
