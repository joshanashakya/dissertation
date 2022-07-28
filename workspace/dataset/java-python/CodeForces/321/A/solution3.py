import java.io.BufferedReader;import java.io.FileReader;import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.StringTokenizer; import java.util.*;import java.io.*;public class codeforces {    static class Student{       int x,y;//z;        Student(int x,int y){            this.x=x;            this.y=y;            //this.z=z;        }    }    static int prime[];    static void sieveOfEratosthenes(int n)     {         // Create a boolean array "prime[0..n]" and initialize         // all entries it as true. A value in prime[i] will         // finally be false if i is Not a prime, else true.         int pos=0;        prime= new int[n+1];         for(int p = 2; p*p <=n; p++)         {             // If prime[p] is not changed, then it is a prime             if(prime[p] == 0)            {                 // Update all multiples of p                prime[p]=p;                for(int i = p*p; i <= n; i += p)                    if(prime[i]==0)                    prime[i] = p;             }         }     }static    class Sortbyroll implements Comparator<Student> {     // Used for sorting in ascending order of     // roll number     public int compare(Student c, Student b)     {        return b.y-c.y;    } } static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }      static class Edge{        int a,b;        Edge(int a,int b){            this.a=a;            this.b=b;        }    }    static class Trie{        HashMap<Character,Trie>map;         int c;        Trie(){            map=new HashMap<>();            //z=null;            //o=null;            c=0;        }    }    //static long ans;    static int parent[];    static int rank[];   // static int b[][];    static int bo[][];    static int ho[][];    static int seg[];    //static int pos;    static long mod=1000000000+7;    //static int dp[][];    static HashMap<String,Integer>map;    static PriorityQueue<Student>q=new PriorityQueue<>();    //static Stack<Integer>st;   // static ArrayList<Character>ans;    static ArrayList<ArrayList<Integer>>adj;    //static long ans;    static int pos;    static Trie root;    static long fac[];    static int gw,gb;    //static long mod=(long)(998244353);    static int ans;    static void solve()throws IOException{        FastReader sc=new FastReader();        int a,b,x=0,y=0,i,x1=0,y1=0,pos=0;        a=sc.nextInt();        b=sc.nextInt();        String s=sc.nextLine();        for(i=0;i<s.length();i++){            if(s.charAt(i)=='U')                ++y;            else if(s.charAt(i)=='D')                --y;            else if(s.charAt(i)=='L')                --x;            else                ++x;        }        pos=check(0,0,a,b,x,y);        for(i=0;i<s.length();i++){            if(s.charAt(i)=='U')                ++y1;            else if(s.charAt(i)=='D')                --y1;            else if(s.charAt(i)=='L')                --x1;            else                ++x1;            pos=Math.max(pos,check(x1,y1,a,b,x,y));        }        if(pos==1)            System.out.println("Yes");        else            System.out.println("No");    }    static int check(long x1,long y1,long a,long b,long x,long y){        long q,w;        if(x==0&&y==0){            if(x1==a&&y1==b)                return 1;            return 0;        }        else if(x==0){            if((long)Math.abs(y1-b)%(long)Math.abs(y)!=0||x1!=a)                return 0;            w=(b-y1)/y+1;            if(w<=0)                return 0;            return 1;        }        else if(y==0){            if((long)Math.abs(x1-a)%(long)Math.abs(x)!=0||y1!=b)                return 0;            q=(a-x1)/x+1;            if(q<=0)                return 0;            return 1;        }        else{            if((long)Math.abs(y1-b)%(long)Math.abs(y)!=0||(long)Math.abs(x1-a)%(long)Math.abs(x)!=0)                return 0;            w=(b-y1)/y+1;            q=(a-x1)/x+1;            if(w<=0||q<=0||w!=q)                return 0;            return 1;        }    }    static boolean isSafe(int x,int y,int b[][],String s[] ){        if(x>=0&&x<b.length&&y>=0&&y<b[0].length&&s[x].charAt(y)=='#'&&b[x][y]==0)            return true;        return false;    }    static void add(int x,int y,Queue<Integer>q,Queue<Integer>v,int b[][]){        q.add(x);        v.add(y);        b[x][y]=1;    }    static long nCr(long n, long r,                                     long p)     {         return (fac[(int)n]* modInverse(fac[(int)r], p)                 % p * modInverse(fac[(int)(n-r)], p)                                     % p) % p;     }     //static int prime[];    //static int dp[];    public static void main(String[] args){        //long sum=0;        try {                codeforces.solve();                } catch (Exception e) {                    e.printStackTrace();                }    }       static long modInverse(long n, long p)     {         return power(n, p-(long)2,p);     }  static long power(long x, long y, long p) {     long res = 1;      // Initialize result       x = x % p;  // Update x if it is more than or                  // equal to p       while (y > 0)     {         // If y is odd, multiply x with result         if (y %(long)2!=0)             res = (res*x) % p;           // y must be even now         y = y>>1; // y = y/2         x = (x*x) % p;       }     return res%p; }    /*public static long power(long x,long a) {		if(a==0) return 1;		if(a%2==1)return (x*1L*power(x,a-1))%mod;		return (power((int)((x*1L*x)%mod),a/2))%mod;	}*/   static int find(int x)     {         // Finds the representative of the set         // that x is an element of         while(parent[x]!=x)         {             // if x is not the parent of itself             // Then x is not the representative of             // his set,            x=parent[x];              // so we recursively call Find on its parent             // and move i's node directly under the             // representative of this set         }           return x;     }    static void union(int x, int y)     {         // Find representatives of two sets         int xRoot = find(x), yRoot = find(y);           // Elements are in the same set, no need         // to unite anything.         if (xRoot == yRoot)             return;            // If x's rank is less than y's rank         if (rank[xRoot] < rank[yRoot])               // Then move x under y  so that depth             // of tree remains less             parent[xRoot] = yRoot;           // Else if y's rank is less than x's rank         else if (rank[yRoot] < rank[xRoot])               // Then move y under x so that depth of             // tree remains less             parent[yRoot] = xRoot;           else // if ranks are the same         {             // Then move y under x (doesn't matter             // which one goes where)             parent[yRoot] = xRoot;               // And increment the the result tree's             // rank by 1             rank[xRoot] = rank[xRoot] + 1;         }     }     static long gcd(long a, long b)     {         if (a == 0){              //ans+=b;            return b;        }        return gcd(b % a, a);     }}
