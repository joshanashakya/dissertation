import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.*;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; public class Test {     public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.call(in,out);        out.close();    }     static class TaskA {        public void call(InputReader in, PrintWriter out) {            int n ,a , b=1 ;            n = in.nextInt();            a = (n/2)+1;            out.println(a);            for (int i = 1 , j = 1; i <=a && j<=a ; i++) {                if(b>n)                    break;                if(b%2==0){                    out.println(j+" "+i);                    j++;                    i--;                }                else{                    out.println(j+" "+i);                }                b++;             }             }    }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }        public long nextLong(){            return Long.parseLong(next());        }     }}
