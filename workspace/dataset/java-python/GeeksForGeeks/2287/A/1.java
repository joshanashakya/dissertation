

// JAVA program to generate 
// Gould's Sequence 
  
class GFG { 
  
    // 32768 = 2^15 
    static final int MAX = 32768; 
  
    // Array to store Sequence up to 
    // 2^16 = 65536 
    static int[] arr = new int[2 * MAX]; 
  
    // Utility function to pre-compute odd numbers 
    // in ith row of Pascals's triangle 
    static void gouldSequence() 
    { 
  
        // First term of the Sequence is 1 
        arr[0] = 1; 
  
        // Initilize i to 1 
        int i = 1; 
  
        // Initilize p to 1 (i.e 2^i) 
        // in each iteration 
        // i will be pth power of 2 
        int p = 1; 
  
        // loop to generate gould's Sequence 
        while (i <= MAX) { 
  
            // i is pth power of 2 
            // traverse the array 
            // from j=0 to i i.e (2^p) 
  
            int j = 0; 
  
            while (j < i) { 
                // double the value of arr[j] 
                // and store to arr[i+j] 
                arr[i + j] = 2 * arr[j]; 
                j++; 
            } 
  
            // upadate i to next power of 2 
            i = (1 << p); 
  
            // increment p 
            p++; 
        } 
    } 
  
    // Function to print gould's Sequence 
    static void printSequence(int n) 
    { 
        // loop to generate gould's Sequence up to n 
  
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        gouldSequence(); 
  
        // Get n 
        int n = 16; 
  
        // Function call 
        printSequence(n); 
    } 
} 

