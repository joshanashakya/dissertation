import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.Random;import java.util.StringTokenizer;import java.io.BufferedReader;import java.io.InputStreamReader; public class Two {     public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.call(in,out);         out.close();    }     static class TaskA {        public void call(InputReader in, PrintWriter out) {            int n ,k , a = 0 , b = 0;            n = in.nextInt();            k = in.nextInt();            for (int i = 1; i <=n-k ; i++) {                out.print(i+" ");            }            a = n-k;            a++;            b = n;            for (int i = 0; i <k ;i++) {                if(i%2==0) {                    out.print(b+" ");                    b--;                }                else{                    out.print(a+" ");                    a++;                }            }         }    }     static final Random random=new Random();     static void shuffleSort(int[] arr) {        int n=arr.length;        for (int i=0; i<n; i++) {            int a=random.nextInt(n), temp=arr[a];            arr[a]=arr[i];            arr[i]=temp;        }        Arrays.sort(arr);    }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }        public long nextLong(){            return Long.parseLong(next());        }     }}
