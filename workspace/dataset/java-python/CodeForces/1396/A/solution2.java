import java.util.*;

public class A_Multiples_of_Length {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int ar[]=new int[n];
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(1+" "+n);
        for(i=0;i<n;i++)
        {
            System.out.print(((long)-1*(long)ar[i]*(long)n)+" ");
        }
        System.out.println();
        System.out.println(1+" "+1);
        System.out.println((long)(n-1)*(long)ar[0]);
        if(n==1)
        {
            System.out.println(1+" "+1);
            System.out.println(0);
            return;
        }
        System.out.println(2+" "+n);
        for(i=1;i<n;i++)
        {
            System.out.print((long)(n-1)*(long)ar[i]+" ");
        }
    }
}
