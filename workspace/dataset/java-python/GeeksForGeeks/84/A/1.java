

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
   
// Function to return the lexicographically 
// smallest String that can be formed by 
// swapping at most one character. 
// The characters might not necessarily 
// be adjacent. 
static String findSmallest(char []s) 
{ 
    int len = s.length; 
   
    // Store last occurrence of every character 
    int []loccur = new int[26]; 
   
    // Set -1 as default for every character. 
    Arrays.fill(loccur, -1); 
   
    for (int i = len - 1; i >= 0; --i) { 
   
        // Character index to fill 
        // in the last occurrence array 
        int chI = s[i] - 'a'; 
        if (loccur[chI] == -1) { 
   
            // If this is true then this 
            // character is being visited 
            // for the first time from the last 
            // Thus last occurrence of this 
            // character is stored in this index 
            loccur[chI] = i; 
        } 
    } 
   
    char []sorted_s = s; 
    Arrays.sort(sorted_s); 
   
    for (int i = 0; i < len; ++i) { 
        if (s[i] != sorted_s[i]) { 
   
            // Character to replace 
            int chI = sorted_s[i] - 'a'; 
   
            // Find the last occurrence 
            // of this character. 
            int last_occ = loccur[chI]; 
   
            // Swap this with the last occurrence 
            char temp = s[last_occ]; 
            s[last_occ] = s[i]; 
            s[i] = temp; 
            break; 
        } 
    } 
   
    return String.valueOf(s); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String s = "geeks"; 
    System.out.print(findSmallest(s.toCharArray())); 
} 
} 
  
// This code is contributed by 29AjayKumar 

