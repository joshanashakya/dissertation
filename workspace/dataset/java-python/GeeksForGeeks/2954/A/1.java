

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the highest power of 2 
// which divides the given binary number 
static int highestPower(String str, int len) 
{ 
  
    // To store the highest required power of 2 
    int ans = 0; 
  
    // Counting number of consecutive zeros 
    // from the end in the given binary string 
    for (int i = len - 1; i >= 0; i--)  
    { 
        if (str.charAt(i) == '0') 
            ans++; 
        else
            break; 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "100100"; 
    int len = str.length(); 
    System.out.println(highestPower(str, len)); 
} 
} 
  
// This code is contributed by Code_Mech. 

