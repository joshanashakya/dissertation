import java.io.*;import java.math.BigDecimal;import java.math.BigInteger;import java.math.RoundingMode;import java.util.*;import java.util.concurrent.LinkedBlockingDeque;  public class scratch_25 {    // int count=0;    //static long count=0;    static class Reader {        static BufferedReader reader;        static StringTokenizer tokenizer;         /**         * call this method to initialize reader for InputStream         */        static void init(InputStream input) {            reader = new BufferedReader(                    new InputStreamReader(input));            tokenizer = new StringTokenizer("");        }         /**         * get next word         */        static String next() throws IOException {            while (!tokenizer.hasMoreTokens()) {                //TODO add check for eof if necessary                tokenizer = new StringTokenizer(                        reader.readLine());            }            return tokenizer.nextToken();        }         static int nextInt() throws IOException {            return Integer.parseInt(next());        }         static double nextDouble() throws IOException {            return Double.parseDouble(next());        }         static long nextLong() throws IOException {            return Long.parseLong(next());        }    }         static class Pair implements Comparable<Pair>{        int x;        int y;        public Pair(int x,int y){            this.x=x;            this.y=y;        }        @Override        public int compareTo(Pair o){            return this.x-o.x;          }        @Override        public boolean equals(Object me) {            Pair binMe = (Pair)me;            if(this.x==binMe.x && this.y==binMe.y)                return true;            else                return false;        }         @Override        public int hashCode() {            return this.x + this.y;        }         @Override        public String toString() {            return x+" "+y;        }      }        class BinaryIndexedTree    {        // Max tree size        final static int MAX = 1000;          int BITree[] = new int[MAX];     /* n --> No. of elements present in input array.    BITree[0..n] --> Array that represents Binary                    Indexed Tree.    arr[0..n-1] --> Input array for which prefix sum                    is evaluated. */         // Returns sum of arr[0..index]. This function        // assumes that the array is preprocessed and        // partial sums of array elements are stored        // in BITree[].        int getSum(int index)        {            int sum = 0; // Iniialize result             // index in BITree[] is 1 more than            // the index in arr[]            index = index + 1;             // Traverse ancestors of BITree[index]            while(index>0)            {                // Add current element of BITree                // to sum                sum += BITree[index];                 // Move index to parent node in                // getSum View                index -= index & (-index);            }            return sum;        }         // Updates a node in Binary Index Tree (BITree)        // at given index in BITree. The given value        // 'val' is added to BITree[i] and all of        // its ancestors in tree.        public  void updateBIT(int n, int index,                                     int val)        {            // index in BITree[] is 1 more than            // the index in arr[]            index = index + 1;             // Traverse all ancestors and add 'val'            while(index <= n)            {                // Add 'val' to current node of BIT Tree                BITree[index] += val;                 // Update index to that of parent                // in update View                index += index & (-index);            }        }         /* Function to construct fenwick tree        from given array.*/        void constructBITree(int arr[], int n)        {            // Initialize BITree[] as 0            for(int i=1; i<=n; i++)                BITree[i] = 0;             // Store the actual values in BITree[]            // using update()            for(int i = 0; i < n; i++)                updateBIT(n, i, arr[i]);        }}               public static void main(String[] args)  throws IOException {        Reader.init(System.in);        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));        int t= Reader.nextInt();        for (int tt = 0; tt <t ; tt++) {            char our[] = Reader.next().toCharArray();            char their[] = Reader.next().toCharArray();            char nay[] = new char[our.length];            for (int i = 0; i < our.length; i++) {                nay[i] = our[i];            }            Arrays.sort(nay);            boolean done=false;            for (int i = 0; i < our.length; i++) {                if (our[i] != nay[i]) {                    for (int j = our.length - 1; j > i; j--) {                        if (our[j] == nay[i]) {                            char c = our[j];                            our[j] = our[i];                            our[i] = c;                            done=true;                            break;                        }                    }                    if(done){                        break;                    }                }            }        //    System.out.println(Arrays.toString(our));            boolean b=true;            boolean b1=false;            for (int i = 0; i <Math.min(our.length,their.length) ; i++) {                if(our[i]>their[i]){                    b=false;                    break;                }                if(our[i]<their[i]){                    b1=true;                    break;                }            }            if(b && their.length<=our.length && !b1){                out.append("---");            }            if(!b){                out.append("---");            }            if(b && their.length>our.length && !b1){                for (int i = 0; i <our.length ; i++) {                    out.append(our[i]);                }            }            if(b && b1){                for (int i = 0; i <our.length ; i++) {                    out.append(our[i]);                }             }out.append('\n');            }        out.flush();        out.close();        }                          public static ArrayList<Integer> Sieve(int n) {        boolean arr[]= new boolean [n+1];        Arrays.fill(arr,true);        arr[0]=false;        arr[1]=false;        for (int i = 2; i*i <=n ; i++) {            if(arr[i]){                for (int j = 2; j <=n/i ; j++) {                    int u= i*j;                    arr[u]=false;                }}        }        ArrayList<Integer> ans= new ArrayList<>();        for (int i = 0; i <n+1 ; i++) {            if(arr[i]){                ans.add(i);            }        }        return ans;    }        static long power( long x, long y, long p)    {         long res = 1;          x = x % p;         if (x == 0) return 0;         while (y > 0)        {             if((y & 1)==1)                res = (res * x) % p;              y = y >> 1;            x = (x * x) % p;        }        return res;    }     public static long ceil_div(long a, long b){        return (a+b-1)/b;    }     static long gcd(long a, long b)    {        if (a == 0)            return b;        return gcd(b % a, a);    }     static long lcm(long a, long b)    {        return (a*b)/gcd(a, b);    } }
