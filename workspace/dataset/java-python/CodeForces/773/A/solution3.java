import java.io.BufferedReader;import java.io.FileReader;import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.StringTokenizer; import java.util.*;import java.io.*;public class codeforces {    static class Student{       int x,y;        Student(int x,int y){            this.x=x;            this.y=y;        }    }    static int sieveOfEratosthenes(int n)     {         // Create a boolean array "prime[0..n]" and initialize         // all entries it as true. A value in prime[i] will         // finally be false if i is Not a prime, else true.         int pos=0;        boolean prime[] = new boolean[n+1];         for(int i=0;i<=n;i++)             prime[i] = true;                   for(int p = 2; p*p <=n; p++)         {             // If prime[p] is not changed, then it is a prime             if(prime[p] == true)             {                 // Update all multiples of p                 for(int i = p*p; i <= n; i += p)                     prime[i] = false;             }         }                   // Print all prime numbers         for(int i = 2; i <= n; i++)         {             if(prime[i] == true)                 ++pos;        }        return pos;    }static    class Sortbyroll implements Comparator<Student> {     // Used for sorting in ascending order of     // roll number     public int compare(Student c, Student b)     {         return c.x-b.y;    } }     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }    static class Edge{        int a,b;        Edge(int a,int b){            this.a=a;            this.b=b;        }    }    public static void main(String[] args){        //long sum=0;        FastReader sc=new FastReader();        int t;        long ans=Integer.MAX_VALUE,x,y,p,q,s,e,mid,temp;        t=sc.nextInt();        while(t>0){            ans=-1;            x=sc.nextLong();            y=sc.nextLong();            p=sc.nextLong();            q=sc.nextLong();            s=0;            e=(long)1e9;            mid=(s+e)/2;            if(x!=0&&p==0||(x!=0&&p==0)||p==q&&x!=y)                System.out.println(-1);            else{            while(s<=e){                if(p*mid>=x&&q*mid-p*mid>=y-x&&mid*q>=y){                    if(ans==-1)                        ans=mid*q-y;                    else                        ans=Math.min(ans,mid*q-y);                    e=mid-1;                }                else                    s=mid+1;                mid=(s+e)/2;            }         System.out.println(ans);            }            --t;        }    } static long power(long x, long y, long p) {     long res = 1;      // Initialize result       x = x % p;  // Update x if it is more than or                  // equal to p       while (y > 0)     {         // If y is odd, multiply x with result         if ((y & (long)1)%2!=0)             res = (res*x) % p;           // y must be even now         y = y>>1; // y = y/2         x = (x*x) % p;       }     return res%p; }    static int find(int x,int parent[])     {         // Finds the representative of the set         // that x is an element of         while(parent[x]!=x)         {             // if x is not the parent of itself             // Then x is not the representative of             // his set,            x=parent[x];              // so we recursively call Find on its parent             // and move i's node directly under the             // representative of this set         }           return x;     }    static void union(int x, int y,int rank[],int parent[])     {         // Find representatives of two sets         int xRoot = find(x,parent), yRoot = find(y,parent);           // Elements are in the same set, no need         // to unite anything.         if (xRoot == yRoot)             return;            // If x's rank is less than y's rank         if (rank[xRoot] < rank[yRoot])               // Then move x under y  so that depth             // of tree remains less             parent[xRoot] = yRoot;           // Else if y's rank is less than x's rank         else if (rank[yRoot] < rank[xRoot])               // Then move y under x so that depth of             // tree remains less             parent[yRoot] = xRoot;           else // if ranks are the same         {             // Then move y under x (doesn't matter             // which one goes where)             parent[yRoot] = xRoot;               // And increment the the result tree's             // rank by 1             rank[xRoot] = rank[xRoot] + 1;         }     }     static long gcd(long a, long b)     {         if (a == 0)             return b;         return gcd(b % a, a);     }}
