import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            int b[]=new int[n+1];
            int tm[]=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
                b[i]=sc.nextInt();
            }
            for(int i=1;i<=n;i++){
                tm[i]=sc.nextInt();
            }
            int prev=0;
            int ans=0;
            for(int i=1;i<=n;i++){
                prev+=a[i]-b[i-1]+tm[i];
                ans=prev;
                prev+=Math.ceil(1.0*(b[i]*1.0-a[i]*1.0)/2.0);
                prev=Math.max(prev,b[i]);
            }
            System.out.println(ans);
        }
    }
}
