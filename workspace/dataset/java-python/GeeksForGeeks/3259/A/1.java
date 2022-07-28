

// Java implementation of the approach  
class GFG  
{ 
  
    static int INT_MAX = Integer.MAX_VALUE; 
      
    // Function to return the number of i's  
    // such that Pi <= Pj for all 1 <= j <= i  
    // in the permutation of first N natural numbers  
    static int min_index(int p[], int n)  
    {  
      
        // To store the count of such indices  
        int ans = 0;  
      
        // Store the mini value  
        int mini = INT_MAX;  
      
        // For all the elements  
        for (int i = 0; i < n; i++) 
        {  
            if (p[i] <= mini)  
                mini = p[i];  
      
            if (mini == p[i])  
                ans++;  
        }  
      
        // Return the required answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int P[] = { 4, 2, 5, 1, 3 };  
        int n = P.length;  
      
        System.out.println(min_index(P, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

