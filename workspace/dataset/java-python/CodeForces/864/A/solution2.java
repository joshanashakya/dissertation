import java.util.*;import java.util.jar.JarOutputStream; public class Practise {     public static  int[][] dp;    public static void main(String[] args) {        //top- down approch        //fibonacci         Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        /// int m = sc.nextInt();        long[] a = new long[n];        // long sum = 0;        for (int i = 0; i < n; i++) {            long aa = sc.nextLong();            a[i]=aa;            // System.out.print(a[i]+" ");        }        Arrays.sort(a);        if(a[0]==a[n-1])        {            System.out.println("NO");        }else        {            long a1=a[0];            int ca1=0;            int ca2=0;            long a2=a[n-1];            for(int  i=0;i<n;i++)            {                if(a[i]==a1)                    ca1++;                if(a[i]==a2)                    ca2++;            }            if(ca1+ca2==n &&(ca1==ca2))            {                System.out.println("YES");                System.out.println(a1+" "+a2);            }             else                System.out.println("NO");        }        }         private static int BinarySearch(int a, int[] aa) {        int l=0;        int h=aa.length-1;        while(l<=h)        {            int mid= l+(h-l)/2;            if(aa[mid]==a)                return mid;            else if(aa[mid]>a)            {                h=mid-1;            }else            {                l=mid+1;            }        }        return l;    }     private static int pow(int a, int ans, int p) {        int res=1;        while (ans!=0){            if(ans%2==1)            {                res=((res*a)%p);            }            ans/=2;            a=((a*a)%p);        }        return res;    }     private static long Gcd(long i, long n) {        if(n==0)            return i;        else return Gcd(n,i%n);    }    public static  void answer(int[] arr , int l ,int r , int k)    {        int pivot  = (int) (Math.random() * (r-l + 1)) +l;     } }			  	 			 			  	 	 	 					   	
