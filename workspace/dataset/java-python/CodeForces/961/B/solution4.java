import java.util.*; public class square{      public static void main(String[] args) {        Scanner sc=new Scanner(System.in);          int n=sc.nextInt(),k=sc.nextInt();   int[] a=new int[n],wake=new int[n];   int sum=0;for(int i=0;i<n;i++)a[i]=sc.nextInt();for(int i=0;i<n;i++){wake[i]=sc.nextInt();if(wake[i]==1)sum+=a[i];}int zeros=0,max=0;for(int i=0;i<k;i++)if(wake[i]==0){zeros++;max+=a[i];}int temp=max;for(int i=1;i<=n-k;i++){if(wake[i-1]==0)temp-=a[i-1];if(wake[i+k-1]==0)temp+=a[i+k-1];max=Math.max(max,temp);}System.out.println(sum+max);}}
