

// Java program to calculate 
// minimum cost for candies 
import java.io.*; 
  
class GFG  
{ 
    // Function to find minimum cost 
    // to be incurred 
    static int findMinCost(int arr[], int n, int choc_cost)  
    { 
      
    // To reach first station, initial 
    // chocolates required 
    int choc_buy = arr[0]; 
    int curr_choc = 0; 
      
    // Start traversing 
    for (int i = 0; i < n - 1; i++)  
    { 
      
        // Find no. of chocolates 
        // lose or gain 
        int choc = arr[i] - arr[i + 1]; 
      
        // Add into curr_coc 
        curr_choc += choc; 
      
        // if no. of chocolates becomes 
        // negative that means we have 
        // to buy that no. of chocolates 
        if (curr_choc < 0)  
        { 
            choc_buy += Math.abs(curr_choc); 
            curr_choc = 0; 
        } 
    } 
      
    // Return cost required 
    return choc_buy * choc_cost; 
    } 
      
    // Drivers code 
    public static void main (String[] args)  
    { 
        int arr[] = {10, 6, 11, 4, 7, 1}; 
        int n = arr.length; 
          
        // Price of each candy 
        int p = 5; 
          
        System.out.println ( findMinCost(arr, n, p));    
    } 
} 
  
// This code is contributed by vt_m 

