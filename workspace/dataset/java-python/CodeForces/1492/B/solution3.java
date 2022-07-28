import java.util.Scanner;
public class p1492B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;) {
            int n=sc.nextInt(),a[]=new int[n],c[]=new int[n+1];
            boolean vis[]=new boolean[n+1];
            for(int i=0;i<n;i++) c[a[i]=sc.nextInt()]=i;
            c[0]=-1;
            int pre=n;
            StringBuilder sb=new StringBuilder();
            for(int i=n;i>0;i--) {
                if(!vis[i]) {
                    for(int j=c[i];j<pre;j++) {
                        sb.append(a[j]+" ");
                        vis[a[j]]=true;
                    }
                    pre=c[i];
                }
            }
            System.out.println(sb.toString());
        }
    }
}
