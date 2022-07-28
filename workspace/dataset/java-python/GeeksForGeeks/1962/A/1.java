

// Java program to count maximum consecutive 
// 1's in a binary circular array 
class GfG { 
  
    // Function to return the count of maximum 
    // consecutive 1's in a binary circular array 
    static int getMaxLength(int arr[], int n) 
    { 
        // Starting index 
        int start = 0; 
  
        // To store the maximum length of the 
        // prefix of the given array with all 1s 
        int preCnt = 0; 
        while (start < n && arr[start] == 1) { 
            preCnt++; 
            start++; 
        } 
  
        // Ending index 
        int end = n - 1; 
  
        // To store the maximum length of the 
        // suffix of the given array with all 1s 
        int suffCnt = 0; 
        while (end >= 0 && arr[end] == 1) { 
            suffCnt++; 
            end--; 
        } 
  
        // The array contains all 1s 
        if (start > end) 
            return n; 
  
        // Find the maximum length subarray 
        // with all 1s from the remaining not 
        // yet traversed subarray 
        int midCnt = 0; 
  
        // To store the result for middle 1s 
        int result = 0; 
  
        for (int i = start; i <= end; i++) { 
            if (arr[i] == 1) { 
                midCnt++; 
                result = Math.max(result, midCnt); 
            } 
            else { 
                midCnt = 0; 
            } 
        } 
  
        // (preCnt + suffCnt) is the subarray when 
        // the given array is assumed to be circular 
        return Math.max(result, preCnt + suffCnt); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = new int[] { 1, 1, 0, 0, 1, 0, 
                                1, 0, 1, 1, 1, 1 }; 
        int n = arr.length; 
        System.out.println(getMaxLength(arr, n)); 
    } 
} 
  
// This code is contributed by Prerna Saini 

