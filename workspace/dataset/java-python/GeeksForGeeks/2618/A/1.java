

// Java program to maximum possible sum 
class GFG 
{ 
      
// Function to find the maximum possible sum 
static int Maxsum(int c1, int c2, int c3, int c4) 
{ 
    // To store required sum 
    int sum = 0; 
  
    // Number of 234's can be formed 
    int two34 = Math.min(c2,Math.min(c3, c4)); 
  
    // Sum obtained with 234s 
    sum = two34 * 234; 
  
    // Remaining 2's 
    c2 -= two34; 
  
    // Sum obtained with 12s 
    sum +=Math.min(c2, c1) * 12; 
  
    // Return the requied sum 
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int c1 = 5, c2 = 2, c3 = 3, c4 = 4; 
  
    System.out.println(Maxsum(c1, c2, c3, c4)); 
} 
} 
  
// This code is contributed by Code_Mech. 

