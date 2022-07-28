import javax.swing.plaf.IconUIResource;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class codeforces{    static int M = 1_000_000_007;    static int INF = Integer.MAX_VALUE;    static final FastScanner fs = new FastScanner();     //variable     public static void main(String[] args) throws IOException {         int n = fs.nextInt();        int m = fs.nextInt();        int d = fs.nextInt();        int[][] arr = new int[n][m];        int min = INF, max = -INF;        for(int i=0; i<n; i++) {            for(int j=0; j<m; j++) {                arr[i][j] = fs.nextInt();                min = Math.min(min,arr[i][j]);                max = Math.max(max,arr[i][j]);            }        }        boolean ans = false;        int minStep = INF;        outer : for(int start = min; start<=max; start++) {            int step = 0;            for(int i=0; i<n; i++) {                for(int j=0; j<m; j++) {                    step += Math.abs(start -arr[i][j]);                    if(Math.abs(start -arr[i][j])%d == 0) continue;                    continue outer;                }            }            minStep = Math.min(step,minStep);            ans = true;        }        if(ans) System.out.println(minStep/d);        else System.out.println(-1);     }     //function      static void premutation(int n, ArrayList<Integer> arr,boolean[] chosen) {        if(arr.size() == n) {         }else {            for(int i=1; i<=n; i++) {                if(chosen[i]) continue;                arr.add(i);                chosen[i] = true;                premutation(n,arr,chosen);                arr.remove(new Integer(i));                chosen[i] = false;            }        }    }    static boolean isPalindrome(char[] c) {        int n = c.length;        for(int i=0; i<n/2; i++) {            if(c[i] != c[n-i-1]) return false;        }        return true;    }    // Template    static long nCk(int n, int k) {        return (modMult(fact(n),fastexp(modMult(fact(n-k),fact(k)),M-2)));    }     static long fact (long n) {         long fact =1;        for(int i=1; i<=n; i++) {            fact = modMult(fact,i);        }        return fact%M;    }     static long modMult(long a,long b) {        return a*b%M;    }     static long fastexp(long x, int y){        if(y==1) return x;         long ans = fastexp(x,y/2);        if(y%2 == 0) return modMult(ans,ans);        else return modMult(ans,modMult(ans,x));    }     static final Random random = new Random();     static void ruffleSort(int arr[])    {        int n = arr.length;        for(int i=0; i<n; i++)        {            int j = random.nextInt(n),temp = arr[j];            arr[j] = arr[i];            arr[i] = temp;        }        Arrays.sort(arr);    }      public static class Pairs implements Comparable<Pairs>    {        int value,index;        Pairs(int value, int index)        {            this.value = value;            this.index = index;        }        public int compareTo(Pairs p)        {            return Integer.compare(this.value, p.value);        }    }}class FastScanner{    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    StringTokenizer str = new StringTokenizer("");     String next() throws IOException    {        while(!str.hasMoreTokens())            str = new StringTokenizer(br.readLine());         return str.nextToken();    }     char nextChar() throws IOException {        return next().charAt(0);    }     int nextInt() throws IOException    {        return Integer.parseInt(next());    }     float nextfloat() throws IOException    {        return Float.parseFloat(next());    }     double nextDouble() throws IOException    {        return Double.parseDouble(next());    }    long nextLong() throws IOException    {        return Long.parseLong(next());    }    byte nextByte() throws IOException    {        return Byte.parseByte(next());    }    int [] arrayIn(int n) throws IOException    {        int  arr[] = new int[n];        for(int i=0; i<n; i++)        {            arr[i] = nextInt();        }        return arr;    }}
