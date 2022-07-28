

// Java implementation of the approach 
class GfG 
{ 
      
// Function that returns true 
// if the game cannot be won 
static boolean isDefeat(String s1, String s2, int n) 
{ 
    for (int i = 0; i < n; i++) 
    { 
        if ((s1.charAt(i) == '0' && s2.charAt(i) == '1') 
            || (s1.charAt(i) == '1' && s2.charAt(i) == '0')) 
            continue; 
        else if ((s1.charAt(i) == '0' && s2.charAt(i) == 'Z') 
                || (s1.charAt(i) == 'Z' && s2.charAt(i) == '0')) 
            continue; 
        else 
        { 
            return true; 
        } 
    } 
    return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String s1 = ("01001101ZZ" ); 
    String s2 = ("10Z1001000" ); 
  
    // Common length 
    int n = 10; 
  
    if (isDefeat(s1, s2, n)) 
        System.out.println("Defeat"); 
    else
        System.out.println("Victory"); 
  
} 
} 
  
// This code is contributed by Code_Mech 

