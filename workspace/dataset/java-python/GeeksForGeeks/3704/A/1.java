

// Java program to count number of ways we can 
// form triplets with minimum product. 
import java.util.Arrays; 
  
class GFG { 
          
    // function to calculate number of triples 
    static long noOfTriples(long arr[], int n) 
    { 
          
        // Sort the array 
        Arrays.sort(arr); 
      
        // Count occurrences of third element 
        long count = 0; 
        for (int i = 0; i < n; i++)  
            if (arr[i] == arr[2]) 
                count++; 
          
        // If all three elements are same (minimum 
        // element appears at least 3 times). Answer 
        // is nC3. 
        if (arr[0] == arr[2]) 
            return (count - 2) * (count - 1) *  
                                      (count) / 6; 
      
        // If minimum element appears once.  
        // Answer is nC2. 
        else if (arr[1] == arr[2]) 
            return (count - 1) * (count) / 2; 
      
        // Minimum two elements are distinct. 
        // Answer is nC1. 
        return count; 
    } 
      
    //driver code 
    public static void main(String arg[]) 
    { 
          
        long arr[] = { 1, 3, 3, 4 }; 
        int n = arr.length; 
          
        System.out.print(noOfTriples(arr, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

