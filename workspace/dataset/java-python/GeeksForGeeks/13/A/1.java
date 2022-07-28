

// Java program to check whether a number 
// is divisible by 43 or not 
class GFG 
{ 
  
// Function to check if the number is  divisible by 43 or not  
static boolean isDivisible(int n)   
{ 
    int d; 
    // While there are at least two digits  
    while ((n / 100) > 0)  
    { 
    
        // Extracting the last  
        d = n % 10; 
    
        // Truncating the number  
        n /= 10; 
    
        // adding thirteen times the last  
        // digit to the remaining number  
        n = Math.abs(n+(d * 13)); 
    } 
    // Finally return if the two-digit 
    // number is divisible by 43 or not 
    return (n % 43 == 0) ; 
} 
   
// Driver Code  
public static void main(String[] args) { 
    int N = 2795; 
    
    if (isDivisible(N))  
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
      
 }      
}     
   
// This code is contributed by PrinciRaj1992 

