import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math; 
import java.util.Arrays;
import java.util.Comparator;
 
 
 
public class Main 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
        
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

   

    static int binarySearch(int a[] ,int k,int l,int h){
        
        while(l<=h){
         int mid = (l+h)/2;
         if(a[mid]==k) return mid;
         else if(a[mid]>k) h=mid-1;
         else if(a[mid]<k) l=mid+1;
        }
        
        return -1;
    }

    static int binarySearch(ArrayList<Integer> a ,int k,int l,int h){
        
        while(l<=h){
         int mid = (l+h)/2;
         if(a.get(mid)==k) return mid;
         else if(a.get(mid)>k) h=mid-1;
         else if(a.get(mid)<k) l=mid+1;
        }
        
        return -1;
    }

    static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
  
        for (l = 0; l < r; l++, r--) 
        { 
            // Swap values of l and r  
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 

   
    
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       if (a == b) 
            return a; 
       if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 

    static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
    } 

    static int solve(int A, int B) 
    { 
    int count = 0; 
    for (int i = 0; i < 21; i++) { 
        if (((A >> i) & 1) != ((B >> i) & 1)) { 
            count++; 
        } 
     } 
  
      return count;
    } 

    static long nCr(int n, int r) 
    { 
    return fact(n) / (fact(r) * 
    fact(n - r)); 
    } 
        
        
    static long fact(int n) 
    { 
    long res = 1; 
    for (int i = 2; i <= n; i++) 
    res = res * i; 
    return res; 
    } 
        
    public static long count(long k) {
    return k * (k - 1) / 2;
    }

    static boolean isPrime(int n) { 
            // if(n==1) return false; 
    if(n==2) return true;
    if (n%2==0) return false; 
    
    int l = (int)Math.sqrt(n);
    for(int i=3;i<=l;i+=2) { 
        if(n%i==0) 
        return false; 
    } 
    return true; 
    }

    static int negMod(int n){
    int a = (n % 1000000007 + 1000000007) % 1000000007;
    return a;
    }
        

    public static int sum(long x) {
    int sum = 0;
    while (x > 0) {
    sum += x % 10;
    x /= 10;
    }
    return sum;
    }
    
    static ArrayList<Long> a = new ArrayList<>();

    static void genLucky(long val , int f , int s){
        if(val>10000000000l) return ;
        if(f==s) a.add(val);
        genLucky(val*10+4, f+1, s);
        genLucky(val*10+7, f, s+1);

    }

    public static int max(int x, int y, int z)
    {
        return (int)Math.max(Math.max(x, y), z);
    }
    
    
    public static int min(int x, int y, int z)
    {
        return (int)Math.min(Math.min(x, y), z);
    }
    
   static void dfs(int a){
       visited[a] = 1;
       Iterator<Integer> i = adj.get(a).listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (visited[n]==0) 
                dfs(n); 
        } 
   }

   static  void  bipartite(int n,int c,int color[]){
     visited[n] = 1;
     color[n] = c;
     
     Iterator<Integer> i = adj.get(n).listIterator(); 
        while (i.hasNext()) 
        { 
            int a = i.next(); 
            if (visited[a]==0) 
            bipartite(a,c^1,color); 
        } 
   }
   
    
    static void addEdge(int u, int v) 
        { 
        adj.get(u).add(v); 
        adj.get(v).add(u); 
        } 
    
    static ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
    static int visited[] = new int[10002];
    static int mod=1000003;
    
    public static void main(String[] args) throws Exception 
    {   
        
        OutputStream outputStream = System.out;
        PrintWriter w = new PrintWriter(outputStream);
        FastReader sc = new FastReader();
        // Scanner sc = new Scanner(new File("input.txt"));
        // PrintWriter out = new PrintWriter(new File("output.txt"));
        int i,j;
         
        int t = 1;

        while(t>0){

        int m = sc.nextInt();
        
        for(i=0;i<=5;i++) adj.add(new ArrayList<>());

        for(i=1;i<=m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(u, v);
        }
        
        boolean f = false;

        for(i=1;i<=5;i++){
            if(adj.get(i).size()==3 || adj.get(i).size()==4){f=true; break;}
            else if(adj.get(i).size()==0 || adj.get(i).size()==1) {f=true; break;}
        }

       if(f) w.println("WIN");
       else  w.println("FAIL");
        t--;
        }
        w.close();
    }
           
}
        
        
    

       




// System.out.println();

        
    
    


