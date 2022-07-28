

// Java program to print the length of the  
// longest subarray such that adjacent elements  
// of the subarray have at least one digit in  
// common  
class GFG 
{ 
  
// Function to print the longest subarray  
// such that adjacent elements have at least  
// one digit in common  
static int longestSubarray(int arr[], int n)  
{  
    int i, d;  
  
    // To mark presence of digit in current  
    // element.  
    int hash[][] = new int[2][10];  
      
    for( i = 0; i < 2; i++) 
        for(int j = 0; j < 10; j++) 
            hash[i][j] = 0; 
  
    // To store current row.  
    int currRow;  
  
    // To store maximum length subarray length.  
    int maxLen = 1;  
  
    // To store current subarray length.  
    int len = 0;  
  
    // To store current array element.  
    int tmp;  
  
    // Mark the presence of digits of first element.  
    tmp = arr[0];  
    while (tmp > 0)  
    {  
        hash[0][tmp % 10] = 1;  
        tmp /= 10;  
    }  
  
    currRow = 1;  
  
    // Find digits of each element and check if adjacent  
    // elements have common digit and update len.  
    for (i = 1; i < n; i++)  
    {  
        tmp = arr[i];  
  
        for (d = 0; d <= 9; d++)  
            hash[currRow][d] = 0;  
  
        // Find all digits in element.  
        while (tmp > 0)  
        {  
            hash[currRow][tmp % 10] = 1;  
            tmp /= 10;  
        }  
  
        // Find common digit in adjacent element.  
        for (d = 0; d <= 9; d++)  
        {  
            if (hash[currRow][d] != 0 && hash[1 - currRow][d] != 0)  
            {  
                len++;  
                break;  
            }  
        }  
  
        // If no common digit is found a new subarray  
        // has to start from current element.  
        if (d == 10) 
        {  
            len = 1;  
        }  
  
        maxLen = Math.max(maxLen, len);  
  
        currRow = 1 - currRow;  
    }  
  
    return maxLen;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    int arr[] = { 11, 22, 33, 44, 54, 56, 63 };  
    int n = arr.length;  
  
    System.out.println( longestSubarray(arr, n));  
}  
} 
  
// This code is contributed by Arnab Kundu 

