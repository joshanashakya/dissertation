import java.io.*;import java.util.*;   public class Main {    public static Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in), 640000));    public static PrintWriter out = new PrintWriter(System.out);      public static void solve(){        int t = in.nextInt();        for(int i = 0 ; i < t ; ++i){            int n = in.nextInt() ;            long totalSum = ((long)n * (n+1))/ 2 ;            int maxPower = 0;            while(Math.pow(2, maxPower) <= n){                maxPower++ ;            }             out.println(totalSum - (2 * (long)(Math.pow(2, maxPower) - 1)));        }     }     public static void main(String args[]) {        solve();        out.close();    }}      