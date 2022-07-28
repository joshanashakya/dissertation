

// Java implementation of the approach 
class GFG 
{ 
  
// Finds the sub-array with maximum length 
static int FindSubarray(int arr[], int n, int k) 
{ 
    // Array which stores number of ones 
    // present in the binary representation 
    // of ith element of the array 
    int []count_one = new int[n]; 
  
    for (int i = 0; i < n; i++) 
    { 
        count_one[i] = Integer.bitCount(arr[i]); 
    } 
  
    // Sum variable to store sum of 
    // number of ones 
    // Initialize it as number of ones 
    // present in the binary representation 
    // of 0th element of the array 
    int sum = count_one[0]; 
  
    // If there is only a single element 
    if (n == 1)  
    { 
        if (count_one[0] >= k) 
            return 1; 
        else
            return -1; 
    } 
  
    // Stores the minimum length 
    // of the required sub-array 
    int ans = Integer.MAX_VALUE; 
  
    int i = 1; 
    int j = 0; 
  
    while (i < n)  
    { 
        // If binary representation of jth 
        // element of array has 1's equal to k 
        if (k == count_one[j])  
        { 
            ans = 1; 
            break; 
        } 
  
        // If binary representation of ith 
        // element of array has 1's equal to k 
        else if (k == count_one[i])  
        { 
            ans = 1; 
            break; 
        } 
  
        // If sum of number of 1's of 
        // binary representation of elements upto 
        // ith element is less than k 
        else if (sum + count_one[i] < k) 
        { 
            sum += count_one[i]; 
            i++; 
        } 
  
        // If sum of number of 1's of 
        // binary representation of elements upto 
        // ith element is greater than k 
        else if (sum + count_one[i] > k)  
        { 
            ans = Math.min(ans, (i - j) + 1); 
            sum -= count_one[j]; 
            j++; 
        } 
  
        else if (sum + count_one[i] == k)  
        { 
            ans = Math.min(ans, (i - j) + 1); 
            sum += count_one[i]; 
            i++; 
        } 
    } 
  
    if (ans != Integer.MAX_VALUE) 
        return ans; 
  
    else
        return -1; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, 4, 8 }; 
    int n = arr.length; 
    int k = 2; 
  
    System.out.println(FindSubarray(arr, n, k)); 
} 
} 
  
// This code is contributed by Princi Singh 

