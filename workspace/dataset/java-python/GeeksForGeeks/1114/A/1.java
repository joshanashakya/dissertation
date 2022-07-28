

// Java implementation of the above approach.  
class GFG  
{ 
      
    // Function to do a binary search  
    // on a given range.  
    static int usingBinarySearch(int start, int end,  
                                int N, int S)  
    {  
        if (start >= end)  
            return start;  
        int mid = start + (end - start) / 2;  
      
        // Total sum is the sum of N numbers.  
        int totalSum = (N * (N + 1)) / 2;  
      
        // Sum until mid  
        int midSum = (mid * (mid + 1)) / 2;  
      
        // If remaining sum is < the required value,  
        // then the required number is in the right half  
        if ((totalSum - midSum) <= S) 
        {  
      
            return usingBinarySearch(start, mid, N, S);  
        }  
        return usingBinarySearch(mid + 1, end, N, S);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int N, S;  
      
        N = 5;  
        S = 11;  
      
        System.out.println(N - usingBinarySearch(1, N, N, S) + 1) ; 
    } 
} 
  
// This code is contributed by AnkitRai01 

