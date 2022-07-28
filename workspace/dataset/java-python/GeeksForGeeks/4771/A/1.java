

// Java program to find lower_bound of x in 
// prefix sums array using binary lifting. 
import java.util.*; 
  
class solution 
{ 
  
// function to make prefix sums array 
static void MakePreSum(int []arr, int []presum, int n) 
{ 
    presum[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
        presum[i] = presum[i - 1] + arr[i]; 
} 
  
// function to find lower_bound of x in 
// prefix sums array using binary lifting. 
static int BinaryLifting(int []presum, int n, int x) 
{ 
    // intisalize position 
    int pos = 0; 
  
    // find log to the base 2 value of n. 
    int LOGN = (int)Math.log(n); 
  
    // if x less than first number. 
    if (x <= presum[0]) 
        return 0; 
  
    // starting from most significant bit. 
    for (int i = LOGN; i >= 0; i--) { 
  
        // if value at this position less 
        // than x then updateposition 
        // Here (1<<i) is similar to 2^i. 
        if (pos + (1 << i) < n &&  
            presum[pos + (1 << i)] < x) { 
            pos += (1 << i); 
        } 
    } 
  
    // +1 because 'pos' will have position 
    // of largest value less than 'x' 
    return pos + 1; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    // given array 
    int []arr = { 2, 5, 7, 1, 6, 9, 12, 4, 6 }; 
  
    // value to find 
    int x = 8; 
  
    // size of array 
    int n = arr.length; 
  
    // to store prefix sum 
    int []presum = new int[n]; 
    Arrays.fill(presum,0); 
  
    // call for prefix sum 
    MakePreSum(arr, presum, n); 
  
    // fucntion call 
    System.out.println(BinaryLifting(presum, n, x)); 
  
} 
  
} 

