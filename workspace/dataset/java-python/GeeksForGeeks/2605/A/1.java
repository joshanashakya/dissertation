

// Java program to print all  
// increasing sequences of 
// length 'k' such that the  
// elements in every sequence 
// are from first 'n'  
// natural numbers. 
  
class GFG { 
      
    // A utility function to print  
    // contents of arr[0..k-1] 
    static void printArr(int[] arr, int k) 
    { 
        for (int i = 0; i < k; i++) 
            System.out.print(arr[i] + " "); 
        System.out.print("\n"); 
    } 
      
    // A recursive function to print 
    // all increasing sequences 
    // of first n natural numbers.  
    // Every sequence should be 
    // length k. The array arr[] is  
    // used to store current sequence 
    static void printSeqUtil(int n, int k,  
                             int len, int[] arr) 
    { 
          
        // If length of current increasing 
        // sequence becomes k, print it 
        if (len == k) 
        { 
            printArr(arr, k); 
            return; 
        } 
      
        // Decide the starting number  
        // to put at current position: 
        // If length is 0, then there 
        // are no previous elements 
        // in arr[]. So start putting  
        // new numbers with 1. 
        // If length is not 0,  
        // then start from value of 
        // previous element plus 1. 
        int i = (len == 0) ? 1 : arr[len - 1] + 1; 
      
        // Increase length 
        len++; 
      
        // Put all numbers (which are  
        // greater than the previous 
        // element) at new position. 
        while (i <= n) 
        { 
            arr[len - 1] = i; 
            printSeqUtil(n, k, len, arr); 
            i++; 
        } 
      
        // This is important. The  
        // variable 'len' is shared among 
        // all function calls in recursion  
        // tree. Its value must be 
        // brought back before next  
        // iteration of while loop 
        len--; 
    } 
      
    // This function prints all  
    // increasing sequences of 
    // first n natural numbers.  
    // The length of every sequence 
    // must be k. This function 
    // mainly uses printSeqUtil() 
    static void printSeq(int n, int k) 
    { 
          
        // An array to store  
        // individual sequences 
        int[] arr = new int[k]; 
          
        // Initial length of  
        // current sequence 
        int len = 0;  
        printSeqUtil(n, k, len, arr); 
    } 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
        int k = 3, n = 7; 
        printSeq(n, k); 
    } 
} 
  
// This code is contributed by Smitha. 

