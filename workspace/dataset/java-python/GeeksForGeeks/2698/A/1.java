

// Java implementation of above approach 
import java.util.*; 
class GFG  
{ 
  
// Function to print the 
// unique sub-String of length n 
static void result(String s, int n) 
{ 
    // set to store the Strings 
    HashSet<String> st = new HashSet<String>(); 
  
    for (int i = 0; i < (int)s.length(); i++)  
    { 
        String ans = ""; 
        for (int j = i; j < (int)s.length(); j++) 
        { 
            ans += s.charAt(j); 
  
            // if the size of the String 
            // is equal to 1 then insert 
            if (ans.length()== n) 
            { 
  
                // inserting unique 
                // sub-String of length L 
                st.add(ans); 
                break; 
            } 
        } 
    } 
  
    // Printing the set of Strings 
    for (String it : st) 
        System.out.print(it + " "); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "abca"; 
    int n = 3; 
  
    // Function calling 
    result(s, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

