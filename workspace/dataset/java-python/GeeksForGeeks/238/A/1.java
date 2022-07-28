

// Java program to count subarrays  
// having product less than k. 
class GFG  
{ 
    static int countsubarray(int array[],  
                             int n, int k) 
    { 
        int count = 0;  
        int i, j, mul;  
          
        for (i = 0; i < n; i++) 
        { 
              
            // Counter for single element 
            if (array[i] <= k) 
                count++; 
      
            mul = array[i]; 
      
            for (j = i + 1; j < n; j++)  
            { 
                  
                // Multiple subarray 
                mul = mul * array[j];  
                  
                // If this multiple is less 
                // than k, then increment 
                if (mul <= k)  
                    count++;  
                else
                    break;  
            } 
        } 
      
        return count; 
    } 
      
    // Driver Code 
    public static void main(String args[])  
    { 
        int array[] = {1, 2, 3, 4}; 
        int k = 10; 
        int size = array.length; 
          
        int count = countsubarray(array, size, k); 
        System.out.print(count); 
    } 
} 
  
// This code is contributed by Sam007 

