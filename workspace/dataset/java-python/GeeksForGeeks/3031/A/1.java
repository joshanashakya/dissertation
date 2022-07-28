

// Java program to count the number of pairs 
// whose product is equal to K 
class GFG { 
  
     // Function to count the number of pairs 
    // whose product is equal to K 
    static int countPairsWithProdK(int arr[], int n, int k) 
    { 
        int count = 0; 
      
        // Pick all elements one by one 
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) 
      
                // Check if the product of this pair 
                // is equal to K 
                if (arr[i] * arr[j] == k) 
                    count++; 
        } 
      
        return count; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { 1, 5, 3, 4, 2 }; 
        int N = arr.length; 
        int K = 3; 
      
        System.out.println(countPairsWithProdK(arr, N, K)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

