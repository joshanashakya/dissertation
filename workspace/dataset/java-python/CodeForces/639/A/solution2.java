import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.*;import java.io.BufferedReader;import java.io.InputStreamReader; public class Two {     public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskA solver = new TaskA();        solver.call(in,out);         out.close();    }     static class TaskA {        public void call(InputReader in, PrintWriter out) {            int n, k, q , a ,b ,c =0 , d =0;            n = in.nextInt();            k = in.nextInt();            q = in.nextInt();             int[] arr = new int[n+1];            int[] array = new int[k];             for (int i = 1; i <n+1 ; i++) {                arr[i] = in.nextInt();            }            for (int i = 0; i <q ; i++) {                a = in.nextInt();                b = in.nextInt();                if(c==k){                    Arrays.sort(array);                }                if(a==1){                    if(c!=k) {                        array[c] = arr[b];                        c++;                    }                    else{                        if(arr[b]>array[0]){                            array[0] = arr[b];                        }                    }                }                else{                    d=0;                    for (int j = 0; j <array.length ; j++) {                        if(arr[b]==array[j]){                            out.println("YES");                            d++;                            break;                        }                     }                    if(d==0)                        out.println("NO");                 }            }        }    }     static final Random random=new Random();     static void shuffleSort(int[] arr) {        int n=arr.length;        for (int i=0; i<n; i++) {            int a=random.nextInt(n), temp=arr[a];            arr[a]=arr[i];            arr[i]=temp;        }        Arrays.sort(arr);    }     static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }        public long nextLong(){            return Long.parseLong(next());        }     }}