

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the required  
// number of operations 
static int countOperations (int n) 
{ 
    int i = 2; 
      
    // Finding the smallest divisor 
    while ((i * i) < n && (n % i) > 0) 
        i += 1; 
      
    if ((i * i) > n) 
        i = n; 
      
    // Return the count of operations 
    return (1 + (n - i) / 2); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5; 
    System.out.println(countOperations(n)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

