   // package com.company;    import java.io.BufferedReader;    import java.io.IOException;    import java.io.InputStreamReader;    import java.lang.reflect.Array;    import java.util.*;    public class Main {         public static void main(String[] args) throws IOException {           Scanner s = new Scanner(System.in);       //     BufferedReader s=new BufferedReader(new InputStreamReader(System.in));             StringBuilder sb = new StringBuilder();//int n=Integer.parseInt(s.readLine());                int n=s.nextInt();int[] h=new int[n];int[] l=new int[n];int max=Integer.MIN_VALUE;                HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();                int min=Integer.MIN_VALUE;                for(int i=0;i<n;i++){                    l[i]=s.nextInt();h[i]=s.nextInt();                   if(l[i]>min&&h[i]>min) min=(Math.min(l[i],h[i]));                    max=Math.max(max,Math.max(l[i],h[i]));                      hs.put(l[i],1);hs.put(h[i],1);                }long ans=Long.MAX_VALUE;                for(int i=max;i>=min;i--){                    if(hs.containsKey(i)){                          long sum=0;                        for(int j=0;j<n;j++){                           if(Math.max(l[j],h[j])<=i){                               sum+=Math.min(l[j],h[j]);                           }else{                               sum+=Math.max(l[j],h[j]);                           }                        }ans=Math.min(ans,sum*i);                    }            }            System.out.println(ans);             }        static boolean isPrime(int n)        {            // Corner cas            if (n <= 1) return false;            if (n <= 3) return true;             // This is checked so that we can skip            // middle five numbers in below loop            if (n % 2 == 0 || n % 3 == 0) return false;             for (int i = 5; i * i <= n; i = i + 6)                if (n % i == 0 || n % (i + 2) == 0)                    return false;             return true;        }        static boolean isPrime(int n, int k)        {            // Corner cases            if (n <= 1 || n == 4) return false;            if (n <= 3) return true;             // Try k times            while (k > 0)            {                // Pick a random number in [2..n-2]                // Above corner cases make sure that n > 4                int a = 2 + (int)(Math.random() % (n - 4));                 // Fermat's little theorem                if (power(a, n - 1, n) != 1)                    return false;                 k--;            }             return true;        }        static double power(double x, long y, int p) {            double res = 1;            x = x % p;            while (y > 0) {                if ((y & 1) == 1)                    res = (res * x) % p;                y = y >> 1;                x = (x * x) % p;            }            return res;        }        public static void fracion(double x) {            String a = "" + x;            String spilts[] = a.split("\\."); // split using decimal            int b = spilts[1].length(); // find the decimal length            int denominator = (int) Math.pow(10, b); // calculate the denominator            int numerator = (int) (x * denominator); // calculate the nerumrator Ex            // 1.2*10 = 12            int gcd = gcd(numerator, denominator); // Find the greatest common            // divisor bw them            String fraction = "" + numerator / gcd + "/" + denominator / gcd;            // System.out.println((denominator/gcd));            long x1=modInverse(denominator / gcd,998244353  );            //  System.out.println(x1);            System.out.println((((numerator / gcd )%998244353 *(x1%998244353  ))%998244353  ) );        }static int max=Integer.MIN_VALUE;static int max1=Integer.MIN_VALUE;static int[] ans;static long[][] dp;static int[][] c;        public static int dfs(int papa, int i, ArrayList<Integer>[] h, int[] vis) {              vis[i] = 1;               if(papa!=-1){                   dp[i-1][0]=Math.min(dp[i-1][0],c[0][i-1]+Math.min(dp[papa-1][1],dp[papa-1][2]));                   dp[i-1][1]=Math.min(dp[i-1][1],c[1][i-1]+Math.min(dp[papa-1][0],dp[papa-1][2]));                   dp[i-1][2]=Math.min(dp[i-1][2],c[2][i-1]+Math.min(dp[papa-1][1],dp[papa-1][0]));                }else{                   dp[i-1][0]=c[i-1][0];                   dp[i-1][1]=c[i-1][1];                   dp[i-1][2]=c[i-1][2];                }             for(Integer j:h[i]){                      if(vis[j]==0){                          dfs(i,j,h,vis);                      }             }ans[i]+=1;if(ans[i]>max){                 max=ans[i];max1=i;            }          return ans[i];        }           public static void bfs(int i, HashMap<Integer, Integer>[] h, int[] vis, int len, int papa) {            Queue<Integer> q = new LinkedList<Integer>();            q.add(i);         }          static int i(String a) {            return Integer.parseInt(a);        }         static long l(String a) {            return Long.parseLong(a);        }         static String[] inp() throws IOException {            BufferedReader s = new BufferedReader(new InputStreamReader(System.in));            return s.readLine().trim().split("\\s+");        }          static int gcd(int a, int b) {            if (b == 0)                return a;            return gcd(b, a % b);        }        static long modInverse(int a, int m)        {              {                // If a and m are relatively prime, then modulo inverse                // is a^(m-2) mode m                return (power(a, m - 2, m));            }        }         // To compute x^y under modulo m        static long power(int x, int y, int m)        {            if (y == 0)                return 1;             long p = power(x, y / 2, m) % m;            p = (p * p) % m;             if (y % 2 == 0)                return p;            else                return (x * p) % m;        }         // Function to return gcd of a and b     }    class Student    {        Integer l;Integer r;         public Student(Integer l, Integer r) {            this.l = l;            this.r = r;         }    // Constructor          // Used to print student details in main()        public String toString()        {            return this.l+" ";        }    }     class Sortbyroll implements Comparator<Student>    {        // Used for sorting in ascending order of        // roll number        public int compare(Student a, Student b){            return b.r-a.r;        }    }