

// Below is Java approach of finding total k bit  
// difference pairs  
import java.util.*; 
  
class GFG  
{ 
  
// Function to calculate K bit  
// different pairs in array  
static long kBitDifferencePairs(int arr[], 
                                int n, int k)  
{  
    // Get the maximum value among all array elemensts  
    int MAX = Arrays.stream(arr).max().getAsInt();  
  
    // Set the count array to 0,  
    // count[] stores the total  
    // frequency of array elements  
    long []count = new long[MAX + 1];  
    Arrays.fill(count, 0); 
  
    for (int i = 0; i < n; ++i)  
        ++count[arr[i]];  
  
    // Initialize result  
    long ans = 0;  
  
    // For 0 bit answer will be total 
    // count of same number  
    if (k == 0)  
    {  
        for (int i = 0; i <= MAX; ++i)  
            ans += (count[i] * (count[i] - 1)) / 2;  
  
        return ans;  
    }  
  
    for (int i = 0; i <= MAX; ++i)  
    {  
        // if count[i] is 0, skip the next loop  
        // as it will not contribute the answer  
        if (count[i] == 0)  
        continue;  
  
        for (int j = i + 1; j <= MAX; ++j)  
        {  
            // Update answer if k differ bit found  
            if ( Integer.bitCount(i ^ j) == k)  
                ans += count[i] * count[j];  
        }  
    }  
    return ans;  
}  
  
// Driver code  
public static void main(String[] args) 
{ 
    int k = 2;  
    int arr[] = {2, 4, 1, 3, 1};  
    int n = arr.length;  
  
    System.out.println("Total pairs for k = " +  
                                k + " are = " +  
                        kBitDifferencePairs(arr, n, k));  
  
    k = 3;  
    System.out.println("Total pairs for k = " + 
                                k + " are = " +  
                        kBitDifferencePairs(arr, n, k));  
    } 
}  
  
// This code is contributed by Rajput-Ji 

