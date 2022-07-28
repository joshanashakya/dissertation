import java.util.Scanner;
public class p1486A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        l:for(int t=sc.nextInt();t-->0;) {
            long n=sc.nextInt(),a[]=new long[(int)n],sum=0;
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) {
                sum+=a[i]-i;
                if(sum<0) {System.out.println("NO"); continue l;}
            }
            System.out.println("YES");
        }
    }
}
