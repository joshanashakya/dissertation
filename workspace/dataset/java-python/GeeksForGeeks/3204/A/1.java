

// Java program to find three indices 
class GFG { 
      
    static final int max = 50009; 
      
    // Function to find required indices. 
    static void find_Indices(int arr[], int n) 
    { 
          
        int sum[] = new int[max]; 
        int index_1, index_2, index_3, index; 
        int k, i; 
  
        // calculating prefix sum from 
        // 1 to i for each i. 
        for (i = 1, k = 0; i <= n; i++) 
            sum[i] = sum[i - 1] + arr[k++]; 
  
        double ans = -(1e15); 
        index_1 = index_2 = index_3 = -1; 
  
        // iterating the loop from 0 to n 
        // for all possibilities. 
        for (int l = 0; l <= n; l++) { 
            index = 0; 
            double vmin = (1e15); 
  
            // Here, we recalling the best 
            // segment to end at position i. 
            for (int r = l; r <= n; r++) { 
  
                // taking the minimal prefix 
                // sum from 0 to i inclusive. 
                if (sum[r] < vmin)  
                { 
                    vmin = sum[r]; 
                    index = r; 
                } 
  
                // calculating the indices. 
                if (sum[l] + sum[r] - vmin > ans)  
                { 
                    ans = sum[l] + sum[r] - vmin; 
                    index_1 = l; 
                    index_2 = index; 
                    index_3 = r; 
                } 
            } 
        } 
  
        // Required indices. 
        System.out.print(index_1 + " " + index_2 + 
                                    " " + index_3); 
    } 
      
    // Driver function. 
    public static void main(String[] args) 
    { 
        int arr[] = { -1, 2, 3 }; 
        int n = arr.length; 
  
        find_Indices(arr, n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

