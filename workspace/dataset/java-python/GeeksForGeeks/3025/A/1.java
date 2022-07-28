

// A Java program to find the  
// smallest number having at 
// least n digits in factorial 
class GFG 
{ 
// Returns the number of 
// digits present in n! 
static int findDigitsInFactorial(int n) 
{ 
    // factorial of -ve number  
    // doesn't exists 
    if (n < 0) 
        return 0; 
  
    // base case 
    if (n <= 1) 
        return 1; 
  
    // Use Kamenetsky formula to  
    // calculate the number of digits 
    double x = ((n * Math.log10(n / Math.E) +  
                     Math.log10(2 * Math.PI * n) / 2.0)); 
  
    return (int)(Math.floor(x) + 1); 
} 
  
// This function receives an integer  
// n and returns an integer whose  
// factorial has at least n digits 
static int findNum(int n) 
{ 
    // (2*n)! always has 
    // more digits than n 
    int low = 0, hi = 2 * n; 
  
    // n <= 0 
    if (n <= 0) 
        return -1; 
  
    // case for n = 1 
    if (findDigitsInFactorial(low) == n) 
        return low; 
  
    // now use binary search  
    // to find the number 
    while (low <= hi) 
    { 
        int mid = (low + hi) / 2; 
  
        // if (mid-1)! has lesser digits 
        // than n and mid has n or more  
        // then mid is the required number 
        if (findDigitsInFactorial(mid) >= n && 
            findDigitsInFactorial(mid - 1) < n) 
            return mid; 
  
        else if (findDigitsInFactorial(mid) < n) 
            low = mid + 1; 
  
        else
            hi = mid - 1; 
    } 
    return low; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    System.out.println(findNum(1)); 
    System.out.println(findNum(2)); 
    System.out.println(findNum(5)); 
    System.out.println(findNum(24)); 
    System.out.println(findNum(100)); 
    System.out.println(findNum(1221)); 
} 
} 
  
// This Code is Contributed by mits 

