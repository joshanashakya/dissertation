

// Java implementation of above approach 
class GFG 
{ 
  
// Function to return sum 
static int sum(int k, int n) 
{ 
    int sum = (int)(Math.pow(k, n + 1) -  
                    Math.pow(k - 1, n + 1)); 
  
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 3; 
    int K = 3; 
    System.out.print(sum(K, n)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

