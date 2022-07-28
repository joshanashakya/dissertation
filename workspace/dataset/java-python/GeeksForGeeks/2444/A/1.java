

// C# program to find Sum of digits with even  
// number of 1's in their binary representation 
import java.util.*; 
  
class GFG  
{ 
  
// Function to count and check the  
// number of 1's is even or odd 
static int countOne(int n) 
{ 
    int count = 0; 
    while (n > 0)  
    { 
        n = n & (n - 1); 
        count++; 
    } 
  
    if (count % 2 == 0) 
        return 1; 
    else
        return 0; 
} 
  
// Function to calculate the sum  
// of the digits of a number 
static int sumDigits(int n) 
{ 
    int sum = 0; 
    while (n != 0)  
    { 
        sum += n % 10; 
        n /= 10; 
    } 
  
    return sum; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int arr[] = { 4, 9, 15 }; 
      
    int n = arr.length; 
    int total_sum = 0; 
  
    // Iterate through the array 
    for (int i = 0; i < n; i++) 
    { 
        if (countOne(arr[i]) == 1) 
            total_sum += sumDigits(arr[i]); 
    } 
    System.out.println(total_sum); 
} 
} 
  
// This code is contributed by 29AjayKumar 

