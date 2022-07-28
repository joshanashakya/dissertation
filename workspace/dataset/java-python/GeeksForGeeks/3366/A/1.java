

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
   
// Function to find the minimum number of 
// deletions required to make the occurrences 
// of the given character K continuous 
static int noOfDeletions(String str, char k) 
{ 
    int ans = 0, cnt = 0, pos = 0; 
   
    // Find the first occurrence of the given letter 
    while (pos < str.length() && str.charAt(pos) != k) { 
        pos++; 
    } 
   
    int i = pos; 
   
    // Iterate from the first occurrence 
    // till the end of the sequence 
    while (i < str.length()) { 
   
        // Find the index from where the occurrence 
        // of the character is not continuous 
        while (i < str.length() && str.charAt(i) == k) { 
            i = i + 1; 
        } 
   
        // Update the answer with the number of 
        // elements between non-consecutive occurrences 
        // of the given letter 
        ans = ans + cnt; 
        cnt = 0; 
        while (i < str.length() && str.charAt(i) != k) { 
            i = i + 1; 
   
            // Update the count for all letters 
            // which are not equal to the given letter 
            cnt = cnt + 1; 
        } 
    } 
   
    // Return the count 
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str1 = "ababababa"; 
    char k1 = 'a'; 
  
    // Calling the function 
    System.out.print(noOfDeletions(str1, k1) +"\n"); 
   
    String str2 = "kprkkoinkopt"; 
    char k2 = 'k'; 
  
    // Calling the function 
    System.out.print(noOfDeletions(str2, k2) +"\n"); 
} 
} 
  
// This code is contributed by Princi Singh 

