import java.util.*; import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     // index where we last encountered a number as a divisor    static int MAXN = 100_001;    int[] lastUsedIndex = new int[MAXN];    int[] usedPrimes = new int[MAXN];     static LinkedList<Integer> primes = new LinkedList<>();    static {        boolean[] isPrime = new boolean[MAXN];        Arrays.fill(isPrime, true);        for (int i = 2; i < isPrime.length; i++) {            if (isPrime[i]) {                primes.offerLast(i);                for (long p = ((long)i)*i; p < isPrime.length; p+=i) {                    isPrime[(int)p] = false;                }            }        }    }     void run(FastScanner in, PrintWriter out) {        Arrays.fill(lastUsedIndex, -1);         int N = in.nextInt();        ArrayList<Integer> currFactorization = new ArrayList<>();        for (int i = 0; i < N; i++) {            currFactorization.clear();             currCnt = 0;            int a = in.nextInt();            int y = in.nextInt();            earliestPos = i-y;            currPos = i;             int ta = a;            for (int p : primes) {                if (ta % p == 0) currFactorization.add(p);                while (ta % p == 0) {                    ta /= p;                    usedPrimes[p]++;                }                if (ta == 1) break;            }             // update used pos            go(currFactorization, 0, 1);            if (y == 0) currCnt++;            out.println(currCnt);             for (int p : currFactorization) usedPrimes[p] = 0;        }    }     int currCnt = 0;    int earliestPos = 0;    int currPos = 0;    void go(List<Integer> currFactorization, int index, int v) {        if (index == currFactorization.size()) return;        int currPrime = currFactorization.get(index);         go(currFactorization, index+1, v);        for (int i = 1; i <= usedPrimes[currPrime]; i++) {            v *= currPrime;            if (lastUsedIndex[v] < earliestPos) currCnt++;            lastUsedIndex[v] = currPos;            go(currFactorization, index+1, v);        }    }      static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}