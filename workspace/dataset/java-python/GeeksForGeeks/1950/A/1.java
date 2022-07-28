

// java find maximum difference 
// of subset sum 
import java .io.*; 
  
public class GFG { 
      
    // function for maximum subset diff 
    static int maxDiff(int []arr, int n) 
    { 
        int SubsetSum_1 = 0, SubsetSum_2 = 0; 
        for (int i = 0; i <= n - 1; i++) 
        { 
            boolean isSingleOccurance = true; 
            for (int j = i + 1; j <= n - 1; j++) 
            { 
      
                // if frequency of any element 
                // is two make both equal to 
                // zero 
                if (arr[i] == arr[j]) 
                { 
                    isSingleOccurance = false; 
                    arr[i] = arr[j] = 0; 
                    break; 
                } 
            } 
            if (isSingleOccurance) 
            { 
                if (arr[i] > 0) 
                    SubsetSum_1 += arr[i]; 
                else
                    SubsetSum_2 += arr[i]; 
            } 
        } 
          
        return Math.abs(SubsetSum_1 - SubsetSum_2); 
    } 
      
    // driver program 
    static public void main (String[] args) 
    { 
        int []arr = { 4, 2, -3, 3, -2, -2, 8 }; 
        int n = arr.length; 
          
        System.out.println("Maximum Difference = "
                               + maxDiff(arr, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

