import java.util.Scanner; public class Main {   public static void main(String[] args) {       Scanner scan=new Scanner(System.in);        int n=scan.nextInt();       boolean b[]=new boolean[n];       long count=0;       long a[]=new long[n];       for(int i=0;i<n;i++)                   a[i]=scan.nextLong();              long l=0,m=n;       for(int i=n-1;i>=0;i--){               long t=i-a[i];               if(i<m)                   count++;               if(t<m)                   m=t;        }        System.out.println(count);   }}          
