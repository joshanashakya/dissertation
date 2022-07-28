import java.io.BufferedReader;import java.io.FileReader;import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.StringTokenizer; import java.util.*;import java.io.*;public class codeforces {    static class Student{       int x,y;        Student(int x,int y){            this.x=x;            this.y=y;            //this.z=z;        }    }    static int prime[];    static void sieveOfEratosthenes(int n)     {         // Create a boolean array "prime[0..n]" and initialize         // all entries it as true. A value in prime[i] will         // finally be false if i is Not a prime, else true.         int pos=0;        prime= new int[n+1];         for(int p = 2; p*p <=n; p++)         {             // If prime[p] is not changed, then it is a prime             if(prime[p] == 0)            {                 // Update all multiples of p                prime[p]=p;                for(int i = p*p; i <= n; i += p)                    if(prime[i]==0)                    prime[i] = p;             }         }     }static    class Sortbyroll implements Comparator<Student> {     // Used for sorting in ascending order of     // roll number     public int compare(Student c, Student b)     {         return c.x-b.x;    } } static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      static class Edge{        int a,b;        Edge(int a,int b){            this.a=a;            this.b=b;        }    }    static class Trie{        HashMap<Character,Trie>map;         int c;        Trie(){            map=new HashMap<>();            //z=null;            //o=null;            c=0;        }    }    //static long ans;    static int parent[];    static int rank[];    static int b[][];    static int bo[];    static int ho[];    static int seg[];    //static int pos;   // static long mod=1000000007;    //static int dp[][];    static HashMap<Integer,Integer>map;    static PriorityQueue<Student>q=new PriorityQueue<>();    //static Stack<Integer>st;   // static ArrayList<Character>ans;    static ArrayList<ArrayList<Integer>>adj;    //static long ans;    static Trie root;    static long fac[];    static int gw,gb;    static long mod=(long)(1000000007);    //static int ans;    static void solve()throws IOException{        FastReader sc=new FastReader();        int n,k,i,j,x;        int dp[]=new int[10];        long temp=0,ans=1,mod1;            dp[0]=0;        dp[1]=9;        dp[2]=99;        dp[3]=999;        dp[4]=9999;        dp[5]=99999;        dp[6]=999999;        dp[7]=9999999;        dp[8]=99999999;        dp[9]=999999999;        n=sc.nextInt();        k=sc.nextInt();        x=n/k;        int a[]=new int[x];        int b[]=new int[x];        for(i=0;i<x;i++)            a[i]=sc.nextInt();        for(i=0;i<x;i++)            b[i]=sc.nextInt();        for(i=0;i<x;i++){            temp=dp[k]/a[i]+1;            if(b[i]==0)                mod1=0;            else                mod1=(a[i]-((int)Math.pow(10,k-1)*b[i])%a[i])%a[i];            if(dp[k-1]-mod1>=0)                temp-=1+(dp[k-1]-mod1)/a[i];            //System.out.println(temp);            ans=(ans*temp)%mod;        }        System.out.println(ans);    }    static long nCr(long n, long r,                                     long p)     {         return (fac[(int)n]* modInverse(fac[(int)r], p)                 % p * modInverse(fac[(int)(n-r)], p)                                     % p) % p;     }     //static int prime[];    //static int dp[];    public static void main(String[] args){        //long sum=0;        try {                codeforces.solve();                } catch (Exception e) {                    e.printStackTrace();                }    }       static long modInverse(long n, long p)     {         return power(n, p-(long)2,p);     }  static long power(long x, long y, long p) {     long res = 1;      // Initialize result       x = x % p;  // Update x if it is more than or                  // equal to p       while (y > 0)     {         // If y is odd, multiply x with result         if (y %(long)2!=0)             res = (res*x) % p;           // y must be even now         y = y>>1; // y = y/2         x = (x*x) % p;       }     return res%p; }    /*public static long power(long x,long a) {		if(a==0) return 1;		if(a%2==1)return (x*1L*power(x,a-1))%mod;		return (power((int)((x*1L*x)%mod),a/2))%mod;	}*/   static int find(int x)     {         // Finds the representative of the set         // that x is an element of         while(parent[x]!=x)         {             // if x is not the parent of itself             // Then x is not the representative of             // his set,            x=parent[x];              // so we recursively call Find on its parent             // and move i's node directly under the             // representative of this set         }           return x;     }    static void union(int x, int y)     {         // Find representatives of two sets         int xRoot = find(x), yRoot = find(y);           // Elements are in the same set, no need         // to unite anything.         if (xRoot == yRoot)             return;            // If x's rank is less than y's rank         if (rank[xRoot] < rank[yRoot])               // Then move x under y  so that depth             // of tree remains less             parent[xRoot] = yRoot;           // Else if y's rank is less than x's rank         else if (rank[yRoot] < rank[xRoot])               // Then move y under x so that depth of             // tree remains less             parent[yRoot] = xRoot;           else // if ranks are the same         {             // Then move y under x (doesn't matter             // which one goes where)             parent[yRoot] = xRoot;               // And increment the the result tree's             // rank by 1             rank[xRoot] = rank[xRoot] + 1;         }     }     static long gcd(long a, long b)     {         if (a == 0){              //ans+=b;            return b;        }        return gcd(b % a, a);     }}