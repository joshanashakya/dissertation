

// Java implementation find the minimum 
// difference in the number D such that 
// D is inside of every range 
import java.util.*;  
  
class GFG 
{ 
  
// Function to find the minimum 
// difference in the number D such that 
// D is inside of every range 
static void findMinimumOperation(int n, int d, 
                    int arrays[][]){ 
    int cnt = 0; 
    int first = Integer.MIN_VALUE, end = Integer.MAX_VALUE; 
  
    // Loop to find the common range out  
    // of the given array of ranges. 
    while (n > 0) { 
          
        // Storing the start and end index 
        int arr[] = { arrays[cnt][0], 
                        arrays[cnt][1] }; 
  
        // Sorting the range 
        Arrays.sort(arr); 
  
        // Finding the maximum starting  
        // value of common segment 
        first = Math.max(first, arr[0]); 
  
        // Finding the minimum ending  
        // value of common segment 
        end = Math.min(end, arr[1]); 
        cnt++; 
        n--; 
    } 
  
    // If there is no common segment 
    if (first > end) 
        System.out.print("-1"); 
  
    else { 
          
        // If the given number is between 
        // the computed common range. 
        if (d >= first && d <= end) { 
            System.out.print("0"); 
        } 
  
        // Finding the minimum distance 
        else
            System.out.print(Math.min(Math.abs(first - d), 
                        Math.abs(d - end))); 
    } 
} 
  
// Driver Code 
public static void main (String []args) 
{ 
    int n = 3, d = 3; 
  
    // Given array of ranges 
    int arrays[][] = { 
        { 0, 7 }, 
        { 2, 14 }, 
        { 4, 6 } 
    }; 
    findMinimumOperation(n, d, arrays); 
} 
} 
  
// This code is contributed by chitranayal 

