import java.util.*;import java.io.*;import java.math.BigInteger; public class cp{    public static void main(String[] args)throws IOException{         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        int n = Integer.parseInt(st.nextToken());        int v = Integer.parseInt(st.nextToken());         int req = (n-1);        //total fuel required after filling fully at city 1        int f = Math.min(v, req);        req -= v;        if (req < 0)            req = 0;         int amt = f * 1;                  // fuel in tank         // System.out.println(req);         for (int i=2; i<=n; i++) {            f--;            if (req > 0 && (f < v)){                f++;                amt += i;                req--;            }        }         System.out.println(amt);     }}
