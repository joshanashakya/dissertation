

// Java program to count the set 
// bits after taking XOR with a 
// number K 
class GFG { 
  
      
    /* Function to get no of set   
    bits in binary representation   
    of positive integer n */
    static int __builtin_popcount(int n)  
    {  
        int count = 0;  
        while (n > 0) {  
            count += n & 1;  
            n >>= 1;  
        }  
        return count;  
    } 
      
    // Function to store EVEN and odd variable 
    static void countEvenOdd(int arr[], int n, int K) 
    { 
        int even = 0, odd = 0; 
      
        // Store the count of even and 
        // odd set bit 
        for (int i = 0; i < n; i++) { 
      
            // Count the set bit using 
            // in built function 
            int x = __builtin_popcount(arr[i]); 
            if (x % 2 == 0) 
                even++; 
            else
                odd++; 
        } 
      
        int y; 
      
        // Count of set-bit of K 
        y = __builtin_popcount(K); 
      
        // If y is odd then, count of 
        // even and odd set bit will 
        // be interchanged 
        if ((y & 1) != 0) { 
            System.out.println("Even = "+ odd + ", Odd = " + even); 
        } 
      
        // Else it will remain same as 
        // the original array 
        else { 
            System.out.println("Even = " + even + ", Odd = " + odd); 
        } 
    } 
      
    // Driver's Code 
    public static void main (String[] args) 
    { 
        int arr[] = { 4, 2, 15, 9, 8, 8 }; 
        int K = 3; 
        int n = arr.length; 
      
        // Function call to count even 
        // and odd 
        countEvenOdd(arr, n, K); 
    } 
   
} 
// This code is contributed by Yash_R 

