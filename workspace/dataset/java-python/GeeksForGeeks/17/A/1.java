

// Java program to validate above logic 
class GFG 
{ 
      
// Function to check if the  
// number is divisible by  
// 23 or not 
static boolean isDivisible(long n)  
{ 
  
    // While there are at  
    // least 3 digits 
    while (n / 100 != 0)  
    { 
        // Extracting the last digit 
        long d = n % 10;  
          
        n /= 10; // Truncating the number 
  
        // Adding seven times the last  
        // digit to the remaining number 
        n += d * 7;  
    } 
  
    return (n % 23 == 0); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    long n = 1191216; 
    if(isDivisible(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by mits 

