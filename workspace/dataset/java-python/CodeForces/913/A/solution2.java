import java.util.*;import java.lang.*;import java.io.*; public class modularExponentiation{   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   public static void main (String[] args) throws java.lang.Exception   {            solve();   }    public static void solve() throws IOException{            int n = Integer.parseInt(br.readLine());      int m = Integer.parseInt(br.readLine());       if(n >=33){         System.out.println(m);      }else{         System.out.println(m%(int)Math.pow(2, n));      }    }}
