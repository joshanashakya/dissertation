import java.io.*;import java.lang.*;import java.io.InputStream;import java.io.InputStreamReader;import java.io.BufferedReader;import java.io.OutputStream;import java.io.PrintWriter;import java.io.IOException;import java.util.StringTokenizer;import java.util.Random;import java.util.Arrays;import java.util.ArrayList;import java.util.Collections;import java.util.TreeMap; public class Rating1600_597A {    static InputReader in = new InputReader(System.in);    static PrintWriter out = new PrintWriter(System.out);     public static void main(String[] args) {        long k = in.nextLong();        long a = in.nextLong();        long b = in.nextLong();        if(a<=0){            if(b<0){                out.print(Math.abs(a/k-(b+1)/k));            }            else{                out.print(Math.abs(a/k)+Math.abs(b/k)+1);            }        }        else{            out.print(b/k-(a-1)/k);        }        out.close();    }    static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }        public long nextLong()        {            return Long.parseLong(next());        }        public double nextDouble()        {            return Double.parseDouble(next());        }        public String nextLine()        {            try            {                return reader.readLine();            }            catch(Exception e)            {                e.printStackTrace();            }            return null;        }        public boolean hasNext()        {            String next=null;            try            {                next=reader.readLine();            }            catch(Exception e)            {            }            if(next==null)            {                return false;            }            tokenizer=new StringTokenizer(next);            return true;        }    }}
