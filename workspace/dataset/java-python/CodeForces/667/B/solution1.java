import java.util.*; // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail         public class asd {   static Scanner s=new Scanner(System.in);    public static void main(String args[] ) throws Exception {                //Scanner       int t=1;       while(t-->0)       {           solve();       }    }   public  static void solve()    {      int n=s.nextInt();      long arr[]=new long[n];      for(int i=0;i<n;i++)          arr[i]=s.nextLong();      Arrays.sort(arr);      long sum=0;      for(int i=0;i<n-1;i++)          sum+=arr[i];      System.out.println(arr[n-1]-sum+1);    }}
