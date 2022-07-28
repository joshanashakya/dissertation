

// Java code to find longest subarray with difference 
// between max and min as at-most 1. 
public class Demo { 
  
    public static int longestSubarray(int[] input) 
    { 
        int prev = -1; 
        int current, next; 
        int prevCount = 0, currentCount = 1; 
  
        // longest constant range length 
        int longest = 1; 
  
        // first number 
        current = input[0]; 
  
        for (int i = 1; i < input.length; i++) { 
            next = input[i]; 
  
            // If we see same number 
            if (next == current) { 
                currentCount++; 
            } 
  
            // If we see different number, but 
            // same as previous. 
            else if (next == prev) { 
                prevCount += currentCount; 
                prev = current; 
                current = next; 
                currentCount = 1; 
            } 
  
            // If number is neither same as previous 
            // nor as current.  
            else { 
                longest = Math.max(longest, currentCount + prevCount); 
                prev = current; 
                prevCount = currentCount; 
                current = next; 
                currentCount = 1; 
            } 
        } 
  
        return Math.max(longest, currentCount + prevCount); 
    } 
  
    public static void main(String[] args) 
    { 
        int[] input = { 5, 5, 6, 7, 6 }; 
        System.out.println(longestSubarray(input)); 
    } 
} 

