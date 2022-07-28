

// Java program to find the ratio of positive, 
// negative, and zero elements in the array. 
  
class GFG { 
  
    // Function to find the ratio of 
    // positive, negative, and zero elements 
    static void positiveNegativeZero(int[] arr) 
    { 
  
        // Store the array length into the varible len. 
        int len = arr.length; 
  
        // Initialize the postiveCount, negativeCount, and 
        // zeroCountby 0 which will count the total number 
        // of positive, negative and zero elements 
        float positiveCount = 0; 
        float negativeCount = 0; 
        float zeroCount = 0; 
  
        // Traverse the array and count the total number of 
        // positive, negative, and zero elements. 
        for (int i = 0; i < len; i++) { 
            if (arr[i] > 0) { 
                positiveCount++; 
            } 
            else if (arr[i] < 0) { 
                negativeCount++; 
            } 
            else if (arr[i] == 0) { 
                zeroCount++; 
            } 
        } 
  
        // Print the ratio of positive, 
        // negative, and zero elements 
        // in the array up to four decimal places. 
        System.out.printf("%1.4f ", positiveCount / len); 
        System.out.printf("%1.4f ", negativeCount / len); 
        System.out.printf("%1.4f ", zeroCount / len); 
        System.out.println(); 
    } 
  
    // Driver Code. 
    public static void main(String args[]) 
    { 
  
        // Test Case 1: 
        int[] a1 = { 2, -1, 5, 6, 0, -3 }; 
        positiveNegativeZero(a1); 
  
        // Test Case 2: 
        int[] a2 = { 4, 0, -2, -9, -7, 1 }; 
        positiveNegativeZero(a2); 
    } 
} 

