import java.util.*; public class Main {     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        while (scanner.hasNext()) {            int[] a=new int[1010];            int n=scanner.nextInt();            int l=0,r=0;            for(int i=1;i<=n;i++)                a[i]=scanner.nextInt();            for(int i=1;i<=n;i++)                if(a[i]!=i)                {                    l=i;                    break;                }            for(int i=n;i>=1;i--)                if(a[i]!=i)                {                    r=i;                    break;                }            for(int i=l;i<r;i++)            {                if(a[i]<a[i+1])                {                    System.out.println("0 0");                    return ;                }            }            if(l==0&&r==0)            {                System.out.println("0 0");                return;            }            System.out.println(l+" "+r);        }    }} 	 		 	  			 						 		   					