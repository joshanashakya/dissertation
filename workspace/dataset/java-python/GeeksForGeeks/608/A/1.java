

// Java implementation of above approach 
public class GFG  
{ 
      
// Function to find the B start to C 
static int Race(int B, int C) 
{ 
    int result = 0; 
  
    // When B completed it's 100 meter 
    // then Completed meters by C is 
    result = ((C * 100) / B); 
  
    return 100 - result; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int B = 10; 
    int C = 28; 
      
    // When A completed it's 100 meter 
    // Then completed meters of B and C is 
    B = 100 - B; 
    C = 100 - C; 
      
    System.out.println(Race(B, C) + " meters"); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

