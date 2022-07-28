

// Java program to count of pairs with equal 
// elements in an array. 
class GFG { 
          
    // Return the number of pairs with equal 
    // values. 
    static int countPairs(int arr[], int n) 
    { 
        int ans = 0; 
      
        // for each index i and j 
        for (int i = 0; i < n; i++) 
            for (int j = i+1; j < n; j++) 
      
                // finding the index with same 
                // value but different index. 
                if (arr[i] == arr[j]) 
                    ans++; 
        return ans; 
    } 
      
    //driver code 
    public static void main (String[] args) 
    { 
        int arr[] = { 1, 1, 2 }; 
        int n = arr.length; 
          
        System.out.println(countPairs(arr, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

