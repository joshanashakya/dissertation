

// Java program to count deletions 
// to reduce the string to its  
// shortest length by deleting a  
// pair of same adjacent characters 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
      
// Function count 
// the operations 
static int reduceString(String s,  
                        int l) 
{ 
  
    int count = 1, steps = 0; 
  
    // traverse in the string 
    for (int i = 1; i < l; i++) 
    { 
        // if adjacent characters  
        // are same 
        if (s.charAt(i) == s.charAt(i - 1)) 
            count += 1; 
  
        else
        { 
            // if same adjacent pairs  
            // are more than 1 
            steps += (count / 2); 
  
            count = 1; 
        } 
    } 
        steps += count / 2; 
    return steps; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s = "geeksforgeeks"; 
      
    int l = s.length(); 
    System.out.print(reduceString(s, l) + "\n"); 
} 
} 

