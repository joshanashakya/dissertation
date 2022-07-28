

// java  implementation of the approach 
import java.io.*; 
  
class GFG { 
     
  
// Function to return the count of digits of a number 
static int countDigits(int n) 
{ 
    int count = 0; 
  
    while (n > 0) { 
        count += 1; 
        n /= 10; 
    } 
  
    return count; 
} 
  
// Function to return a number that contains only 
// digit 'd' repeated exactly count times 
static int getDistinct(int d, int count) 
{ 
    int num = 0; 
    count = (int)Math.pow(10, count - 1); 
    while (count > 0) { 
        num += (count * d); 
        count /= 10; 
    } 
  
    return num; 
} 
  
// Function to return the count of integers that 
// are composed of a single distinct digit only 
static int findCount(int L, int R) 
{ 
    int count = 0; 
  
    // Count of digits in L and R 
    int countDigitsL = countDigits(L); 
    int countDigitsR = countDigits(R); 
  
    // First digits of L and R 
    int firstDigitL = (L /(int)Math. pow(10, countDigitsL - 1)); 
    int firstDigitR = (R / (int)Math.pow(10, countDigitsR - 1)); 
  
    // If L has lesser number of digits than R 
    if (countDigitsL < countDigitsR) { 
  
        count += (9 * (countDigitsR - countDigitsL - 1)); 
  
        // If the number that starts with firstDigitL and has 
        // number of digits = countDigitsL is within the range 
        // include the number 
        if (getDistinct(firstDigitL, countDigitsL) >= L) 
            count += (9 - firstDigitL + 1); 
  
        // Exclude the number 
        else
            count += (9 - firstDigitL); 
  
        // If the number that starts with firstDigitR and has 
        // number of digits = countDigitsR is within the range 
        // include the number 
        if (getDistinct(firstDigitR, countDigitsR) <= R) 
            count += firstDigitR; 
  
        // Exclude the number 
        else
            count += (firstDigitR - 1); 
    } 
  
    // If both L and R have equal number of digits 
    else { 
  
        // Include the number greater than L upto 
        // the maximum number whose digit = coutDigitsL 
        if (getDistinct(firstDigitL, countDigitsL) >= L) 
            count += (9 - firstDigitL + 1); 
        else
            count += (9 - firstDigitL); 
  
        // Exclude the numbers which are greater than R 
        if (getDistinct(firstDigitR, countDigitsR) <= R) 
            count -= (9 - firstDigitR); 
        else
            count -= (9 - firstDigitR + 1); 
    } 
  
    // Return the count 
    return count; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
        int L = 10, R = 50; 
  
    System.out.println( findCount(L, R)); 
    } 
} 
// This code is contributed by inder_verma. 

