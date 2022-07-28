

// A optimised program to find the  
// number of digits in a factorial in base b 
class GFG{ 
   
// Returns the number of digits present  
// in n! in base b Since the result can be large 
// long is used as return type 
static long findDigits(int n, int b) 
{ 
    // factorial of -ve number  
    // doesn't exists 
    if (n < 0) 
        return 0; 
   
    // base case 
    if (n <= 1) 
        return 1; 
    double M_PI = 3.141592; 
    double M_E = 2.7182; 
      
    // Use Kamenetsky formula to calculate 
    // the number of digits 
    double x = ((n * Math.log10(n / M_E) +  
            Math.log10(2 * M_PI * n) / 
                2.0)) / (Math.log10(b)); 
   
    return (long) (Math.floor(x) + 1); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    //calling findDigits(Number, Base) 
    System.out.print(findDigits(4, 16) +"\n"); 
    System.out.print(findDigits(5, 8) +"\n"); 
    System.out.print(findDigits(12, 16) +"\n"); 
    System.out.print(findDigits(19, 13) +"\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

