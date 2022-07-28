

// Java program to count the number of pairs 
import java.io.*; 
  
class GFG { 
  
    static int MAX = 256; 
      
    // Function to count the number of equal pairs 
    static int countPairs(String s) 
    { 
        // Hash table 
        int cnt[] = new int[MAX]; 
      
        // Traverse the string and count occurrence 
        for (int i = 0; i < s.length(); i++) 
            cnt[s.charAt(i)]++; 
      
        // Stores the answer 
        int ans = 0; 
      
        // Traverse and check the occurrence 
        // of every character 
        for (int i = 0; i < MAX; i++) 
            ans += cnt[i] * cnt[i]; 
      
        return ans; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        String s = "geeksforgeeks"; 
        System.out.println(countPairs(s)); 
    } 
} 
  
// This code is contributed by vt_m 

