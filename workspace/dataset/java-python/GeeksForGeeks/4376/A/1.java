

// Java program to find the remaining balance 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the balance 
static void findBalance(int x, float bal) 
{ 
  
    // Check if the transaction 
    // can be successful or not 
    if (x % 10 == 0 && ((float)x + 1.50) <= bal)  
    { 
  
        // Transaction is successful 
        System.out.printf("%.2f\n", bal - x - 1.50); 
    } 
    else 
    { 
  
        // Transaction is unsuccessful 
        System.out.printf("%.2f\n", bal); 
    } 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int x = 50; 
    float bal = (float) 100.50; 
  
    findBalance(x, bal); 
} 
} 
  
// This code is contributed by Princi Singh 

