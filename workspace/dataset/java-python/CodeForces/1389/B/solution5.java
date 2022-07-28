import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import static java.lang.Math.log;
import static java.lang.Math.min;

public class First {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.call(in, out);
        out.close();

    }

    static class TaskA {
        int n, k, z;
        long[][] dp = new long[6][100001];
        int[] arr = new int[100001];
        public void call(InputReader in, PrintWriter out) {

            int t;
            t = in.nextInt();
            //t = 1;
            while (t > 0) {

                n = in.nextInt();
                k = in.nextInt();
                z = in.nextInt();

                for (int i = 0; i < z + 1; i++) {
                    for (int j = 0; j < n + 1; j++) {
                        dp[i][j] = -1;
                    }
                }

                for (int i = 1; i <= n; i++) {
                    arr[i] = in.nextInt();
                }

                out.println(arr[1] + ans(1, 1, 1, z));

                t--;

            }
        }
        public long ans(int totalMove, int  lastMove , int index , int leftMove){

            if(dp[leftMove][index]!=-1){
                return dp[leftMove][index];
            }

            if(totalMove>k || index<=0){
                return 0;
            }


            if(lastMove==0 || leftMove ==0 ){
                dp[leftMove][index] = arr[index+1] + ans(totalMove+1,1,index+1,leftMove);
                return dp[leftMove][index];
            }
            if(dp[leftMove][index]==-1) {
                dp[leftMove][index] = Math.max(arr[index - 1] + ans(totalMove+1, 0 ,index-1 ,leftMove-1), arr[index + 1] + ans(totalMove + 1,1,index+1,leftMove ));
            }
            return dp[leftMove][index];

        }
    }

    static class answer implements Comparable<answer> {
        int a, b;

        public answer(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(answer o) {
            return this.a - o.a;
        }
    }


    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static final Random random=new Random();

    static void shuffleSort(int[] arr) {
        int n=arr.length;
        for (int i=0; i<n; i++) {
            int a=random.nextInt(n), temp=arr[a];
            arr[a]=arr[i];
            arr[i]=temp;
        }
        Arrays.sort(arr);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
