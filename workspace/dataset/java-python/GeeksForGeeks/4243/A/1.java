

// Java program to find triplets count 
class GFG  
{ 
      
// Function to find triplets count 
static int triplets(int N) 
{ 
    // Sum of first n+1 natural numbers 
    return ((N + 1) * (N + 2)) / 2; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 50; 
  
    System.out.println(triplets(N)); 
} 
} 
  
// This code is contributed  
// by PrinciRaj1992  

