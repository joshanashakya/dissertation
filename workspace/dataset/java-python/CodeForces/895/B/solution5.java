import java.util.*;public class MyClass {    static Integer[]a;    static int n,k,x;    static int numDiv(int i,int j){        return a[j]/x-(a[i]-1)/x;    }    public static void main(String args[]) {        Scanner sc=new Scanner(System.in);         n=sc.nextInt();         x=sc.nextInt();         k=sc.nextInt();        a=new Integer[n];        for(int i=0;i<n;i++)            a[i]=sc.nextInt();        Arrays.sort(a);        long ans=0;        for(int i=0,l=0,r=0;i<n;i++)        {            while(l<n && (a[l]<a[i] || numDiv(i,l)<k))                l++;              while(r<n && (a[r]<a[i] || numDiv(i,r)<=k))                r++;            // if(l<n && numDiv(i,l)==k)            ans+=r-l;        }        System.out.println(ans);            }}