import java.io.*;import java.math.*;import java.util.*; /** * * @author Saju * */    public class Main {     private static int dx[] = { 1, 0, -1, 0 };    private static int dy[] = { 0, -1, 0, 1 };        private static int dx1[] = { 1, 1, 0, -1, -1, -1, 0, 1 };    private static int dy1[] = { 0, -1, -1, -1, 0, 1, 1, 1 };     private static final long INF = (long) Math.pow(10, 16);    private static final int INT_INF = Integer.MAX_VALUE;    private static final long NEG_INF = Long.MIN_VALUE;    private static final int NEG_INT_INF = Integer.MIN_VALUE;    private static final double EPSILON = 1e-10;     private static final long MAX = (long) 1e12;        private static final long MOD = 1000000007;     private static final int MAXN = 200001;    private static final int MAXA = 1000004;    private static final int MAXLOG = 22;    private static final double PI = Math.acos(-1);        public static void main(String[] args) throws IOException {         InputReader in = new InputReader(System.in);//        Scanner in = new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out); //         InputReader in = new InputReader(new FileInputStream("src/test.in"));//         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/test.out")));                 /*  */                                         int n = in.nextInt();        long arr[] = in.nextLongArr(n);        Arrays.sort(arr);        if(arr[0] == 1) {        	out.println("-1");        }        else {        	out.println("1");        }                        in.close();        out.flush();        out.close();        System.exit(0);    }  	/*     * return the number of elements in list that are less than or equal to the val     */    private static long upperBound(List<Long> list, long val) {        int start = 0;        int len = list.size();        int end = len - 1;        int mid = 0;         while (true) {            if (start > end) {                break;            }            mid = (start + end) >> 1;            long v = list.get(mid);            if (v == val) {                start = mid;                while(start < end) {                    mid = (start + end) >> 1;                    if(list.get(mid) == val) {                        if(mid + 1 < len && list.get(mid + 1) == val) {                            start = mid + 1;                        }                        else {                            return mid + 1;                        }                    }                    else {                        end = mid - 1;                    }                }                return start + 1;            }            if (v > val) {                end = mid - 1;            } else {                start = mid + 1;            }        }        if (list.get(mid) < val) {            return mid + 1;        }        return mid;    }      private static boolean isPalindrome(String str) {        StringBuilder sb = new StringBuilder();        sb.append(str);        String str1 = sb.reverse().toString();        return str.equals(str1);    }     private static String getBinaryStr(long n, int j) {        String str = Long.toBinaryString(n);        int k = str.length();        for (int i = 1; i <= j - k; i++) {            str = "0" + str;        }         return str;    }        private static long modInverse(long r) {        return bigMod(r, MOD - 2, MOD);    }        private static long bigMod(long n, long k, long m) {         long ans = 1;        while (k > 0) {            if ((k & 1) == 1) {                ans = (ans * n) % m;            }            n = (n * n) % m;            k >>= 1;        }        return ans;    }        private static long ceil(long n, long x) {        long div = n / x;        if(div * x != n) {            div++;        }        return div;    }        private static int ceil(int n, int x) {        int div = n / x;        if(div * x != n) {            div++;        }        return div;    }         private static int abs(int x) {        if (x < 0) {            return -x;        }        return x;    }        private static double abs(double x) {        if (x < 0) {            return -x;        }        return x;    }     private static long abs(long x) {        if(x < 0) {            return -x;        }        return x;    }        private static long lcm(long a, long b) {        return (a * b) / gcd(a, b);    }     private static int lcm(int a, int b) {        return (a * b) / gcd(a, b);    }     private static int gcd(int a, int b) {        if (a == 0)            return b;        return gcd(b % a, a);    }        private static long gcd(long a, long b) {        if (a == 0)            return b;        return gcd(b % a, a);    }     private static int log(long x, int base) {        return (int) (Math.log(x) / Math.log(base));    }     private static int log(long x, long base) {        return (int) (Math.log(x) / Math.log(base));    }        private static long min(long a, long b) {        if (a < b) {            return a;        }        return b;    }     private static int min(int a, int b) {        if (a < b) {            return a;        }        return b;    }     private static long max(long a, long b) {        if (a < b) {            return b;        }        return a;    }     private static int max(int a, int b) {        if (a < b) {            return b;        }        return a;    }     private static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream));            tokenizer = null;        }         public List<Integer> nextList(int n) {            List<Integer> list = new ArrayList<>();            for(int i = 0; i < n; i++) {                list.add(nextInt());            }            return list;        }                public List<Long> nextLongList(int n) {            List<Long> list = new ArrayList<>();            for(int i = 0; i < n; i++) {                list.add(nextLong());            }            return list;        }         public String next() {            try {                while (tokenizer == null || !tokenizer.hasMoreTokens()) {                    tokenizer = new StringTokenizer(reader.readLine());                 }            } catch (IOException e) {                return null;            }            return tokenizer.nextToken();        }         public String nextLine() {            String line = null;            try {                tokenizer = null;                line = reader.readLine();            } catch (IOException e) {                throw new RuntimeException(e);            }            return line;        }         public int nextInt() {            return Integer.parseInt(next());        }         public double nextDouble() {            return Double.parseDouble(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public boolean hasNext() {            try {                while (tokenizer == null || !tokenizer.hasMoreTokens()) {                    tokenizer = new StringTokenizer(reader.readLine());                }            } catch (Exception e) {                return false;            }            return true;        }                public int[] nextIntArr(int n) {            int arr[] = new int[n];            for(int i = 0; i < n; i++) {                arr[i] = nextInt();            }            return arr;        }                public long[] nextLongArr(int n) {            long arr[] = new long[n];            for(int i = 0; i < n; i++) {                arr[i] = nextLong();            }            return arr;        }                public int[] nextIntArr1(int n) {            int arr[] = new int[n + 1];            for(int i = 1; i <= n; i++) {                arr[i] = nextInt();            }            return arr;        }                public long[] nextLongArr1(int n) {            long arr[] = new long[n + 1];            for(int i = 1; i <= n; i++) {                arr[i] = nextLong();            }            return arr;        }               public void close() {            try {                if(reader != null) {                    reader.close();                }            }            catch(Exception e) {                            }                                }    } } 	 				 	 	  	 			 	  			   			
