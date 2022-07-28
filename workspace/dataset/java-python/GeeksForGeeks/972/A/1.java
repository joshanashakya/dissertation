

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to pre-process the sub-strings 
// in sorted order 
static void pre_process(String substrings[],String s) 
{ 
    int n = s.length(); 
  
    // Generate all substrings 
    int count = 0; 
    for (int i = 0; i < n; i++)  
    { 
        String dup = ""; 
  
        // Iterate to find all sub-strings 
        for (int j = i; j < n; j++)  
        { 
            dup += s.charAt(j); 
  
            // Store the sub-string in the vector 
            substrings[count++] = dup; 
        } 
    } 
  
    // Sort the substrings lexicographically 
    int size = substrings.length; 
  
    for(int i = 0; i < size-1; i++) { 
        for (int j = i + 1; j < substrings.length; j++)  
        { 
            if(substrings[i].compareTo(substrings[j]) > 0)  
            { 
                String temp = substrings[i]; 
                substrings[i] = substrings[j]; 
                substrings[j] = temp; 
            } 
        } 
      
    //sort(substrings.begin(), substrings.end()); 
} 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String s = "geek"; 
  
    // To store all the sub-strings 
    String substrings[] = new String[10]; 
    pre_process(substrings, s); 
  
    int queries[] = { 1, 5, 10 }; 
    int q = queries.length; 
  
    // Perform queries 
    for (int i = 0; i < q; i++) 
        System.out.println(substrings[queries[i]-1]); 
  
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

