//package CodeForces; import java.io.*;import java.util.*; public class Main {     public class Haha {        /*                     _____                                                             ___                /\      /\    |     | |   |    /\       /\      /\       /\      /\       /\    |   \     محمد أبوحسن*               /  \    /  \   |     | |___|   /__\     /  \    /  \     /  \    /  \     /__\   |    \              /    \  /    \  |     | |   |  /    \   /    \  /    \   /    \  /    \   /    \  |    /             /      \/      \ |_____| |   | /      \ /      \/      \ /      \/      \ /      \ |___/         */    }     public static class MyScanner {         BufferedReader br;        StringTokenizer st;         public MyScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }     public static class MyPair {         int x;        int y;         public MyPair(int x, int y) {            this.x = x;            this.y = y;        }    }     public static int Fibonacci(int n) {        int[] a = new int[n + 1];        a[0] = 0;        a[1] = 1;        for (int i = 2; i < a.length; i++) {            a[i] = a[i - 1] + a[i - 2];        }        return a[n];    }     public static boolean isprime(int n) {        for (int i = 2; i * i <= n; i++) {            if (n % i == 0) {                return true;            }        }        return false;    }     public static int[] addarr(int[] a, int n) {        for (int i = 0; i < n; i++) {            a[i] = sc.nextInt();        }        return a;    }        public static int fact(int n){        int fact = 1;        for(int i = 1; i <= n; i++)            fact *= i;        return fact;    }        public static long sumDigit(long n){        int a = 0;        while(n != 0){            a += n%10;            n /= 10;        }        return a;    }            public static MyScanner sc = new MyScanner();    public static int MOD = 1000000007;    // __builtin_popcountll(n) <-- c++ // binary count(1) ex. 8 --> 0100 --> 1    HashSet<Integer> set = new HashSet<>();    HashMap<Integer, Integer> map = new HashMap<>();    Random r = new Random();    ArrayList<Integer> l = new ArrayList<>();        public static void main(String[] args) {        int k = sc.nextInt();        if(k > 36){            System.out.println(-1);            return;        }        for (int i = 0; i < k/2; i++)             System.out.print(8);        if(k%2 != 0)            System.out.println(4);    }}
