

// Java implementation of the approach 
class GFG 
{ 
    static final int TEN = 10; 
      
    // Function to update the frequency array 
    // such that freq[i] stores the 
    // frequency of digit i in n 
    static void updateFreq(int n, int [] freq) 
    { 
      
        // While there are digits 
        // left to process 
        while (n > 0) 
        { 
            int digit = n % TEN; 
      
            // Update the frequency of 
            // the current digit 
            freq[digit]++; 
      
            // Remove the last digit 
            n /= TEN; 
        } 
    } 
      
    // Function that returns true if a and b 
    // are anagarams of each other 
    static boolean areAnagrams(int a, int b) 
    { 
      
        // To store the frequencies of 
        // the digits in a and b 
        int [] freqA = new int[TEN]; 
        int [] freqB = new int[TEN]; 
      
        // Update the frequency of 
        // the digits in a 
        updateFreq(a, freqA); 
      
        // Update the frequency of 
        // the digits in b 
        updateFreq(b, freqB); 
      
        // Match the frequencies of 
        // the common digits 
        for (int i = 0; i < TEN; i++)  
        { 
      
            // If frequency differs for any digit 
            // then the numbers are not 
            // anagrams of each other 
            if (freqA[i] != freqB[i]) 
                return false; 
        } 
        return true; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int a = 204, b = 240; 
      
        if (areAnagrams(a, b)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by ihirtik 
         

