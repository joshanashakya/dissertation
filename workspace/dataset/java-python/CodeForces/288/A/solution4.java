import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.StringTokenizer; public class CF288A {    public static void main(String[] args) {        FastReader input = new FastReader();        PrintWriter pw = new PrintWriter(System.out);         int n = input.nextInt();        int k = input.nextInt();         if(n < k){            pw.println(-1);        }        else if(n > 1 && k == 1){            pw.println(-1);        }        else{            if(n == 1 && k == 1){                pw.println("a");            }            else{                char first = 'a';                char sec = 'b';                int left = k - 2;                 int pos = n - left;                 for(int i = 1;i <= pos;i++){                    if(i % 2 != 0)                        pw.print(first);                    else                        pw.print(sec);                }                 char rest = 'c';                 for(int i = 1;i <= left;i++){                    pw.print((char)rest);                    rest++;                }                pw.println();            }        }         pw.flush();        pw.close();    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}