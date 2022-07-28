

// Java program to implement above approach 
import java.util.*; 
  
class GFG  
{ 
    static final int N = 2005; 
    static final int mod = 1000000007; 
  
    // To store the size of string and 
    // number of queries 
    static int n, q; 
  
    // To store parent and rank of ith place 
    static int[] par = new int[N], Rank = new int[N]; 
  
    // To store maximum interval 
    static HashMap<Integer, 
                   Integer> m = new HashMap<>(); 
  
    // Function for initialization 
    static void initialize() 
    { 
        for (int i = 0; i <= n; i++) 
        { 
            par[i] = i; 
            Rank[i] = 0; 
        } 
    } 
  
    // Function to find parent 
    static int find(int x) 
    { 
        if (par[x] != x) 
            par[x] = find(par[x]); 
  
        return par[x]; 
    } 
  
    // Function to make union 
    static void Union(int x, int y)  
    { 
        int xpar = find(x); 
        int ypar = find(y); 
  
        if (Rank[xpar] < Rank[ypar]) 
            par[xpar] = ypar; 
        else if (Rank[xpar] > Rank[ypar]) 
            par[ypar] = xpar; 
        else 
        { 
            par[ypar] = xpar; 
            Rank[xpar]++; 
        } 
    } 
  
    // Power function to calculate a raised to m1 
    // under modulo 10000007 
    static long power(long a, long m1)  
    { 
        if (m1 == 0) 
            return 1; 
        else if (m1 == 1) 
            return a; 
        else if (m1 == 2) 
            return (1L * a * a) % mod; 
        else if (m1 % 2 == 1) 
            return (1L * a * power(power(a, m1 / 2), 2)) % mod; 
        else
            return power(power(a, m1 / 2), 2) % mod; 
    } 
  
    // Function to take maxmium interval 
    static void query(int l, int r) 
    { 
        if (m.containsKey(l + r)) 
            m.put(l + r, Math.max(m.get(l + r), r)); 
        else
            m.put(l + r, r); 
    } 
  
    // Function to find different possible strings 
    static long possiblestrings()  
    { 
        initialize(); 
  
        for (Integer i : m.keySet()) 
        { 
            int x = i - m.get(i); 
            int y = m.get(i); 
  
            // make union of all chracters which 
            // are meant to be same 
            while (x < y)  
            { 
                Union(x, y); 
                x++; 
                y--; 
            } 
        } 
  
        // find number of different sets formed 
        int ans = 0; 
        for (int i = 1; i <= n; i++) 
            if (par[i] == i) 
                ans++; 
  
        // return the required answer 
        return power(26, ans) % mod; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        n = 4; 
  
        // queries 
        query(1, 3); 
        query(2, 4); 
  
        System.out.println(possiblestrings()); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

