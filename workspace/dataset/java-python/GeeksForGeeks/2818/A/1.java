

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count of 
// minimum operations required 
static int minOperations(String str, int n) 
{ 
    int count = 0; 
    for (int i = 0; i < n - 1; i++)  
    { 
  
        // Increment count when consecutive 
        // characters are different 
        if (str.charAt(i) != str.charAt(i + 1)) 
            count++; 
    } 
  
    // Answer is rounding off the 
    // (count / 2) to lower 
    return (count + 1) / 2; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "000111"; 
    int n = str.length(); 
  
    System.out.println(minOperations(str, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

