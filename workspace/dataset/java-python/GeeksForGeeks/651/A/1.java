

// Java implementation of the approach 
public class GFG { 
  
    // Function to return the maximum length 
    // of the sub-array such that the 
    // absolute difference between every two 
    // consecutive elements is either 1 or 0 
    public static int getMaxLength(int arr[]) 
    { 
  
        int l = arr.length; 
        int i = 0, maxlen = 0; 
        while (i < l) { 
            int j = i; 
            while (i + 1 < l 
                   && (Math.abs(arr[i] - arr[i + 1]) == 1
                       || Math.abs(arr[i] - arr[i + 1]) == 0)) { 
                i++; 
            } 
  
            // Length of the valid sub-array currently 
            // under cosideration 
            int currLen = i - j + 1; 
  
            // Update the maximum length 
            if (maxlen < currLen) 
                maxlen = currLen; 
  
            if (j == i) 
                i++; 
        } 
  
        // Any valid sub-array cannot be of length 1 
        maxlen = (maxlen == 1) ? 0 : maxlen; 
  
        // Return the maximum possible length 
        return maxlen; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 4 }; 
        System.out.print(getMaxLength(arr)); 
    } 
} 

