

// Java program to print the length of the 
// longest subarray such that adjacent elements 
// of the subarray have at least one digit in  
// common. 
  
class GFG { 
  
// function to print the longest subarray 
// such that adjacent elements have at least 
// one digit in common 
    static int longestSubarray(int a[], int n) { 
        // remembers the occurrence of digits in 
        // i-th index number 
        int hash[][] = new int[n][10]; 
  
        // marks the presence of digit in i-th 
        // index number 
        for (int i = 0; i < n; i++) { 
            int num = a[i]; 
            while (num != 0) { 
                // marks the digit 
                hash[i][num % 10] = 1; 
                num /= 10; 
            } 
        } 
  
        // counts the longest Subarray 
        int longest = Integer.MIN_VALUE; 
        // counts the subarray 
        int count = 0; 
  
        // check for all adjacent elements 
        for (int i = 0; i < n - 1; i++) { 
            int j; 
            for (j = 0; j < 10; j++) { 
  
                // if adjacent elements have digit j  
                // in them count and break as we have 
                // got at-least one digit 
                if (hash[i][j] == 1 & hash[i + 1][j] == 1) { 
                    count++; 
                    break; 
                } 
            } 
            // if no digits are common 
            if (j == 10) { 
                longest = Math.max(longest, count + 1); 
                count = 0; 
            } 
        } 
  
        longest = Math.max(longest, count + 1); 
  
        // returns the length of the longest subarray 
        return longest; 
    } 
// Driver Code 
  
    public static void main(String[] args) { 
        int a[] = {11, 22, 33, 44, 54, 56, 63}; 
  
        int n = a.length; 
        // function call 
        System.out.println(longestSubarray(a, n)); 
  
    } 
}  
  
// This code is contributed by 29AjayKumar 

