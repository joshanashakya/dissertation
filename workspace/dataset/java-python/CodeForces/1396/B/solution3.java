import java.io.*;
import java.util.*;
import java.math.BigInteger; 

public class test1 {
    
    
   static class sort implements Comparator<int[]>
   {
        public int compare(int[] a,int[] b)
        {
            //if(a[0] == b[0]) return a[1]-b[1];
           return a[0]-b[0];
        }
   }
   public static void pr(PrintWriter out,Object o)
   {
      
    out.println(o.toString());out.flush();
    
   }
   public static void prW(PrintWriter out,Object o)
   {
      
    out.print(o.toString());out.flush();
    
   }
   public static int intIn(String st)
   {
      return Integer.parseInt(st);
   }
   
   
    
    public static void pr(Object o)
    {
        System.out.println(o.toString());
    }
    public static void prW(Object o)
    {
        System.out.print(o.toString());
    }
    
   
    public static int inInt(String s)
    {
        return Integer.parseInt(s);
    }
    public static long in(String s)
    {
        return Long.parseLong(s);
    }

    
    
    static int[] toIntArray(String[] m) 
    { 
        int[] p=new int[m.length];
        for(int o=0;o<m.length;o++)
        {
            p[o]= inInt(m[o]);
        }
        return p;
    }
    static long[] toLArray(String[] m) 
    { 
       long[] p=new long[m.length];
        for(int o=0;o<m.length;o++)
        {
            p[o]= in(m[o]);
        }
        return p;
    }
    static long max=10000000000000l;static int[] before;static int R;
    
    public static String[] F(BufferedReader bf) throws Exception
    {
        return (bf.readLine().split(" "));
    }
    
    public static void main (String[] args) throws Exception {
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter out = new PrintWriter(System.out);;;
        
        //int[] map=new int[1000001];
      
        int y=Integer.parseInt(bf.readLine());
        
        for(int w=0;w<y;w++)
        {

            
    
            String[] xlp = bf.readLine().split(" ");
            
            int n,k,t,h;//boolean bol=false;
           int m;
            n=inInt(xlp[0]);//m=inInt(xlp[1]);k=inInt(xlp[2]);t=inInt(xlp[3]);
            int[] arr  =toIntArray(F(bf));
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

            for(int x : arr) pq.add(x);int res=1;
            while(true)
            {
                if(pq.size() == 0) 
                {
                    res=1;break;
                }
                int j = pq.remove();
                if(pq.size() == 0)
                {
                    res=0;break;
                }
                int q = pq.remove();
                if(j>1)
                pq.add(j-1);
                if(q>1)
                    pq.add(q-1);

            }

            if(res==0)
            {
                pr("T");
            }
            else pr("HL");

           // pr(res);

           

             

          
           
            

            

            
            
            
        }
        //out.close();

    }
}


/*
1
8
13 13 9 12 13 1 13 1

1
5
8 4 7 -2 
1 2
1 3
3 4 
4 5



100663319,201326611,402653189,805306457,1610612741
Kickstart
String rp;
            rp = "Case #"+(w+1)+": "+(n-ans)+" ";
            if(curr == max) rp=rp +"INDEFINITELY";
            else rp = rp+(curr);
static int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};

static class SegmentTreeRMQ 
    { 
    int st[]; 
    int minVal(int x, int y) { 
        return (x > y) ? x : y; 
    } 
  
    
    int getMid(int s, int e) { 
        return s + (e - s) / 2; 
    } 
  
    
    int RMQUtil(int ss, int se, int qs, int qe, int index) 
    { 
        
        if (qs <= ss && qe >= se) 
            return st[index]; 
  
        // If segment of this node is outside the given range 
        if (se < qs || ss > qe) 
            return Integer.MIN_VALUE; 
  
        // If a part of this segment overlaps with the given range 
        int mid = getMid(ss, se); 
        return minVal(RMQUtil(ss, mid, qs, qe, 2 * index + 1), 
                RMQUtil(mid + 1, se, qs, qe, 2 * index + 2)); 
    } 
  
    // Return minimum of elements in range from index qs (query 
    // start) to qe (query end).  It mainly uses RMQUtil() 
    int RMQ(int n, int qs, int qe) 
    { 
        // Check for erroneous input values 
        
  
        return RMQUtil(0, n - 1, qs, qe, 0); 
    } 
  
    // A recursive function that constructs Segment Tree for 
    // array[ss..se]. si is index of current node in segment tree st 
    int constructSTUtil(int arr[], int ss, int se, int si) 
    { 
        // If there is one element in array, store it in current 
        //  node of segment tree and return 
        if (ss == se) { 
            st[si] = arr[ss]; 
            return arr[ss]; 
        } 
  
        // If there are more than one elements, then recur for left and 
        // right subtrees and store the minimum of two values in this node 
        int mid = getMid(ss, se); 
        st[si] = minVal(constructSTUtil(arr, ss, mid, si * 2 + 1), 
                constructSTUtil(arr, mid + 1, se, si * 2 + 2)); 
        return st[si]; 
    } 
  
    
    void con(int arr[]) 
    { 
        // Allocate memory for segment tree 
  
        //Height of segment tree 
        int n = (arr.length);
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
  
        //Maximum size of segment tree 
        int max_size = 2 * (int) Math.pow(2, x) - 1; 
        st = new int[max_size]; // allocate memory 
  
        // Fill the allocated memory st 
        constructSTUtil(arr, 0, n - 1, 0); 
    }
    }
     static class DSU {
    
    int[] p;int[] sz;int op;int c;;
    int[] last;
    public void G(int n)
    {
        last=new int[n];
        p=new int[n];
        sz=new int[n];c=n;
        op=n;
        for(int h=0;h<n;h++)
        {
            sz[h]=1;p[h]=h;
            last[h]=h;
        }
    }
    public int find(int x)
    {
        int y=x;
        while(x!=p[x]) x=p[x];
        while(y!=p[y])
        {
            int tem=p[y];
            p[y]=x;y=tem;
        }
        return p[y];
    }
    public void union(int a,int b)
    {
        int x,y;
        x=find(a);y=find(b);
        if(x==y) return;
        if(sz[x]>sz[y])
        {
            p[y] = x;
            sz[x]+=sz[y];
            last[x]=Math.max(last[x],last[y]);
        }
        else
        {
            p[x]=y;sz[y]+=sz[x];
            last[y]=Math.max(last[y],last[x]);
        }
        c--;
        
    }}

    static long pow(long x, long y, long p)
      {
        long res = 1; // Initialize result
     
        x = x % p; // Update x if it is more than or
        // equal to p
     
        if (x == 0)
          return 0l; // In case x is divisible by p;
     
        while (y > 0)
        {
     
          // If y is odd, multiply x with result
          if ((y & 1) != 0)
            res = (res * x) % p;
     
          // y must be even now
          y = y >> 1; // y = y/2
          x = (x * x) % p;
        }
        return res;
      }
      static long gcd(long a, long b)
        {
          if (b == 0)
            return a;
          return gcd(b, a % b); 
        }
        static int gcd(int a, int b,int o)
        {
          if (b == 0)
            return a;
          return gcd(b, a % b,o); 
        }
    
      
    

*/



