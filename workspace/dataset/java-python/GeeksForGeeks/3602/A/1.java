

// Java implementation of the above 
// approach: 
class GFG 
{ 
      
// Function to check if it is possible  
// to split the array in two parts with 
// equal sum 
static boolean isSpiltPossible(int n,  
                               int a[]) 
{ 
    int sum = 0, c1 = 0; 
  
    // Calculate sum of elements 
    // and count of 1's 
    for (int i = 0; i < n; i++)  
    { 
        sum += a[i]; 
  
        if (a[i] == 1)  
        { 
            c1++; 
        } 
    } 
  
    // If total sum is odd, return False 
    if(sum % 2 != 0) 
        return false; 
  
    // If sum of each part is even, 
    // return True 
    if ((sum / 2) % 2 == 0) 
        return true; 
  
    // If sum of each part is even but 
    // there is atleast one 1 
    if (c1 > 0) 
        return true; 
    else
        return false; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 3; 
    int a[] = { 1, 1, 2 }; 
  
    if (isSpiltPossible(n, a)) 
        System.out.println("YES"); 
    else
        System.out.println("NO"); 
} 
} 
  
// This code is contributed by  
// Code Mech 

