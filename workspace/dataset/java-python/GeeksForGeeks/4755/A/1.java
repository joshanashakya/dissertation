

// Java implementation of the approach  
class GfG  
{ 
      
static long ll;  
  
// Function that returns true if n is a  
// power of 2 i.e. n has only 1 set bit  
static boolean is_power_of_two(long n)  
{  
    //return !(n & (n - 1));  
    return false; 
}  
  
// Function to return the count  
// of all valid sub-arrays  
static int countSubArrays(int arr[], int n)  
{  
  
    // To store the count of valid sub-arrays  
    int cnt = 0;  
  
    for (int j = 0; j < n; j++)  
    {  
        long xorval = 0;  
        for (int k = j; k < n; k++) 
        {  
  
            // num = 2 ^ arr[k]  
            long num = 1 << arr[k];  
            xorval ^= num;  
  
            // If frequency of all the elements of the  
            // sub-array is even or there is only a  
            // single element with odd frequency  
            if (xorval == 0 || is_power_of_two(xorval))  
                cnt++;  
        }  
    }  
  
    // Return the required count  
    return cnt;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
  
    int arr[] = { 1, 2, 3, 1, 2, 3, 4 };  
    int n = arr.length;  
    System.out.println(countSubArrays(arr, n) + "1");  
} 
}  
  
// This code is contributed by Prerna Saini 

