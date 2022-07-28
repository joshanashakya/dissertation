import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Main{     public static void main(String[] args) throws IOException    {         FastScanner input = new FastScanner();        int x1Min = Integer.MAX_VALUE, x1Max = Integer.MIN_VALUE;        int y1Min = Integer.MAX_VALUE, y1Max = Integer.MIN_VALUE;        int x2Min = Integer.MAX_VALUE, x2Max = Integer.MIN_VALUE;        int y2Min = Integer.MAX_VALUE, y2Max = Integer.MIN_VALUE;        int n = input.nextInt();        for (int i = 0; i < n; i++) {            int x = input.nextInt();            int y = input.nextInt();            x1Min = Math.min(x1Min, x);            x1Max = Math.max(x1Max, x);            y1Min = Math.min(y1Min, y);            y1Max = Math.max(y1Max, y);        }        int m = input.nextInt();         for (int i = 0; i < m; i++) {            int x = input.nextInt();            int y = input.nextInt();            x2Min = Math.min(x2Min, x);            x2Max = Math.max(x2Max, x);            y2Min = Math.min(y2Min, y);            y2Max = Math.max(y2Max, y);        }        int ans = Math.max(x2Max-y1Min, x1Max-y2Min);        ans = Math.max(0, ans);        System.out.println(ans);    }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
