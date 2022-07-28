

// Java implementation to find the maximum  
// number of edges for triangle free graph  
class GFG  
{  
  
    // Function to find the maximum number of  
    // edges in a N-vertex graph.  
    public static int solve(int n)  
    { 
          
        // According to the Mantel's theorem  
        // the maximum number of edges will be  
        // floor of [(n^2)/4]  
        int ans = (n * n / 4);  
  
        return ans;  
    }  
  
    // Driver code 
    public static void main(String args[]) 
    {  
        int n = 10;  
        System.out.println(solve(n));  
    }  
} 
  
// This code is contributed by divyamohan123 

