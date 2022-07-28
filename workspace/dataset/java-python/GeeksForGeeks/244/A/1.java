

// JAVA program to count the differenes  
import java.util.*; 
  
class GFG 
{ 
  
// function to calculate the diffrence 
static Vector<Integer> Diffs(int []a, int k) 
{ 
    Vector<Integer> out = new Vector<Integer>(); 
    int [] inc, dec; 
  
    // initializing inc and dec with 0 and resizing 
    // equal to the size of main array 
    inc = new int[a.length]; 
    dec = new int[a.length]; 
  
    int inc_sum = 0; 
    int dec_sum = 0; 
  
    // iterate through the array 
    for (int i = 0; i < a.length; ++i) 
    { 
  
        // finding number of increasing  
        // subarrays in a window size k 
        for (int j = i - 1; j >= 0 && j > i - k && 
                        a[j + 1] > a[j]; --j) 
        { 
            ++inc[j]; 
            ++inc_sum; 
        } 
  
        // Finding number of decreasing subarrays  
        // in a window size k 
        for (int j = i - 1; j >= 0 && j > i - k &&  
                            a[j + 1] < a[j]; --j) 
        { 
            ++dec[j]; 
            ++dec_sum; 
        } 
  
        // calculate the difference 
        if (i >= k - 1)  
        { 
  
            // if this is not the first window then  
            // calculate inc_sum and dec_sum 
            if (i >= k)  
            { 
                inc_sum -= inc[i - k]; 
                dec_sum -= dec[i - k]; 
            } 
  
            // insert the difference in k size window 
            // in the output vector 
            out.add(inc_sum - dec_sum); 
        } 
    } 
    return out; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int []arr = { 10, 20, 30, 15, 15}; 
    Vector<Integer>out = Diffs(arr, 3); 
    for (int n : out)  
        System.out.print(n + ", "); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

