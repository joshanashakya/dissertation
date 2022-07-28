

// Java implementation of the  
// above approach 
import java.util.*; 
  
class GFG 
{ 
// function to calculate minimum glasses 
public static double Min_glass(int n, int k,  
                            int[] a) 
{ 
    // sort the array based on 
    // their capacity 
  
    int sum = 0; 
  
    // taking sum of capacity 
    // of first k glasses 
    for (int i = 0; i < k; i++) 
        sum += a[i]; 
  
    // calculate the answer 
    double ans = Math.ceil((double)sum / 
                            (double)100); 
  
    return ans; 
} 
  
// Driver code  
public static void main(String[] args) 
{ 
    int n = 4; 
    int k = 3; 
    int[] a = { 200, 150, 140, 300 }; 
    Arrays.sort(a); 
    System.out.println(Min_glass(n, k, a)); 
} 
} 
  
// This code is contributed by mits 

