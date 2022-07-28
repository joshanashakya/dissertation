

// Java implementation of the approach 
  
class GFG 
{ 
// Function to return max possible  
// operation of the given type that  
// can be performed on str  
static int maxOperations(String str)  
{  
    int i, g, gk, gks;  
    i = g = gk = gks = 0;  
    for (i = 0; i < str.length(); i++)  
    {  
        if (str.charAt(i) == 'g') 
        {  
  
            // Increment count of sub-sequence 'g'  
            g++;  
        }  
        else if (str.charAt(i) == 'k')  
        {  
  
            // Increment count of sub-sequence 'gk'  
            // if 'g' is available  
            if (g > 0) {  
                g--;  
                gk++;  
            }  
        }  
        else if (str.charAt(i) == 's') 
        {  
  
            // Increment count of sub-sequence 'gks'  
            // if sub-sequence 'gk' appeared previously  
            if (gk > 0)  
            {  
                gk--;  
                gks++;  
            }  
        }  
    }  
  
    // Return the count of sub-sequence 'gks'  
    return gks;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    String a = "ggkssk";  
    System.out.print(maxOperations(a)); 
}  
} 
  
// This code is contributed  
// by Akanksha Rai 

