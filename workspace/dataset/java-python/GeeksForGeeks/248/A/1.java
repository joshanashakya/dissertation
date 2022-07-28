

// Java progarm to find array  
// with K subarrays with sum S 
class GFG 
{  
      
// Function to find array  
// with K subarrays with sum S 
static void SubarraysWithSumS(int n, int k, int s) 
{ 
    for(int i = 0; i < k; i++) 
        System.out.print(s + " "); 
    for(int i = k; i < n; i++) 
        System.out.print(s + 1 + " "); 
}  
      
// Driver Code 
public static void main(String[] args)  
{  
    int n = 4, k = 2, s = 3; 
      
    // Function call 
    SubarraysWithSumS(n, k, s); 
}  
}  
  
// This code is contributed by 29AjayKumar 

