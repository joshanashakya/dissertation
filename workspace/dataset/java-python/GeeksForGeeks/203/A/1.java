

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the 
// winner of the game 
static String getWinner(String str, int len) 
{ 
  
    // To store the count of silver coins 
    int total = 0; 
    for (int i = 0; i < len; i++)  
    { 
  
        // Update the position of 
        // the gold coin 
        if (str.charAt(i) == 'S') 
        { 
            total++; 
        } 
    } 
  
    // First player will win the game 
    if ((total % 2) == 1) 
        return "First"; 
    return "Second"; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String str = "GSSS"; 
    int len = str.length(); 
  
    System.out.println(getWinner(str, len)); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

