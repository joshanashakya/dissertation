

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function that checks if the given  
// conditions are satisfied  
static void IfExists(int arr[], int n)  
{  
    // To store the prefix sum  
    // of the array elements  
    int sum[] = new int[n];  
  
    // Sort the array  
    Arrays.sort(arr);  
  
    sum[0] = arr[0];  
  
    // Compute the prefix sum array  
    for (int i = 1; i < n; i++)  
        sum[i] = sum[i - 1] + arr[i];  
  
    // Maximum element in the array  
    int max = arr[n - 1];  
  
    // Variable to check if there exists any number  
    boolean flag = false;  
  
    for (int i = 1; i <= max; i++)  
    {  
  
        // Stores the index of the largest  
        // number present in the array  
        // smaller than i  
        int findex = 0;  
  
        // Stores the index of the smallest  
        // number present in the array  
        // greater than i  
        int lindex = 0;  
  
        int l = 0;  
        int r = n - 1;  
  
        // Find index of smallest number  
        // greater than i  
        while (l <= r)  
        {  
            int m = (l + r) / 2;  
  
            if (arr[m] < i)  
            {  
                findex = m;  
                l = m + 1;  
            }  
            else
                r = m - 1;  
        }  
  
        l = 1;  
        r = n;  
        flag = false;  
  
        // Find index of smallest number  
        // greater than i  
        while (l <= r)  
        {  
            int m = (r + l) / 2;  
  
            if (arr[m] > i)  
            {  
                lindex = m;  
                r = m - 1;  
            }  
            else
                l = m + 1;  
        }  
  
        // If there exists a number  
        if (sum[findex] == sum[n - 1] - sum[lindex - 1])  
        {  
            flag = true;  
            break;  
        }  
    }  
  
    // If no such number exists  
    // print no  
    if (flag)  
        System.out.println("Yes");  
    else
        System.out.println("No");  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int arr[] = { 1, 2, 2, 5 };  
    int n = arr.length;  
    IfExists(arr, n);  
} 
}  
  
// This code is contributed by Arnab Kundu 

