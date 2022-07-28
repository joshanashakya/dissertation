

// Java implementation of the above approach 
class GFG 
{ 
// Return the count of string 
static int maxPartition(String s) 
{ 
    // P will store the answer 
    int n = s.length(), P = 0; 
  
    // Current will store current string 
    // Previous will store the previous 
    // string that has been taken already 
    String current = "", previous = ""; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // Add a character to current string 
        current += s.charAt(i); 
  
        if (!current.equals(previous))  
        { 
  
            // Here we will create a partition and 
            // update the previous string with 
            // current string 
            previous = current; 
  
            // Now we will clear the current string 
            current = ""; 
  
            // Increment the count of partition. 
            P++; 
        } 
    } 
    return P; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    String s = "geeksforgeeks"; 
  
    int ans = maxPartition(s); 
  
    System.out.println(ans); 
} 
} 
  
// This code is contributed by ihritik 

