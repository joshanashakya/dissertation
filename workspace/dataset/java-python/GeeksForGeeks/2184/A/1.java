

// Java implementation of the approach  
class GFG 
{ 
  
// Function to return the  
// sum of digits of x  
static int sumOfDigits(int x)  
{  
    int sum = 0;  
    while (x != 0)  
    {  
        sum += x % 10;  
        x = x / 10;  
    }  
    return sum;  
}  
  
// Function to return the count  
// of required numbers  
static int countNumbers(int l, int r)  
{  
    int count = 0;  
    for (int i = l; i <= r; i++) 
    {  
  
        // If i is divisible by 2 and  
        // sum of digits of i is divisible by 3  
        if (i % 2 == 0 && sumOfDigits(i) % 3 == 0)  
            count++;  
    }  
  
    // Return the required count  
    return count;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int l = 1000, r = 6000;  
    System.out.println(countNumbers(l, r));  
}  
} 
  
// This code is contributed by Arnab Kundu 

