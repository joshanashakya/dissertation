

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
/* arr[] to store all the distinct elements 
    index - next location in array  
    num - given number  
    reducedNum - reduced number */
static void findCombinationsUtil(int arr[], int index, 
                        int n, int red_num) 
{ 
  
    // Set to store all the 
    // distinct elements 
    HashSet<Integer> s = new HashSet<>(); 
    int sum = 0; 
  
    // Base condition 
    if (red_num < 0)  
    { 
        return; 
    } 
  
    if (red_num == 0)  
    { 
  
        // Iterate over all the elements 
        // and store it into the set 
        for (int i = 0; i < index; i++) 
        { 
            s.add(arr[i]); 
        } 
  
        // Calculate the sum of all 
        // the elements of the set 
        for (Integer itr : s) 
        { 
  
            sum = sum + itr; 
        } 
  
        // Compare whether the sum is equal to n or not, 
        // if it is equal to n print the numbers 
        if (sum == n)  
        { 
            for (Integer i : s)  
            { 
                System.out.print(i+" "); 
            } 
            System.out.println(); 
            return; 
        } 
    } 
  
    // Find previous number stored in the array 
    int prev = (index == 0) ? 1 : arr[index - 1]; 
  
    for (int k = prev; k <= n; k++)  
    { 
  
        // Store all the numbers recursively 
        // into the arr[] 
        if(index < n) 
        { 
            arr[index] = k; 
            findCombinationsUtil(arr, index + 1, 
                            n, red_num - k); 
              
        } 
    } 
} 
  
// Function to find all the 
// distinct combinations of n 
static void findCombinations(int n) 
{ 
    int []a = new int[n]; 
    findCombinationsUtil(a, 0, n, n); 
} 
  
// Driver code 
public static void main(String arr[])  
{ 
    int n = 7; 
    findCombinations(n); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

