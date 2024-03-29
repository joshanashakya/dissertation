

// Java implementation to find the minimum flips 
// required such that alternate subarrays 
// have different parity 
  
import java.util.*; 
  
class Count_Flips { 
      
    // Function to find the minimum 
    // flips required in binary array 
    public static int count_flips( 
              int a[], int n, int k){ 
          
        // Boolean value to indicate 
        // odd or even value of 1's 
        boolean set = false; 
        int ans = 0,  
           min_diff = Integer.MAX_VALUE; 
          
        // Loop to iterate over  
        // the subarrays of size K 
        for (int i = 0; i < k; i++) { 
              
            // curr_index is used to iterate 
            // over all the subarrays 
            int curr_index = i, segment = 0,  
               count_zero = 0, count_one = 0; 
              
            // Loop to iterate over the array 
            // at the jump of K to  
            // consider every parity 
            while (curr_index < n) { 
                  
                // Condition to check if the  
                // subarray is at even position 
                if (segment % 2 == 0) { 
                      
                    // The value needs to be  
                    // same as the first subarray 
                    if (a[curr_index] == 1) 
                        count_zero++; 
                    else
                        count_one++; 
                } 
                else { 
                    // The value needs to be  
                    // opposite of the first subarray 
                    if (a[curr_index] == 0) 
                        count_zero++; 
                    else
                        count_one++; 
                } 
                curr_index = curr_index + k; 
                segment++; 
            } 
            ans += Math.min(count_one, count_zero); 
            if (count_one < count_zero) 
                set = !set; 
            // Update the minimum difference 
            min_diff = Math.min(min_diff,  
             Math.abs(count_zero - count_one)); 
        } 
        // Condition to check if the 1s 
        // in the subarray is odd 
        if (set) 
            return ans; 
        else
            return ans + min_diff; 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 6, k = 3; 
        int a[] = { 0, 0, 1, 1, 0, 0 }; 
        System.out.println(count_flips(a, n, k)); 
    } 
} 

