import java.io.*;import java.util.*; public class Main {     public static void main(String[] args) throws Exception {        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        PrintWriter out = new PrintWriter(System.out);        StringTokenizer st = new StringTokenizer(in.readLine());        long a = Integer.parseInt(st.nextToken());        long b = Integer.parseInt(st.nextToken());        long m = Integer.parseInt(st.nextToken());         a = Math.min(m, a);        for (long i = 0; i <= a; i++) {            long q = (m-(((long)1e9*i)%m))%m;            if (q > b) {                out.println("1 " + String.format("%09d", i));                out.close();                return;            }        }        out.println("2");        out.close();    } }/*  */
