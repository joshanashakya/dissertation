

// Java implementation of the approach 
class GFG { 
  
    // pair class 
    static class pair { 
        int first, second; 
        pair(int a, int b) 
        { 
            first = a; 
            second = b; 
        } 
    } 
  
    // Function to pre-calculate the left[] array 
    static void preCalculate(int binary[], int n, 
                             pair left[]) 
    { 
        int count1 = 0, count0 = 0; 
  
        // Iterate in the binary array 
        for (int i = 0; i < n; i++) { 
  
            // Initialize the number 
            // of 1 and 0 
            left[i].first = count1; 
            left[i].second = count0; 
  
            // Increase the count 
            if (binary[i] != 0) 
                count1++; 
            else
                count0++; 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        int binary[] = { 1, 1, 1, 0, 0, 1, 0, 1, 1 }; 
        int n = binary.length; 
        pair left[] = new pair[n]; 
  
        for (int i = 0; i < n; i++) 
            left[i] = new pair(0, 0); 
  
        preCalculate(binary, n, left); 
  
        // Queries 
        int queries[] = { 0, 1, 2, 4 }; 
        int q = queries.length; 
  
        // Solve queries 
        for (int i = 0; i < q; i++) 
            System.out.println(left[queries[i]].first + " ones "
                               + left[queries[i]].second + " zeros\n"); 
    } 
} 
  
// This code is contributed by Arnab Kundu 

