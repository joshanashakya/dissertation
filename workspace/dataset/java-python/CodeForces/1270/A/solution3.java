import java.util.*; public class codechef {     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int t = scanner.nextInt();        while(t-->0){          int d=scanner.nextInt();          int k1=scanner.nextInt();          int k2=scanner.nextInt();           int a[] =new int[k1];          int[] b=new int[k2];          for(int i=0;i<k1;i++)              a[i]=scanner.nextInt();            for(int i=0;i<k2;i++)                b[i]=scanner.nextInt();             Arrays.sort(a);            Arrays.sort(b);            if(a[a.length-1]>b[b.length-1])                System.out.println("YES");            else System.out.println("NO");        }    }} 