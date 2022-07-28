

// Java program to find OR of 
// all the sub-arrays  
class GFG  
{ 
      
// function to return OR  
// of sub-arrays  
static int OR(int a[],int n) 
{ 
    int ans = a[0]; 
    int i; 
    for(i = 1; i < n; i++) 
    { 
        ans |= a[i]; 
    } 
    return ans; 
} 
  
// Driver Code  
public static void main(String args[]) 
{ 
    int a[] = { 1, 4, 6}; 
      
    int n = a.length; 
      
    // print OR of all subarrays  
    System.out.println(OR(a, n)); 
} 
} 
  
// This code is contributed  
// by ANKITRAI1 

