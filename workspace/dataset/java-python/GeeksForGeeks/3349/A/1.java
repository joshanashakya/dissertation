

// Java program to calculate steps 
// to remove substring 010 
// from a binary string 
import java.util.*; 
  
class GFG{ 
  
// Function to find the minimum steps 
static int minSteps(String str) 
{ 
  
    int count = 0; 
  
    for (int i = 0; i < str.length() - 2; i++) { 
  
        if (((int)str.charAt(i)) == '0') { 
            if (str.charAt(i + 1) == '1') { 
                if (str.charAt(i + 2) == '0') { 
  
                    // substring "010" found 
                    count++; 
                    i += 2; 
                } 
            } 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    // Get the binary string 
    String str = "0101010"; 
  
    // Find the minimum steps 
    System.out.println(minSteps(str)); 
} 
} 

