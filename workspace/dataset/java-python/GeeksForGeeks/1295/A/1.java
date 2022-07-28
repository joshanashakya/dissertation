

// Java implementation of the approach 
class GFG 
{ 
      
// Function to find two composite 
// numbers which when added 
// give sum as n 
static void findNums(int n) 
{ 
  
    // Only 8 and 10 can be represented 
    // as the sum of two composite integers 
    if (n <= 11)  
    { 
        if (n == 8) 
            System.out.print("4 4"); 
        if (n == 10) 
            System.out.print("4 6"); 
        else
            System.out.print("-1"); 
        return; 
    } 
  
    // If n is even 
    if (n % 2 == 0) 
        System.out.print("4 " + (n - 4)); 
  
    // If n is odd 
    else
        System.out.print("9 " + (n - 9)); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 13; 
  
    findNums(n); 
} 
} 
  
// This code is contributed by andrew1234 

