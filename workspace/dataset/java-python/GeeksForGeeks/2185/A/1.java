

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count 
// of required numbers 
static int countNumbers(int l, int r) 
{ 
  
    // Count of numbers in range 
    // which are divisible by 6 
    return ((r / 6) - (l - 1) / 6); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int l = 1000, r = 6000; 
    System.out.println(countNumbers(l, r)); 
} 
} 
  
// This code is contributed by princiraj1992 

