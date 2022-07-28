

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
    // Function to count minimum number of subarrays  
    static int minimumSubarrays(int ar[], int n)  
    {  
        Vector se = new Vector(); 
      
        int cnt = 1;  
      
        for (int i = 0; i < n; i++) 
        {  
              
            // Checking if an element already exist in  
            // the current sub-array  
            if (se.contains(ar[i]) == false)  
            {  
                // inserting the current element  
                se.add(ar[i]);  
            }  
            else
            {  
                cnt++;  
                  
                // clear set for new possible value  
                // of subarrays  
                se.clear(); 
                  
                // inserting the current element  
                se.add(ar[i]);  
            }  
        }  
        return cnt;  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        int ar[] = { 1, 2, 1, 3, 4, 2, 4, 4, 4 };  
        int n = ar.length ; 
          
        System.out.println(minimumSubarrays(ar, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

