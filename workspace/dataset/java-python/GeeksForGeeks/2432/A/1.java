

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the count of numbers 
// from 1 to N which are not divisible by 
// any number in the range [2, 10] 
static int countNumbers(int n) 
{ 
    return n - n / 2 - n / 3 - n / 5 - n / 7
        + n / 6 + n / 10 + n / 14 + n / 15 + n / 21 + n / 35
        - n / 30 - n / 42 - n / 70 - n / 105 + n / 210; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 20; 
    System.out.println(countNumbers(n)); 
} 
} 
  
// This code is contributed by mits 

