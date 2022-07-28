import javax.swing.plaf.IconUIResource;import java.io.*;import java.lang.ref.SoftReference;import java.math.BigInteger;import java.nio.file.LinkOption;import java.util.*;//_________________________________________________________________public class Main {    static int n=(int)(1e6+10);    static int a[]= new int[n];    static void  solve(){        int fact[]= new int[n];        for (int i=1;i<n;i++){            for (int j=i;j<n;j+=i){                fact[j]++;            }            if (fact[i]==4)a[i]=1;         }        for (int i=1;i<n;i++){            a[i]+=a[i-1];        }    }     public static void main(String[] args) throws IOException {  //        File file = new File("input.txt");        FastScanner sc = new FastScanner();//                Scanner sc= new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);        int n=sc.nextInt();        int a[]=sc.readArray(n);        int gcd=a[0];        for (int i=1;i<n;i++){            gcd=gcdInt(a[i],gcd);        }        for (int i=0;i<n;i++){            a[i]=a[i]/gcd;            while (a[i]%2==0||a[i]%3==0){                if (a[i]%2==0)a[i]/=2;                if (a[i]%3==0)a[i]/=3;            }            if (a[i]!=1){                System.out.println("NO");                return;            }        }        System.out.println("YES");          out.flush();    }    //------------------------------------if-------------------------------------------------------------------------------------------------------------------------------------------------    //sieve    static void primeSieve(int a[]){        //mark all odd number as prime        for (int i=3;i<=1000000;i+=2){            a[i]=1;        }        for (long i=3;i<=1000000;i+=2){            //if the number is marked then it is prime            if (a[(int) i]==1){                //mark all muliple of the number as not prime                for (long j=i*i;j<=1000000;j+=i){                    a[(int)j]=0;                }            }        }        a[2]=1;        a[1]=a[0]=0;    }    static void sort(int[] a) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : a) l.add(i);        Collections.sort(l);        for (int i = 0; i < a.length; i++) a[i] = l.get(i);    }    static String sortString(String s) {        char temp[] = s.toCharArray();        Arrays.sort(temp);        return new String(temp);    }    static class Pair implements Comparable<Pair> {        long a;        long b;         public Pair(long a, long b) {            this.a = a;            this.b = b;        }        //        to sort first part//        public int compareTo(Pair other) {//            if (this.a == other.a) return other.b > this.b ? -1 : 1;//            else if (this.a > other.a) return 1;//            else return -1;//        }//        public int compareTo(Pair other) {//            if (this.b == other.b) return 0;//            if (this.b < other.b) return 1;//            else return -1;//        }        //sort on the basis of first part only        public int compareTo(Pair other) {            if (this.a == other.a) return 0;            else if (this.a > other.a) return 1;            else return -1;        }     }    static int[] frequency(String s){        int fre[]= new int[26];        for (int i=0;i<s.length();i++){            fre[s.charAt(i)-'a']++;        }        return fre;    }    static int mod =(int)1e9;    static long mod(long x) {        return ((x % mod + mod) % mod);    }    static long add(long x, long y) {        return mod(mod(x) + mod(y));    }    static long mul(long x, long y) {        return mod(mod(x) * mod(y));    }    static int[] find(int n, int start, int diff) {        int a[] = new int[n];        a[0] = start;        for (int i = 1; i < n; i++) a[i] = a[i - 1] + diff;        return a;    }    static void swap(int a, int b) {        int c = a;        a = b;        b = c;    }    static void printArray(int a[]) {        for (int i = 0; i < a.length; i++) {            System.out.print(a[i] + " ");        }    }    static boolean sorted(int a[]) {        int n = a.length;        boolean flag = true;        for (int i = 0; i < n - 1; i++) {            if (a[i] > a[i + 1]) flag = false;        }        if (flag) return true;        else return false;    }    public static int findlog(long n) {        if (n == 0)            return 0;         if (n == 1)            return 0;        if (n == 2)            return 1;        double num = Math.log(n);        double den = Math.log(2);        if (den == 0)            return 0;        return (int) (num / den);    }    public static long gcd(long a, long b) {        if (b % a == 0)            return a;        return gcd(b % a, a);    }    public static int gcdInt(int a, int b) {         if (b % a == 0)            return a;         return gcdInt(b % a, a);     }    static void sortReverse(int[] a) {        ArrayList<Integer> l = new ArrayList<>();        for (int i : a) l.add(i);        //        Collections.sort.(l);        Collections.sort(l, Collections.reverseOrder());        for (int i = 0; i < a.length; i++) a[i] = l.get(i);    }    static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++) a[i] = nextInt();            return a;        }         long[] readArrayLong(long n) {            long[] a = new long[(int) n];            for (int i = 0; i < n; i++) a[i] = nextLong();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }}
