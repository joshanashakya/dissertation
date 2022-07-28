

import java.util.*; 
  
class GFG{ 
  
// Function to check if original Array 
// can be retained by performing XOR 
// with M exactly K times 
static String check(int []Arr, int n, 
            int M, int K) 
{ 
    int flag = 0; 
  
    // Check if O is present or not 
    for (int i = 0; i < n; i++) { 
        if (Arr[i] == 0) 
            flag = 1; 
    } 
  
    // If K is odd and 0 is not present 
    // then the answer will always be No. 
    if (K % 2 != 0
        && flag == 0) 
        return "No"; 
  
    // Else it will be Yes 
    else
        return "Yes"; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
  
    int []Arr = { 1, 1, 2, 4, 7, 8 }; 
    int M = 5; 
    int K = 6; 
    int n = Arr.length; 
  
    System.out.println(check(Arr, n, M, K)); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

