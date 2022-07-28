

// Java implementation of the approach 
class OddPosition { 
  
    // Function to return the final element 
    public static long getFinalElement(long n) 
    { 
        long finalNum; 
        for (finalNum = 2; finalNum * 2 <= n; finalNum *= 2) 
            ; 
        return finalNum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 12; 
        System.out.println(getFinalElement(N)); 
    } 
} 

