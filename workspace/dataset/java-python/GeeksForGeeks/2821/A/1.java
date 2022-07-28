

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
      
// Function that returns true if the string 
// can be made equal after one swap 
static boolean canBeEqual(char []a,  
                          char []b, int n) 
{ 
    // A and B are new a and b 
    // after we omit the same elements 
    Vector<Character> A = new Vector<>(); 
    Vector<Character> B = new Vector<>(); 
  
    // Take only the characters which are 
    // different in both the strings 
    // for every pair of indices 
    for (int i = 0; i < n; i++) 
    { 
  
        // If the current characters differ 
        if (a[i] != b[i]) 
        { 
            A.add(a[i]); 
            B.add(b[i]); 
        } 
    } 
      
    // The strings were already equal 
    if (A.size() == B.size() &&  
        B.size() == 0) 
        return true; 
  
    // If the lengths of the 
    // strings are two 
    if (A.size() == B.size() &&  
        B.size() == 2) 
    { 
  
        // If swapping these characters 
        // can make the strings equal 
        if (A.get(0) == A.get(1) &&  
            B.get(0) == B.get(1)) 
            return true; 
    } 
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    char []A = "SEEKSFORGEEKS".toCharArray(); 
    char []B = "GEEKSFORGEEKG".toCharArray(); 
      
    if (canBeEqual(A, B, A.length)) 
        System.out.printf("Yes"); 
    else
        System.out.printf("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

