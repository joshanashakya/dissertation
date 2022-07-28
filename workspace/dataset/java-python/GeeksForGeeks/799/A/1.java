

// Java program to find the remainder 
// when the First digit of a number 
// is divided by its Last digit 
class GFG 
{ 
      
// Function to find the remainder 
static void findRemainder(int n) 
{ 
    // Get the last digit 
    int l = n % 10; 
  
    // Get the first digit 
    while (n >= 10) 
        n /= 10; 
    int f = n; 
  
    // Compute the remainder 
    int remainder = f % l; 
  
    System.out.println(remainder); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5223; 
    findRemainder(n); 
} 
} 
  
// This code is contributed by Code_Mech 

