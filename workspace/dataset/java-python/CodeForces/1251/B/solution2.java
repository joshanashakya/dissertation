import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Main{     public static int countone(String s)    {        int count = 0;        for (int i = 0; i < s.length(); i++) {            if (s.charAt(i) == '0') {                count++;            }        }        return count;    }     public static void main(String[] args) throws IOException    {         FastScanner input = new FastScanner();        int tc = input.nextInt();                       while (tc-- > 0) {            int zero = 0;            int n = input.nextInt();            boolean check = false;            for (int i = 0; i < n; i++) {                String s = input.next();                int one = 0;                if (s.length() % 2 == 1) {                    check = true;                    continue;                }                zero+=( countone(s));             }            if (!check && zero % 2 == 1) {                System.out.println(n - 1);            } else {                System.out.println(n);            }        }     }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }