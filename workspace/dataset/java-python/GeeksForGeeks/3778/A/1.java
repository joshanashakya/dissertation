

// Java program to find maximum sum of array  
// after dividing it into three segments 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find maximum sum of array  
// after dividing it into three segments 
static int Max_Sum(int a[], int n) 
{ 
    // To store sum upto ith index 
    int []b = new int[n]; 
    int S = 0; 
    int res = 0; 
      
    // Traverse through the array 
    for (int i = 0; i < n; i++) 
    { 
        b[i] = res; 
        res += a[i]; 
        S += a[i]; 
          
        // Get the maximum possible sum 
        res = Math.max(res, -S); 
    } 
      
    // Store in the reuired answer 
    int ans = S; 
      
    // Maximum sum starting from left segment 
    // by choosing between keeping array element as 
    // it is or subtracting it 
    ans = Math.max(ans, res); 
  
    // Finding maximum sum by decreasing a[i] and  
    // adding b[i] to it that means max(multiplying  
    // it by -1 or using b[i] value) 
    int g = 0; 
      
    // For third segment 
    for (int i = n - 1; i >= 0; --i)  
    { 
        g -= a[i]; 
        ans = Math.max(ans, g + b[i]); 
    } 
      
    // return the required answer 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { -6, 10, -3, 10, -2 }; 
  
    int n = a.length; 
      
    // Function call 
    System.out.println("Maximum sum is: " +  
                            Max_Sum(a, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

