

// Java program to convert n into  
// negative base form 
class GFG 
{ 
  
// Method to convert n to base negBase 
static String toNegativeBase(int n, int negBase) 
{ 
    // If n is zero then in any base 
    // it will be 0 only 
    if (n == 0) 
        return "0"; 
  
    String converted = ""; 
    while (n != 0) 
    { 
        // Get remainder by negative base,  
        // it can be negative also 
        int remainder = n % negBase; 
        n /= negBase; 
  
        // if remainder is negative,  
        // add Math.abs(base) to it  
        // and add 1 to n 
        if (remainder < 0) 
        { 
            remainder += (-negBase); 
            n += 1; 
        } 
  
        // convert remainder to String add into the result 
        converted = String.valueOf(remainder) + converted; 
    } 
    return converted; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 13; 
    int negBase = -2; 
  
    System.out.print(toNegativeBase(n, negBase)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

