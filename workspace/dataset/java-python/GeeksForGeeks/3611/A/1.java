

// Java implementation of the approach 
class GFG  
{ 
static int MAX = 1000; 
  
// Function that returns true if 
// the required line exists 
static boolean lineExists(int x[], int y[], 
                          int v[], int n) 
{ 
  
    // To handle negative values from x[] 
    int size = (2 * MAX) + 1; 
    long []arr = new long[size]; 
  
    // Update arr[] such that arr[i] contains 
    // the sum of all v[j] such that x[j] = i 
    // for all valid values of j 
    for (int i = 0; i < n; i++)  
    { 
        arr[x[i] + MAX] += v[i]; 
    } 
  
    // Update arr[i] such that arr[i] contains 
    // the sum of the subarray arr[0...i] 
    // from the original array 
    for (int i = 1; i < size; i++) 
        arr[i] += arr[i - 1]; 
  
    // If all the points add to 0 then 
    // the line can be drawn anywhere 
    if (arr[size - 1] == 0) 
        return true; 
  
    // If the line is drawn touching the 
    // leftmost possible points 
    if (arr[size - 1] - arr[0] == 0) 
        return true; 
  
    for (int i = 1; i < size - 1; i++)  
    { 
  
        // If the line is drawn just before 
        // the current point 
        if (arr[i - 1] == arr[size - 1] - arr[i - 1]) 
            return true; 
  
        // If the line is drawn touching 
        // the current point 
        if (arr[i - 1] == arr[size - 1] - arr[i]) 
            return true; 
  
        // If the line is drawn just after 
        // the current point 
        if (arr[i] == arr[size - 1] - arr[i]) 
            return true; 
    } 
  
    // If the line is drawn touching the 
    // rightmost possible points 
    if (arr[size - 2] == 0) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int x[] = { -3, 5, 8 }; 
    int y[] = { 8, 7, 9 }; 
    int v[] = { 8, 2, 10 }; 
    int n = x.length; 
  
    if (lineExists(x, y, v, n)) 
        System.out.printf("Yes"); 
    else
        System.out.printf("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

