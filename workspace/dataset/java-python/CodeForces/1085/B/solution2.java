import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class a{      static int[] count,count1,count2;     static long[] arr;     static char[] ch,ch1;     static long[] darr,farr;     static Character[][] mat,mat1;     static long x,h;     static long maxl;     static double dec;     static String s;     static long minl;     static int mx = (int)1e6;     static long mod = 998244353l;     // static int minl = -1;     static long n;     // static int n,n1,n2;     static long a,g;     static long b;     static long c;     static long d;     static long y,z;     static int m;     static long k;     static int q;     static String[] str,str1;     static Set<Integer> set,set1;     static List<Integer> list,list1,list2;     static LinkedList<Character> ll;     static Map<Integer,Integer> map;     static StringBuilder sb,sb1,sb2;      public static long solve(){         for(long i = k-1 ; i >= 0 ; i--){            if(n%i != 0)                continue;            return (n/i)*k + i;        }         return -1;        }      public static void main(String[] args) {             FastScanner sc = new FastScanner();            // Scanner sc = new Scanner(System.in);            // int t = sc.nextInt();            int t = 1;            while(t > 0){                                // x = sc.nextLong();                // y = sc.nextLong();                // z = sc.nextLong();                                // a = sc.nextLong();                // b = sc.nextLong();                // c = sc.nextLong();                // d = sc.nextLong();                n = sc.nextLong();                // n = sc.nextInt();                // m = sc.nextInt();                // y = sc.nextInt();                // x = sc.newxtLong();                 // y = sc.nextLong();                // n1 = sc.nextInt();                // n = sc.nextLong();                 k = sc.nextLong();                 // ch = sc.next().toCharArray();                // ch1 = sc.next().toCharArray();                 // m = sc.nextLong();                // k = sc.nextLong();                 // arr = new long[n];                // for(int i = 0; i < n ; i++){                //     arr[i] = sc.nextLong();                // }                                                  // darr = new long[n];                // for(int i = 0; i < n ; i++){                //     darr[i] = sc.nextLong();                // }                                // n1 = sc.nextInt();                //  darr = new long[n1];                //  for(int i = 0; i < n1 ; i++){                //      darr[i] = sc.nextLong();                //  }                 // mat = new Character[n][n];                // for(int i = 0 ; i < n ; i++){                //     String s = sc.next();                //     for(int j = 0 ; j < n ; j++){                //         mat[i][j] = s.charAt(j);                //     }                // }                // str = new String[n];                // for(int i = 0 ; i < n ; i++)                //     str[i] = sc.next();                 // System.out.println(solve()?"Yes":"No");                 // solve();                        System.out.println(solve());                  t -= 1;            }      }     public static int log(long n){          if(n == 0 || n == 1)             return 0;          if(n == 2)             return 1;          double num = Math.log(n);         double den = Math.log(2);          if(den == 0)             return 0;          return (int)(num/den);     }      public static long gcd(long a,long b){         if(b%a == 0)            return a;         return gcd(b%a,a);      }      // public static void swap(int i,int j){     //     long temp = arr[j];     //     arr[j] = arr[i];     //     arr[i] = temp;     // }      static final Random random=new Random();        static void ruffleSort(long[] a) {        int n=a.length;//shuffle, then sort         for (int i=0; i<n; i++) {            int oi=random.nextInt(n);            long temp=a[oi];            a[oi]=a[i]; a[i]=temp;        }        Arrays.sort(a);    }     static class Node{        int first;        int second;        Node(int f,int s){            this.first = f;            this.second = s;        }    }      static class FastScanner {                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));                StringTokenizer st=new StringTokenizer("");                String next() {                        while (!st.hasMoreTokens())                                try {                                        st=new StringTokenizer(br.readLine());                                } catch (IOException e) {                                        e.printStackTrace();                                }                        return st.nextToken();                }                                int nextInt() {                        return Integer.parseInt(next());                }                int[] readArray(int n) {                        int[] a=new int[n];                        for (int i=0; i<n; i++) a[i]=nextInt();                        return a;                }                long nextLong() {                        return Long.parseLong(next());                }        } }
