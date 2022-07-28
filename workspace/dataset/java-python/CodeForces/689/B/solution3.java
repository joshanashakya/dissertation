    import java.util.*;    import java.io.*;    //import java.lang.*;     public class ranjan{         //public static Read cin;        public static InputReader cin;        public static PrintWriter cout;        public static int n;        public static int[] d,a;        public static boolean[] visited;        public static final long bil = (long)1e9+7;        public static int fileread = 0;                 public static void main(String ...arg) throws IOException        {            /*console writer*/            cout = new PrintWriter(new BufferedOutputStream(System.out));            /*Debug Reader*/            //Scan cin =new Scan();            if(fileread == 1)            {                try                {                //cin = new Read(new FileInputStream(new File("in2.txt")));                cin = new InputReader(new FileInputStream(new File("in3.txt")));                }                catch (IOException error){}            }            else{                //cin = new Read(System.in);                cin = new InputReader(System.in);            }             //input            n = cin.nextInt();            a = new int[n+1];            for(int i=1;i<=n;i++) a[i] = cin.nextInt();             d = new int[n+1]; //array to store distance            for(int i=1;i<=n;i++) d[i] = i-1; //default distance for each node             dfs(1);             //output            for(int i=1;i<=n;i++) cout.print(d[i]+" ");            cout.close();        }         //for each node we have three efficient possible direction to move        // first is shortcut node, second and third are the adjascent nodes        //we will only move to next node if we get any advantage in distance          public static void dfs(int node){            if(d[a[node]] > d[node]+1){                d[a[node]] = d[node]+1;                dfs(a[node]);            }             if(node>1 && d[node-1] >= d[node]+1){                d[node-1] = d[node]+1;                dfs(node-1);            }             if(node<n && d[node+1] >= d[node]+1){                d[node+1] = d[node]+1;                dfs(node+1);            }        }          private static class Pair{            public int a,b;            public Pair(int a,int b)            {                this.a = a;                this.b = b;            }	        }          /*public static void seive(int size)        {            prime[0] = prime[1] = false;            int p = 2;            while(p*p<= size)            {                if(prime[p])                {                    for(int i=p*p;i<size;i += p)                         prime[i] = false;                }                p++;            }        }*/          public static <K, V> V getOrDefault(HashMap<K,V> map, K key, V defaultValue) {            return map.containsKey(key) ? map.get(key) : defaultValue;        }                static void reverseArray(int intArray[], int size)         {             int i, temp;             for (i = 0; i < size / 2; i++) {                 temp = intArray[i];                 intArray[i] = intArray[size - i - 1];                 intArray[size - i - 1] = temp;             }          }          public static long mod_pow(long x,long n,long mod) {            long res=1;            while(n>0) {                if((n&1)==1)res=res*x%mod;                x=x*x%mod;                n>>=1;            }            return res;        }        public static int gcd(int n1, int n2)         {            int r;            while (n2 != 0)             {                r = n1 % n2;                n1 = n2;                n2 = r;            }            return n1;        }            /*public static int lcm(int n1, int n2)         {            int answer = (n1 * n2) / (gcd(n1, n2));            return answer;        }*/          static class InputReader {            final InputStream is;            final byte[] buf = new byte[1024];            int pos;            int size;                public InputReader(InputStream is) {                this.is = is;            }                public int nextInt() {                int c = read();                while (isWhitespace(c))                    c = read();                int sign = 1;                if (c == '-') {                    sign = -1;                    c = read();                }                int res = 0;                do {                    if (c < '0' || c > '9')                        throw new InputMismatchException();                    res = res * 10 + c - '0';                    c = read();                } while (!isWhitespace(c));                return res * sign;            }                int read() {                if (size == -1)                    throw new InputMismatchException();                if (pos >= size) {                    pos = 0;                    try {                        size = is.read(buf);                    } catch (IOException e) {                        throw new InputMismatchException();                    }                    if (size <= 0)                        return -1;                }                return buf[pos++] & 255;            }                static boolean isWhitespace(int c) {                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;            }            }     static class RecursionLimiter {        public static long maxLevel = 100000L;         public static void emerge() {            if (maxLevel == 0)                return;            try {                throw new IllegalStateException("Too deep, emerging");            } catch (IllegalStateException e) {                if (e.getStackTrace().length > maxLevel + 1)                    throw e;            }        }    }      static class Scan {            private byte[] buf=new byte[1024];            private int index;            private InputStream in;            private int total;            public Scan()            {                in=System.in;            }            public int scan()throws IOException            {                if(total<0)                throw new InputMismatchException();                if(index>=total)                {                    index=0;                    total=in.read(buf);                    if(total<=0)                    return -1;                }                return buf[index++];            }            public int scanInt()throws IOException            {                int integer=0;                int n=scan();                while(isWhiteSpace(n))                n=scan();                int neg=1;                if(n=='-')                {                    neg=-1;                    n=scan();                }                while(!isWhiteSpace(n))                {                    if(n>='0'&&n<='9')                    {                        integer*=10;                        integer+=n-'0';                        n=scan();                    }                    else throw new InputMismatchException();                }                return neg*integer;            }            public double scanDouble()throws IOException            {                double doub=0;                int n=scan();                while(isWhiteSpace(n))                n=scan();                int neg=1;                if(n=='-')                {                    neg=-1;                    n=scan();                }                while(!isWhiteSpace(n)&&n!='.')                {                    if(n>='0'&&n<='9')                    {                        doub*=10;                        doub+=n-'0';                        n=scan();                    }                    else throw new InputMismatchException();                }                if(n=='.')                {                    n=scan();                    double temp=1;                    while(!isWhiteSpace(n))                    {                        if(n>='0'&&n<='9')                        {                            temp/=10;                            doub+=(n-'0')*temp;                            n=scan();                        }                        else throw new InputMismatchException();                    }                }                return doub*neg;            }            public String scanString()throws IOException            {                StringBuilder sb=new StringBuilder();                int n=scan();                while(isWhiteSpace(n))                n=scan();                while(!isWhiteSpace(n))                {                    sb.append((char)n);                    n=scan();                }                return sb.toString();            }            private boolean isWhiteSpace(int n)            {                if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)                return true;                return false;            }        }     }     class Read    {        private BufferedReader br;        private StringTokenizer st;         public Read(InputStream is)        { br = new BufferedReader(new InputStreamReader(is)); }         String next()        {            while (st == null || !st.hasMoreElements())            {                try {st = new StringTokenizer(br.readLine());}                catch(IOException e)                    {e.printStackTrace();}            }            return st.nextToken();        }         int nextInt()        { return Integer.parseInt(next()); }         long nextLong()        { return Long.parseLong(next()); }         double nextDouble()        { return Double.parseDouble(next()); }         String nextLine()        {            String str = "";            try {str = br.readLine();}            catch(IOException e)                {e.printStackTrace();}            return str;        }    } 
