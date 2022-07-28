

// Java implementation of the approach  
class GfG  
{  
  
// Function to return the sum  
// of digits of n  
static int sumOfDigits(int n)  
{  
    int sum = 0;  
  
    while (n != 0)  
    {  
  
        // Add the last digit  
        // to the sum  
        sum = sum + n % 10;  
  
        // Remove the last digit  
        n = n / 10;  
    }  
  
    // Return the sum of the digits  
    return sum;  
}  
  
// Function to return the count of numbers  
// from the range [l, r] whose digit sum  
// is equal to y  
static int countTheNumbers(int l, int r, int y)  
{  
    // Initialise the count to zero  
    int count = 0;  
  
    // Loop for each number from the range  
    for (int i = l; i <= r; i++)  
    {  
  
        // If digit sum = y  
        if (sumOfDigits(i) == y)  
            count++;  
    }  
  
    // Return the required count  
    return count;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int l = 0, r = 10, y = 1;  
    System.out.println(countTheNumbers(l, r, y));  
} 
}  
  
// This code is contributed by Prerna Saini 

