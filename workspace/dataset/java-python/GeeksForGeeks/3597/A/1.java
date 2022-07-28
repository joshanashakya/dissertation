

// Java implementation of the approach 
class GFG { 
    // Function to print the odd frequency characters 
    // in the order of their occurrence 
    public static void printChar(String str, int n) 
    { 
  
        // To store the frequency of each of 
        // the character of the string 
        int[] freq = new int[26]; 
  
        // Update the frequency of each character 
        for (int i = 0; i < n; i++) 
            freq[str.charAt(i) - 'a']++; 
  
        // Traverse str character by character 
        for (int i = 0; i < n; i++) { 
  
            // If frequency of current character is odd 
            if (freq[str.charAt(i) - 'a'] % 2 == 1) { 
                System.out.print(str.charAt(i)); 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int n = str.length(); 
        printChar(str, n); 
    } 
} 
  
// This code is contributed by Naman_Garg. 

