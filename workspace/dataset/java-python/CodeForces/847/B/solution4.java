    import java.util.*;    import java.io.*;    //import java.lang.*;     public class ranjan{         //public static Read cin;        public static InputReader cin;        public static PrintWriter cout;        public static int[] visited;        public static final long bil = (long)1e9+7;        public static int fileread = 0;                 public static void main(String ...arg) throws IOException        {            /*console writer*/            cout = new PrintWriter(new BufferedOutputStream(System.out));            /*Debug Reader*/            //Scan cin =new Scan();clear                        if(fileread == 1)            {                try                {                //cin = new Read(new FileInputStream(new File("in3.txt")));                cin = new InputReader(new FileInputStream(new File("in1.txt")));                }                catch (IOException error){}            }            else{                //cin = new Read(System.in);                cin = new InputReader(System.in);            }             //input            int n = cin.nextInt();            int[] a = new int[n];            for(int i=0;i<n;i++) a[i] = cin.nextInt();             int[] list = new int[n]; //array to store the current maximum            ArrayList<Integer>[] ans = new ArrayList[n]; //to store various increasing lists              for(int i=0;i<n;i++) ans[i] = new ArrayList<>();             for(int i=0;i<n;i++){                int ind = Arrays.binarySearch(list,a[i]);                //the increasing numbers will belong to same index in list                //instead of inserting a number just replace the current number with latest bigger one                if(ind<0) //if number does not exist then it is the first number in series so insert it at requied index                    ind = -1*ind-2;                list[ind] = a[i];                ans[ind].add(a[i]);            }             for(int i=n-1;i>=0;i--){                if(ans[i].size() == 0) break;                for(int x:ans[i])                    cout.print(x+" ");                cout.print("\n");            }            cout.print("\n");            cout.close();        }          private static class Pair{            public int a,b;            public Pair(int a,int b)            {                this.a = a;                this.b = b;            }	        }          /*public static void seive(int size)        {            prime[0] = prime[1] = false;            int p = 2;            while(p*p<= size)            {                if(prime[p])                {                    for(int i=p*p;i<size;i += p)                         prime[i] = false;                }                p++;            }        }*/          public static <K, V> V getOrDefault(HashMap<K,V> map, K key, V defaultValue) {            return map.containsKey(key) ? map.get(key) : defaultValue;        }                static void reverseArray(int intArray[], int size)         {             int i, temp;             for (i = 0; i < size / 2; i++) {                 temp = intArray[i];                 intArray[i] = intArray[size - i - 1];                 intArray[size - i - 1] = temp;             }          }          public static long mod_pow(long x,long n,long mod) {            long res=1;            while(n>0) {                if((n&1)==1)res=res*x%mod;                x=x*x%mod;                n>>=1;            }            return res;        }        public static int gcd(int n1, int n2)         {            int r;            while (n2 != 0)             {                r = n1 % n2;                n1 = n2;                n2 = r;            }            return n1;        }            /*public static int lcm(int n1, int n2)         {            int answer = (n1 * n2) / (gcd(n1, n2));            return answer;        }*/          static class InputReader {            final InputStream is;            final byte[] buf = new byte[1024];            int pos;            int size;                public InputReader(InputStream is) {                this.is = is;            }                public int nextInt() {                int c = read();                while (isWhitespace(c))                    c = read();                int sign = 1;                if (c == '-') {                    sign = -1;                    c = read();                }                int res = 0;                do {                    if (c < '0' || c > '9')                        throw new InputMismatchException();                    res = res * 10 + c - '0';                    c = read();                } while (!isWhitespace(c));                return res * sign;            }                int read() {                if (size == -1)                    throw new InputMismatchException();                if (pos >= size) {                    pos = 0;                    try {                        size = is.read(buf);                    } catch (IOException e) {                        throw new InputMismatchException();                    }                    if (size <= 0)                        return -1;                }                return buf[pos++] & 255;            }                static boolean isWhitespace(int c) {                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;            }            } }      class Read{    private BufferedReader br;    private StringTokenizer st;     public Read(InputStream is)    { br = new BufferedReader(new InputStreamReader(is)); }     String next()    {        while (st == null || !st.hasMoreElements())        {            try {st = new StringTokenizer(br.readLine());}            catch(IOException e)                {e.printStackTrace();}        }        return st.nextToken();    }     int nextInt()    { return Integer.parseInt(next()); }     long nextLong()    { return Long.parseLong(next()); }     double nextDouble()    { return Double.parseDouble(next()); }     String nextLine()    {        String str = "";        try {str = br.readLine();}        catch(IOException e)            {e.printStackTrace();}        return str;    }} 
