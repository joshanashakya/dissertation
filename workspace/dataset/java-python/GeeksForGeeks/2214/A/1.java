

// Java implementation for above approach 
class GFG 
{ 
      
// Function to find the number of ways to divide 
// N into four parts such that a = c and b = d 
static int possibleways(int n) 
{ 
    if (n % 2 == 1) 
        return 0; 
    else if (n % 4 == 0) 
        return n / 4 - 1; 
    else
        return n / 4; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 20; 
    System.out.println(possibleways(n)); 
} 
} 
  
// This code contributed by Rajput-Ji 

