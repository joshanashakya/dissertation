import java.io.*;import java.util.*; import static java.lang.Integer.*; public class Main {    static int N = (int)Math.sqrt(100000);    static boolean[] isPrime;    static ArrayList<Integer> prime;    public static void main(String[] args) throws IOException {        Scanner in = new Scanner(System.in);        PrintWriter pw = new PrintWriter(System.out);        sieve();        int n = in.nextInt(), k = in.nextInt();        pw.println(primeFactor(n, k));        pw.close();    }    static void sieve() {        isPrime = new boolean[N + 5];        prime = new ArrayList<>();        Arrays.fill(isPrime, true);        isPrime[0] = isPrime[1] = false;        for (int i = 2; i * i <= N; i++) {            if (!isPrime[i])continue;            for (int j = i * i; j <= N; j+=i) {                isPrime[j] = false;            }        }        for (int i = 2; i <= N; i++) if (isPrime[i]) prime.add(i);    }    static String primeFactor(int n, int k) {        ArrayList<Integer> factor = new ArrayList<>();        int temp = n;        for (int i = 0; i < prime.size() && prime.get(i) * prime.get(i) <= n; i++) {            if (temp < prime.get(i)) break;            int p = prime.get(i);            if (temp % p == 0) {                while (temp % p == 0) {                    temp /= p;                    factor.add(p);                }            }        }        if (temp > 1) factor.add(temp);        if (factor.size() < k) return -1+"";        String res = "";        for (int i = 0; i < k - 1; i++) {            res = res + factor.get(i) + " ";        }        int ex = 1;        for (int i = k - 1; i < factor.size(); i++) {            ex *= factor.get(i);        }        return res + ex;    }     static void debug(Object... obj) {        System.err.println(Arrays.deepToString(obj));    } }