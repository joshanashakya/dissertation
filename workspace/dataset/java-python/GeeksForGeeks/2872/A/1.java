

// Java implementation of the approach 
import java.util.*; 
class GFG { 
  
    // Function to print the ordering of words 
    static void reArrange(String words[], int n) 
    { 
  
        // Creating list of words and assigning 
        // them index numbers 
        HashMap<String, Integer> freq = new HashMap<>(); 
        for (int i = 0; i < n; i++) { 
            freq.put(words[i], (i + 1)); 
        } 
  
        // Sort the list of words 
        // lexicographically 
        Arrays.sort(words); 
  
        // Print the ordering 
        for (int i = 0; i < n; i++) 
            System.out.print(freq.get(words[i]) + " "); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String words[] = { "live", "place", "travel", "word", "sky" }; 
        int n = words.length; 
        reArrange(words, n); 
    } 
} 

