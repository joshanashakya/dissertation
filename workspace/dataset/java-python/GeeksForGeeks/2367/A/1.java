

// Java implementation of above approach. 
class GFG  
{ 
  
// Function that will 
// find loss 
static void Loss(int SP, int P) 
{ 
  
    float loss = 0; 
  
    loss = (float)(2 * P * P * SP) / (100 * 100 - P * P); 
  
    System.out.println("Loss = " + loss); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int SP = 2400, P = 30; 
  
    // Calling Function 
    Loss(SP, P); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

