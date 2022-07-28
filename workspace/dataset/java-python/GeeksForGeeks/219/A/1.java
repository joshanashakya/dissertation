

// Java program to find minimum number which divide n 
// to make it a perfect cube 
class GFG{ 
   
// Returns the minimum divisor 
static int findMinNumber(int n) 
{ 
    int count = 0, ans = 1; 
   
    // Since 2 is only even prime, compute its 
    // power seprately. 
    while (n % 2 == 0) { 
        count++; 
        n /= 2; 
    } 
   
    // If count is not divisible by 3,  
    // it must be removed by dividing 
    // n by prime number power. 
    if (count % 3 != 0) 
        ans *= Math.pow(2, (count % 3)); 
   
    for (int i = 3; i <= Math.sqrt(n); i += 2) { 
        count = 0; 
        while (n % i == 0) { 
            count++; 
            n /= i; 
        } 
   
        // If count is not divisible by 3,  
        // it must be removed by dividing 
        // n by prime number power. 
        if (count % 3 != 0) 
            ans *= Math.pow(i, (count % 3)); 
    } 
   
    // if n is a prime number 
    if (n > 2) 
        ans *= n; 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int n = 128; 
    System.out.print(findMinNumber(n) +"\n"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

