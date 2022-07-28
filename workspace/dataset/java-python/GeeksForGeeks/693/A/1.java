

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    static int MAX = 26; 
  
    // Function to return 
    // the value (x - 97) 
    static int f(int x) 
    { 
        return x - 'a'; 
    } 
  
    // Function to return the minimum cost 
    static int findMinCost(String[] arr)  
    { 
        int n = arr.length; 
        int m = arr[0].length(); 
  
        // Graph 
        Vector<Integer>[] gr = new Vector[MAX]; 
        for (int i = 0; i < MAX; i++) 
            gr[i] = new Vector<Integer>(); 
  
        // Adjacency matrix 
        boolean[][] edge = new boolean[MAX][MAX]; 
  
        // Initialising the adjacency matrix 
        for (int k = 0; k < MAX; k++) 
            for (int l = 0; l < MAX; l++) 
                edge[k][l] = false; 
  
        // Creating the adjacency matrix 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++)  
            { 
                if (i + 1 < n && !edge[f(arr[i].charAt(j))][f(arr[i + 1].charAt(j))])  
                { 
                    gr[f(arr[i].charAt(j))].add(f(arr[i + 1].charAt(j))); 
                    edge[f(arr[i].charAt(j))][f(arr[i + 1].charAt(j))] = true; 
                } 
                if (j - 1 >= 0 && !edge[f(arr[i].charAt(j))][f(arr[i].charAt(j - 1))]) 
                { 
                    gr[f(arr[i].charAt(j))].add(f(arr[i].charAt(j - 1))); 
                    edge[f(arr[i].charAt(j))][f(arr[i].charAt(j - 1))] = true; 
                } 
                if (j + 1 < m && !edge[f(arr[i].charAt(j))][f(arr[i].charAt(j + 1))])  
                { 
                    gr[f(arr[i].charAt(j))].add(f(arr[i].charAt(j + 1))); 
                    edge[f(arr[i].charAt(j))][f(arr[i].charAt(j + 1))] = true; 
                } 
                if (i - 1 >= 0 && !edge[f(arr[i].charAt(j))][f(arr[i - 1].charAt(j))])  
                { 
                    gr[f(arr[i].charAt(j))].add(f(arr[i - 1].charAt(j))); 
                    edge[f(arr[i].charAt(j))][f(arr[i - 1].charAt(j))] = true; 
                } 
            } 
  
        // Queue to perform BFS 
        Queue<Integer> q = new LinkedList<Integer>(); 
        q.add(arr[0].charAt(0) - 'a'); 
  
        // Visited array 
        boolean[] v = new boolean[MAX]; 
  
        // To store the depth of BFS 
        int d = 0; 
  
        // BFS 
        while (q.size() > 0) 
        { 
  
            // Number of elements in 
            // the current level 
            int cnt = q.size(); 
  
            // Inner loop 
            while (cnt-- > 0) 
            { 
  
                // Current element 
                int curr = q.peek(); 
  
                // Popping queue 
                q.remove(); 
  
                // If the current node has 
                // already been visited 
                if (v[curr]) 
                    continue; 
                v[curr] = true; 
  
                // Checking if the current 
                // node is the required node 
                if (curr == arr[n - 1].charAt(m - 1) - 'a') 
                    return d; 
  
                // Iterating through the current node 
                for (Integer it : gr[curr]) 
                    q.add(it); 
            } 
  
            // Updating the depth 
            d++; 
        } 
  
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String[] arr = { "abc", "def", "gbi" }; 
  
        System.out.print(findMinCost(arr)); 
  
    } 
} 
  
// This code is contributed by 29AjayKumar 

