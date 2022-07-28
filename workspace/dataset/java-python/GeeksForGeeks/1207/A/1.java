

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return s % n 
static int findMod4(String s, int n) 
{ 
  
    // To store the number formed by 
    // the last two digits 
    int k; 
  
    // If it contains a single digit 
    if (n == 1) 
        k = s.charAt(0) - '0'; 
  
    // Take last 2 digits 
    else
        k = (s.charAt(n - 2) - '0') * 10
            + s.charAt(n - 1) - '0'; 
  
    return (k % 4); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String s = "81"; 
    int n = s.length(); 
    System.out.println(findMod4(s, n)); 
} 
} 
  
// This code is contributed by Code_Mech. 

