

// Java implmentation to make  
// array elements equal with 
// minimum cost 
class GFG { 
  
    // Function to find the minimum 
    // cost required to make array 
    // elements equal 
    static void makearrayequal(int arr[], int n) 
    { 
        int x = 0; 
          
        // Loop to find the  
        // count of odd elements 
        for (int i = 0; i < n; i++) { 
            x += (arr[i] & 1); 
        } 
      
        System.out.println(Math.min(x, n - x)); 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int arr[] = { 4, 3, 2, 1 }; 
        int n = arr.length; 
        makearrayequal(arr, n); 
         
    } 
} 
  
// This code is contributed by Yash_R 

