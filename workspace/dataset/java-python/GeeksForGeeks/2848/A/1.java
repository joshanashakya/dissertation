

// JAVA implementation to Find Quotient 
// and Remainder of two integer without 
// using / and % operator using Binary search 
  
class GFG{ 
   
// Function to the quotient and remainder 
static int[] find(int dividend, int divisor, 
                    int start, int end) 
{ 
   
    // Check if start is greater than the end 
    if (start > end) 
        return new int[] { 0, dividend }; 
   
    // Calculate mid 
    int mid = start + (end - start) / 2; 
   
    int n = dividend - divisor * mid; 
   
    // Check if n is greater than divisor 
    // then increment the mid by 1 
    if (n > divisor) 
        start = mid + 1; 
   
    // Check if n is less than 0 
    // then decrement the mid by 1 
    else if (n < 0) 
        end = mid - 1; 
   
    else { 
        // Check if n equals to divisor 
        if (n == divisor) { 
            ++mid; 
            n = 0; 
        } 
   
        // Return the final answer 
        return new int[] { mid, n }; 
    } 
   
    // Recursive calls 
    return find(dividend, divisor, start, end); 
} 
   
static int[]  divide(int dividend, int divisor) 
{ 
    return find(dividend, divisor, 1, dividend); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int dividend = 10, divisor = 3; 
    
    int []ans = divide(dividend, divisor); 
   
    System.out.print(ans[0]+ ", "); 
    System.out.print(ans[1] +"\n"); 
   
} 
} 
  
// This code contributed by sapnasingh4991 

