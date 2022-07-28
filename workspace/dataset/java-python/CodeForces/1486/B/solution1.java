import java.util.*;
public class p1486B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;) {
            int n=sc.nextInt(),x[]=new int[n],y[]=new int[n];
            for(int i=0;i<n;i++) {x[i]=sc.nextInt();y[i]=sc.nextInt();}
            Arrays.sort(x);
            Arrays.sort(y);
            System.out.println(n%2==1?1:(x[n/2]-x[n/2-1]+1L)*(y[n/2]-y[n/2-1]+1));
        }
    }
}
