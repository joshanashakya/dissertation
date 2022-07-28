import java.util.Scanner;
public class p1485A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;) {
            int a=sc.nextInt(),b=sc.nextInt(),c=1<<30;
            for(int i=0;i<69;i++) c=Math.min(c,i+calc(a,b+i));
            System.out.println(c);
        }
    }
    static int calc(int a,int b) {
        int c=0;
        if(b==1) {b++;c++;}
        while(a>0) {
            a/=b;
            c++;
        }
        return c;
    }
}
