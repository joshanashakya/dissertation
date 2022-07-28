

// Java implementation of the above approach  
import java.util.*; 
  
class GFG 
{ 
      
// Function to calculate the value of the  
static ArrayList<Integer> findingValues(int m, int n,  
                                int mth, int nth)  
{  
      
    // Calculate value of d using formula  
    int d = (Math.abs(mth - nth)) /  
        Math.abs((m - 1) - (n - 1));  
  
    // Calculate value of a using formula  
    int a = mth - ((m - 1) * d); 
    ArrayList<Integer> res=new ArrayList<Integer>(); 
    res.add(a); 
    res.add(d); 
  
    // Return pair  
    return res;  
}  
  
// Function to calculate value sum  
// of first p numbers of the series  
static int findSum(int m, int n, int mth, 
                            int nth, int p)  
{  
    // First calculate value of a and d  
    ArrayList<Integer> ad = findingValues(m, n, mth, nth);  
  
    int a = ad.get(0); 
    int d = ad.get(1); 
  
    // Calculate the sum by using formula  
    int sum = (p * (2 * a + (p - 1) * d)) / 2;  
  
    // Return the sum  
    return sum;  
}  
  
// Driver Code 
public static void main (String[] args)  
{ 
    int m = 6, n = 10, mTerm = 12, nTerm = 20, p = 5;  
    System.out.println(findSum(m, n, mTerm, nTerm, p)); 
} 
} 
  
// This code is contributed by chandan_jnu 

