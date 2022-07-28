import java.util.Scanner;
public class p1485B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt(),k=sc.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        while(q-->0) {
            int l=sc.nextInt()-1,r=sc.nextInt()-1;
            System.out.println((a[r]-a[l]+1-(r-l+1))*2+k-a[r]+a[l]-1);
        }
    }
}

