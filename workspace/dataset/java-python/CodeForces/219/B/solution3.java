import java.util.*;import java.math.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;      //--------------->>>>IF YOU ARE HERE FOR QUICKSORT HACK THEN SORRY NO HACK FOR YOU<<<------------------- public class a{      static int[] count,count1,count2;     static boolean[] prime;     static Node[] nodes,nodes1,nodes2;     static long[] arr;     static long[][] cost;     static int[] arrInt,darrInt,farrInt;     static long[][] dp;     static char[] ch,ch1;     static long[] darr,farr;     static char[][] mat,mat1;     static boolean[] vis;     static long x,h;     static long maxl;     static double dec;     static long mx = (long)1e8;     static String s,s1,s2,s3,s4;     static long minl;        static long mod = ((long)(1e9))+7;     // static int minl = -1;     // static long n;     static int n,n1,n2,q,r1,c1,r2,c2;     static long a;     static long b;     static long c;     static long d;     static long y,z;     static int m;     static int ans;     static long k;     static FastScanner sc;     static String[] str,str1;     static Set<Integer> set,set1,set2;     static SortedSet<Long> ss;     static List<Integer> list,list1,list2,list3;     static PriorityQueue<Node> pq,pq1;     static LinkedList<Node> ll,ll1,ll2;     static Map<Integer,List<Integer>> map1;     static Map<Long,Long> map;     static StringBuilder sb,sb1,sb2;     static int index;     static long[] sum;     static int[] dx = {0,-1,0,1,-1,1,-1,1};     static int[] dy = {-1,0,1,0,-1,-1,1,1};      // public static void solve(){      //    FastScanner sc = new FastScanner();     //    // int t = sc.nextInt();     //    int t = 1;     //    for(int tt = 0 ; tt < t ; tt++){      //        // s = sc.next();     //        // s1 = sc.next();      //        n = sc.nextInt();      //        m = sc.nextInt();      //        // int k = sc.nextInt();      //        // sb = new StringBuilder();      //        map = new HashMap<>();     //        map1 = new HashMap<>();      //        // q = sc.nextInt();     //        // sb = new StringBuilder();     //        // long k = sc.nextLong();      //        // ch = sc.next().toCharArray();      //        // count = new int[200002];                //        // m = sc.nextInt();      //        for(int o = 0 ; o < m ; o++){      //            int l = sc.nextInt()-1;     //            int r = sc.nextInt()-1;      //        }      //    }             // }      //--------------->>>>IF YOU ARE HERE FOR QUICKSORT HACK THEN SORRY NO HACK FOR YOU<<<-------------------      public static void solve(){         long d = b;        ch = String.valueOf(a).toCharArray();        long ans = a;        int n = ch.length;        // System.out.println(ans);        for(int i = n-1 ; i > 0 ; i--){            // System.out.println(Arrays.toString(ch));            if(ch[i] == '9')                continue;            ch[i] = '9';            int j = i-1;            while(j > -1 && ch[j] == '0'){                ch[j] = '9';                j -= 1;            }            if(j > -1)                ch[j] = (char)(((ch[j]-'0')-1)+'0');            int k = 0;            for(k = 0 ; k < n ; k++){                if(ch[k] != '0')                    break;            }            long num = 0;            for( ; k < n ; k++){                num *= 10;                num += (ch[k]-'0');            }            // System.out.println(num);            long l = num;            if(a-l > d)                break;            else{                ans = num;            }        }         System.out.println(ans);      }             public static void main(String[] args) {             sc = new FastScanner();            // Scanner sc = new Scanner(System.in);            // int t = sc.nextInt();            int t = 1;            // int l = 1;            while(t > 0){                                // n = sc.nextInt();                // n = sc.nextLong();                // k = sc.nextLong();                // x = sc.nextLong();                // y = sc.nextLong();                // z = sc.nextLong();                 a = sc.nextLong();                b = sc.nextLong();                // c = sc.nextLong();                // d = sc.nextLong();                 // x = sc.nextLong();                // y = sc.nextLong();                // z = sc.nextLong();                // d = sc.nextLong();                 // n = sc.nextInt();                 // n1 = sc.nextInt();                 // m = sc.nextInt();                // q = sc.nextInt();                 // k = sc.nextLong();                 // x = sc.nextLong();                // d = sc.nextLong();                 // s = sc.next();                 // ch = sc.next().toCharArray();                // ch1 = sc.next().toCharArray();                 // n = 3;                 // arr = new long[n];                // for(int i = 0 ; i < n ; i++){                //     arr[i] = sc.nextLong();                // }                 // arrInt = new int[n];                // for(int i = 0 ; i < n ; i++){                //     arrInt[i] = sc.nextInt();                // }                // x = sc.nextLong();                // y = sc.nextLong();                // ch = sc.next().toCharArray();                // m = n;                // m = sc.nextInt();                // darr = new long[m];                // for(int i = 0 ; i < m ; i++){                //     darr[i] = sc.nextLong();                // }                // k = sc.nextLong();                // m = n;                // darrInt = new int[n];                // for(int i = 0 ; i < n ; i++){                //     darrInt[i] = sc.nextInt();                // }                 // farrInt = new int[m];                // for(int i = 0; i < m ; i++){                //     farrInt[i] = sc.nextInt();                // }                 // mat = new long[n][m];                // for(int i = 0 ; i < n ; i++){                //     for(int j = 0 ; j < m ; j++){                //         mat[i][j] = sc.nextLong();                //     }                // }                 // m = n;                // mat = new char[n][m];                // for(int i = 0 ; i < n ; i++){                //     String s = sc.next();                //     for(int j = 0 ; j < m ; j++){                //         mat[i][j] = s.charAt(j);                //     }                // }                 // str = new String[n];                // for(int i = 0 ; i < n ; i++)                //     str[i] = sc.next();                 // nodes = new Node[n];                // for(int i = 0 ; i < n ;i++)                //     nodes[i] = new Node(sc.nextLong(),sc.nextLong());                  solve();                        t -= 1;            }      }     public static int log(long n,long base){          if(n == 0 || n == 1)             return 0;          if(n == base)             return 1;          double num = Math.log(n);         double den = Math.log(base);          if(den == 0)             return 0;          return (int)(num/den);     }     public static boolean isPrime(long n) {     // Corner cases         if (n <= 1)              return false;          if (n <= 3)              return true;               // This is checked so that we can skip          // middle five numbers in below loop         if (n%2 == 0 || n%3 == 0)             return false;               for (int i=5; i*i<=n; i=i+6)             if (n%i == 0 || n%(i+2) == 0)                return false;               return true;     }      public static long gcd(long a, long b)    {      if (b == 0)        return a;      return gcd(b, a % b);     }     public static long lcm(long a, long b)    {      return (b/gcd(b, a % b)) * a;     }      public static long mod_inverse(long a,long mod){        long x1=1,x2=0;        long p=mod,q,t;        while(a%p!=0){          q = a/p;          t = x1-q*x2;          x1=x2; x2=t;          t=a%p;          a=p; p=t;        }        return x2<0 ? x2+mod : x2;    }      // public static void swap(int i,int j){     //     long temp = arr[j];     //     arr[j] = arr[i];     //     arr[i] = temp;     // }      static final Random random=new Random();     static void ruffleSortLong(long[] a) {        int n=a.length;//shuffle, then sort         for (int i=0; i<n; i++) {            int oi=random.nextInt(n);            long temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }     static void ruffleSortInt(int[] a) {        int n=a.length;//shuffle, then sort         for (int i=0; i<n; i++) {            int oi=random.nextInt(n);            int temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }        static void ruffleSortChar(char[] a) {        int n=a.length;//shuffle, then sort         for (int i=0; i<n; i++) {            int oi=random.nextInt(n);            char temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }     static long binomialCoeff(long n, long k){          long res = 1;           // Since C(n, k) = C(n, n-k)         if (k > n - k)             k = n - k;           // Calculate value of         // [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]         for (long i = 0; i < k; ++i) {             res = (res*(n - i));             res = (res/(i + 1));         }          return res;     }      static long[] fact;     public static long inv(long n){        return power(n, mod-2);    }     public static void fact(int n){        fact = new long[n+1];        fact[0] = 1;        for(int j = 1;j<=n;j++)            fact[j] = (fact[j-1]*(long)j)%mod;                   }     public static long binom(int n, int k){        fact(n+1);        long prod = fact[n];        prod*=inv(fact[n-k]);        prod%=mod;        prod*=inv(fact[k]);        prod%=mod;        return prod;        }     static long power(long x, long y){        if (y == 0)            return 1;        if (y%2 == 1)            return (x*power(x, y-1))%mod;        return power((x*x)%mod, y/2)%mod;    }     static class Node{        int first;        int second;        int third;        Node(int f,int s,int t){            this.first = f;            this.second = s;            this.third = t;        }    }      static class FastScanner {                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));                StringTokenizer st=new StringTokenizer("");                String next() {                        while (!st.hasMoreTokens())                                try {                                        st=new StringTokenizer(br.readLine());                                } catch (IOException e) {                                        e.printStackTrace();                                }                        return st.nextToken();                }                                int nextInt() {                        return Integer.parseInt(next());                }                int[] readArray(int n) {                        int[] a=new int[n];                        for (int i=0; i<n; i++) a[i]=nextInt();                        return a;                }                long nextLong() {                        return Long.parseLong(next());                }        } }
