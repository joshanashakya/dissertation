

// Java program to find length  
// of period of 1/n without using  
// map or hash 
  
class GFG { 
      
// Function to find length of period in 1/n 
static int getPeriod(int n) 
{ 
    // Find the (n+1)th remainder after 
    // decimal point in value of 1/n 
      
    int rem = 1; // Initialize remainder 
    for (int i = 1; i <= n + 1; i++) 
            rem = (10 * rem) % n; 
      
    // Store (n+1)th remainder 
    int d = rem; 
      
    // Count the number of remainders before next 
    // occurrence of (n+1)'th remainder 'd' 
    int count = 0; 
    do { 
        rem = (10 * rem) % n; 
        count++; 
    } while(rem != d); 
      
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    System.out.println(getPeriod(3) ); 
    System.out.println(getPeriod(7)); 
} 
} 
  
// This code is contributed by Smitha Dinesh Semwal 

