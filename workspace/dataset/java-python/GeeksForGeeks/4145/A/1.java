

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the sum 
// of the digits of n 
static int sumDigits(int n) 
{ 
    int sum = 0; 
    while (n > 0)  
    { 
        int digit = n % 10; 
        sum += digit; 
        n /= 10; 
    } 
    return sum; 
} 
  
// Function that return true if the 
// decoded string is divisible by 6 
static boolean isDivBySix(String str, int n) 
{ 
    // To store the sum of the digits 
    int sum = 0; 
  
    // For each character, get the 
    // sum of the digits 
    for (int i = 0; i < n; i++)  
    { 
        sum += (int)(str.charAt(i) - 'a' + 1); 
    } 
  
    // If the sum of digits is 
    // not divisible by 3 
    if (sum % 3 != 0) 
        return false; 
  
    // Get the last digit of 
    // the number formed 
    int lastDigit = ((int)(str.charAt(n - 1) -  
                                    'a' + 1)) % 10; 
  
    // If the last digit is 
    // not divisible by 2 
    if (lastDigit % 2 != 0) 
        return false; 
    return true; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String str = "ab"; 
    int n = str.length(); 
  
    if (isDivBySix(str, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

