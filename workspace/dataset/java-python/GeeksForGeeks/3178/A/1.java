

// Java program to calculate the sum of all 
// palindromic numbers in array 
  
class GFG { 
  
    // Function to reverse a number n 
    static int reverse(int n) 
    { 
        int d = 0, s = 0; 
  
        while (n > 0) { 
            d = n % 10; 
            s = s * 10 + d; 
            n = n / 10; 
        } 
  
        return s; 
    } 
  
    // Function to check if a number n is 
    // palindrome 
    static boolean isPalin(int n) 
    { 
        // If n is equal to the reverse of n 
        // it is a palindrome 
        return n == reverse(n); 
    } 
  
    // Function to calculate sum of all array 
    // elements which are palindrome 
    static int sumOfArray(int[] arr, int n) 
    { 
        int s = 0; 
  
        for (int i = 0; i < n; i++) { 
            if ((arr[i] > 10) && isPalin(arr[i])) { 
  
                // summation of all palindrome numbers 
                // present in array 
                s += arr[i]; 
            } 
        } 
  
        return s; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 6; 
  
        int[] arr = { 12, 313, 11, 44, 9, 1 }; 
  
        System.out.println(sumOfArray(arr, n)); 
    } 
} 

