

// Java implementation of the approach  
class GfG  
{  
  
// Function to return the count of  
// valid values of X  
static int getCount(int a, int b, int c)  
{  
    int count = 0;  
  
    // Iterate through all possible  
    // sum of digits of X  
    for (int i = 1; i <= 81; i++)  
    {  
  
        // Get current value of X for sum of digits i  
        int cr = b * (int)Math.pow(i, a) + c;  
  
        int tmp = cr;  
        int sm = 0;  
  
        // Find sum of digits of cr  
        while (tmp != 0)  
        {  
            sm += tmp % 10;  
            tmp /= 10;  
        }  
  
        // If cr is a valid choice for X  
        if (sm == i && cr < 1e9)  
            count++;  
    }  
  
    // Return the count  
    return count;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int a = 3, b = 2, c = 8;  
    System.out.println(getCount(a, b, c));  
} 
}  
  
// This code is contributed by Prerna Saini. 

