import java.util.*;import java.io.*;public class Asd {     static Scanner s=new Scanner(System.in);    static PrintWriter w=new PrintWriter(System.out); public static void main(String args[])  {        int t=1;//s.nextInt();    while(t-->0)    {            solve();       }    w.close();   } public static void solve() {    int n=s.nextInt();int k=s.nextInt();int h=01;    int arr[]=new int[n];int z=0;int neg=0;    for(int i=0;i<n;i++){        arr[i]=s.nextInt();if(arr[i]==0)z++;else if(arr[i]<0)neg++;}    for(int i=0;i<neg;i++)    {        if(h<=k)        {arr[i]*=(-1);h++;}    }    int sum=0;Arrays.sort(arr);    for(int i=0;i<n;i++)        sum+=arr[i];    if(h<=k&&z==0)    {        if((k-h)%2==0)            sum-=(2*arr[0]);    }    w.println(sum);    return; }    }
