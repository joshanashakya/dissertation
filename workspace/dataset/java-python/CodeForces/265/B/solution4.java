import java.util.*;import java.io.*; public class Main {     public static void main(String[] args) throws IOException {         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        StringBuilder out = new StringBuilder();        StringTokenizer tk;         int oldN = 0;        int n = Integer.parseInt(in.readLine());        long minTime = 2*n-1;         for (int i = 0; i < n; i++) {            int h = Integer.parseInt(in.readLine());            minTime += Math.abs(oldN-h);            oldN = h;        }         System.out.println(minTime);     } }