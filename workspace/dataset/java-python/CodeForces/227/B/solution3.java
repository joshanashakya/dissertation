import javax.print.DocFlavor;import javax.swing.*;import java.awt.image.BandedSampleModel;import java.util.*; public class Example {    static long[][] dp;    //  static    int[]  ar;    static int mod = 1000000000 + 7;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);       int n =sc.nextInt();      int [] arr =new int[n+1];      Map<Integer,Integer> map = new HashMap<>();      for(int i=1;i<=n;i++){          int a =sc.nextInt();          map.put(a,i);      }      int m=sc.nextInt();      long  a1=0;      long b2=0;      int[] qu= new int[m];      for(int i=0;i<m;i++){          int a=sc.nextInt();         int j=map.get(a);                  a1=a1+j;                  b2=b2+(n-j+1);                  //System.out.println(a1+" "+b2);             }         System.out.println(a1+" "+b2);      }     private static long ans(int n, int m, int[] blue, int[] res) {         if (n == res.length && m == blue.length)            return 0;        else {            long a = -1000000000;            if (n < res.length)                a = Math.max(res[n], res[n] + ans(n + 1, m, blue, res));            long b = 0;            if (m < blue.length)                b = Math.max(blue[m], blue[m] + ans(n, m + 1, res, blue));            return Math.max(a, b);          }      }      private static long Answer(int i, int[] blue, int[] res) {        if (i == blue.length && res.length == i) {            return 0;        } else {              long a = 0;            if (i < blue.length) {                a = Math.max(a + blue[i], Answer(i + 1, blue, res));            }            if (i < res.length) {                a = Math.max(a + res[i], Answer(i + 1, blue, res));            }            return a;        }      }}      
