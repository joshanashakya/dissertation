import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),q=sc.nextInt(),a[]=new int[n],c[]=new int[2];
            for(int i=0;i<n;i++)c[a[i]=sc.nextInt()]++;
            while(q-->0) {
                int x=sc.nextInt(),y=sc.nextInt();
                if(x==1) {
                    if(a[y-1]==0) {c[0]--;c[1]++;}
                    else {c[1]--;c[0]++;}
                    a[y-1]=1-a[y-1];
                }else 
                    System.out.println(c[1]>=y?1:0);
                
            }
    }
}
