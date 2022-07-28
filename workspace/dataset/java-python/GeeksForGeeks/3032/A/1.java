

// Java program to count the number of pairs 
// whose product is equal to K 
      
class GFG 
{ 
    static int MAX = 100000; 
      
    // Function to count the number of pairs 
    // whose product is equal to K 
    static int countPairsWithProductK(int arr[], int n, int k) 
    { 
        // Initialize the count 
        int count = 0; 
        int i; 
  
        // Initialize empty hashmap. 
        boolean hashmap[] = new boolean[MAX]; 
          
        // Insert array elements to hashmap 
        for (i = 0; i < n; i++) 
            hashmap[arr[i]] = true; 
          
        for (i = 0; i < n; i++) { 
            int x = arr[i]; 
          
            double index = 1.0 * k / arr[i]; 
          
            // Checking if the index is a whole number 
            // and present in the hashmap 
            if (index >= 0
                && ((index - (int)(index)) == 0) 
                && hashmap[k / x]) 
          
                count++; 
            hashmap[x] = false; 
        } 
        return count; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int arr[] = { 1, 5, 3, 4, 2 }; 
        int N = arr.length; 
        int K = 3; 
          
        System.out.print(countPairsWithProductK(arr, N, K)); 
          
    } 
} 

