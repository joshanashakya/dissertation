

// Java implementation of the approach 
import java.util.*; 
public class GFG { 
    static int m[], a[][], x[]; 
    static ArrayList<Integer> g[]; 
    static int ans = 0; 
  
    // Function to perform simple DFS 
    static void dfs(int u, int p) 
    { 
        for (int v : g[u]) { 
            if (v != p) { 
                dfs(v, u); 
  
                // Finding the number of times each bit is set 
                // in all the values of a subtree rooted at v 
                for (int i = 0; i < 22; i++) 
                    a[u][i] += a[v][i]; 
            } 
        } 
  
        // Checking for each bit whether the numbers 
        // with that particular bit as set are 
        // either zero in both the resulting trees or 
        // greater than zero in both the resulting trees 
        int pp = 0; 
        for (int i = 0; i < 22; i++) { 
            if (!((a[u][i] > 0 && x[i] - a[u][i] > 0) 
                  || (a[u][i] == 0 && x[i] == 0))) { 
                pp = 1; 
                break; 
            } 
        } 
        if (pp == 0) 
            ans++; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        // Number of nodes 
        int n = 4; 
  
        // ArrayList to store the tree 
        g = new ArrayList[n + 1]; 
  
        // Array to store the value of nodes 
        m = new int[n + 1]; 
        m[1] = 1; 
        m[2] = 3; 
        m[3] = 2; 
        m[4] = 3; 
  
        // Array to store the number of times each bit 
        // is set in all the values of a subtree 
        a = new int[n + 1][22]; 
  
        // Array to store the number of times each bit 
        // is set in all the values in complete tree 
        x = new int[22]; 
        for (int i = 1; i <= n; i++) { 
            g[i] = new ArrayList<>(); 
            int y = m[i]; 
            int k = 0; 
  
            // Finding the set bits in the value of node i 
            while (y != 0) { 
                int p = y % 2; 
                if (p == 1) { 
                    x[k]++; 
                    a[i][k]++; 
                } 
                y = y / 2; 
                k++; 
            } 
        } 
  
        // Add edges 
        g[1].add(2); 
        g[2].add(1); 
        g[1].add(3); 
        g[3].add(1); 
        g[1].add(4); 
        g[4].add(1); 
        dfs(1, 0); 
        System.out.println(ans); 
    } 
} 

