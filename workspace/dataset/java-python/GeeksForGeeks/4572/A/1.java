

// Java program to find number from 
// given list for which value of the 
// function is closest to A 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find number from 
// given list for which value of the 
// function is closest to A 
static int leastValue(int P, int A,  
                      int N, int a[]) 
{ 
  
    // Stores the final index 
    int ans = -1; 
  
    // Declaring a variable to store 
    // the minimum absolute difference 
    float tmp = Float.MAX_VALUE; 
  
    for (int i = 0; i < N; i++) 
    { 
  
        // Finding F(n) 
        float t = (float) (P - a[i] * 0.006); 
  
        // Updating the index of the answer if 
        // new absolute difference is less than tmp 
        if (Math.abs(t-A) < tmp) 
        { 
            tmp = Math.abs(t - A); 
            ans = i; 
        } 
    } 
    return a[ans]; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 2, P = 12, A = 2005; 
    int a[] = {1000, 2000}; 
  
    System.out.println(leastValue(P, A, N, a)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

