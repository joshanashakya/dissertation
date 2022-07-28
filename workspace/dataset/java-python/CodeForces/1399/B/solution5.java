import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int am=Integer.MAX_VALUE;
            int bm=Integer.MAX_VALUE;
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]<am)
                am=a[i];
            }
            long s1=0,s2=0;
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            if(b[i]<bm)
            bm=b[i];
            }
            for(int i=0;i<n;i++)
            s1+=(long)Math.max(a[i]-am,b[i]-bm);
            
        System.out.println(s1);
        }
     }
}
