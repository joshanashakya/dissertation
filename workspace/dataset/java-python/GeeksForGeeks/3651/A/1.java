

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to check if it is possible 
// to place C magnets assuming mid as 
// maximum possible distance 
static boolean isPossible(int []arr, int n,  
                        int C, int mid) 
{ 
    // Variable magnet will store count of magnets 
    // that got placed and currPosition will store 
    // the position of last placed magnet 
    int magnet = 1, currPosition = arr[0]; 
  
    for (int i = 1; i < n; i++)  
    { 
  
        // If difference between current index and 
        // last placed index is greater than or equal to mid 
        // it will allow placing magnet to this index 
        if (arr[i] - currPosition >= mid) 
        { 
  
            magnet++; 
  
            // Now this index will become 
            // last placed index 
            currPosition = arr[i]; 
  
            // If count of magnets placed becomes C 
            if (magnet == C) 
                return true; 
        } 
    } 
  
    // If count of placed magnet is 
    // less than C then return false 
    return false; 
} 
  
// Function for modified binary search 
static int binarySearch(int n, int C, int []arr) 
{ 
    int lo, hi, mid, ans; 
  
    // Sort the indices in ascending order 
    Arrays.sort(arr); 
  
    // Minimum possible distance 
    lo = 0; 
  
    // Maximum possible distance 
    hi = arr[n - 1]; 
  
    ans = 0; 
  
    // Run the loop until lo becomes 
    // greater than hi 
    while (lo <= hi)  
    { 
  
        mid = (lo + hi) / 2; 
  
        // If not possibble, decrease value of hi 
        if (!isPossible(arr, n, C, mid)) 
            hi = mid - 1; 
        else
        { 
  
            // Update the answer 
            ans = Math.max(ans, mid); 
            lo = mid + 1; 
        } 
    } 
  
    // Return maximum possible distance 
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int C = 4; 
    int []arr = { 1, 2, 5, 8, 10, 18 }; 
    int n = arr.length; 
    System.out.println(binarySearch(n, C, arr)); 
} 
} 
  
// This code is contributed by Akanksha Rai 

