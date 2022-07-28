

// Java implementation of the approach 
  
class GFG { 
  
    // Function to return the maximum number 
    // of edges possible in a Bipartite 
    // graph with N vertices 
    public static double maxEdges(double N) 
    { 
        double edges = 0; 
  
        edges = Math.floor((N * N) / 4); 
  
        return edges; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        double N = 5; 
        System.out.println(maxEdges(N)); 
    } 
} 
  
// This code is contributed by Naman_Garg. 

