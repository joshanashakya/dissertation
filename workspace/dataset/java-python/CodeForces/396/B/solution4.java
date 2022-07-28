import java.io.*;import java.math.BigInteger;public class Main {    static PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    public static void main(String[] args) throws IOException {        BufferedReader bf=new BufferedReader(new InputStreamReader( System.in));        int t=Integer.parseInt(bf.readLine());        int n=0;        for (int i = 0; i <t ; i++) {            n=Integer.parseInt(bf.readLine());            solve(n);        }        pw.flush();    }    public static void solve(int n){        long u = n, v = n + 1;        while(!BigInteger.valueOf(u).isProbablePrime(10))            u--;        while(!BigInteger.valueOf(v).isProbablePrime(10))            v++;        long a = v * (u - 2) + 2 * (n - u + 1), b = 2 * u * v;        long g = gcd(a, b);        pw.write ( a / g+"/"+ b / g+"\n");    }    static long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }}