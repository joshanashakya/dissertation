import java.io.*;import java.util.*; public class A_822 {    static PrintWriter pw = new PrintWriter(System.out);     public static void main(String arg[]) throws IOException {        InputStreamReader isr = new InputStreamReader(System.in);        BufferedReader br = new BufferedReader(isr);        StringTokenizer token = new StringTokenizer(" ");         int n=0;        int m=0;         token=new StringTokenizer(br.readLine());         m=Integer.parseInt(token.nextToken());        n=Integer.parseInt(token.nextToken());          pw.println(getResult(m,n));         pw.close();     }     private static long getResult(int m,int n) {         return getFactorial(Math.min(m,n));     }     private static long getFactorial(int n){        int i=0;        long fact=1;         for(i=1;i<=n;i++)            fact=fact*i;         return fact;    }}