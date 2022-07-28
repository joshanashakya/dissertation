

// Java implementation of the approach 
class GFG 
{ 
      
// Function that returns true if 
// n is an Osiris number 
static boolean isOsiris(int n) 
{ 
    // 3rd digit 
    int a = n % 10; 
  
    // 2nd digit 
    int b = (n / 10) % 10; 
  
    // 1st digit 
    int c = n / 100; 
  
    int digit_sum = a + b + c; 
  
    // Check the required condition 
    if (n == (2 * (digit_sum)*11))  
    { 
        return true; 
    } 
  
    return false; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 132; 
    if (isOsiris(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Akanksha Rai 

