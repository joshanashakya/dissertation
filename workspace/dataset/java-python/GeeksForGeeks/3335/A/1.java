

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the minimum cost to make the 
// configuration of both the strings same 
static int findCost(String s1, String s2, 
                    int a, int b, int c,  
                    int d, int n) 
{ 
    int cost = 0; 
  
    // Iterate and find the cost 
    for (int i = 0; i < n; i++)  
    { 
        if (s1.charAt(i) == s2.charAt(i)) 
            continue; 
        else 
        { 
  
            // Find the minimum cost 
            if ((s1.charAt(i) == '1' && s2.charAt(i) == '2') ||  
                (s2.charAt(i) == '1' && s1.charAt(i) == '2')) 
                cost += Math.min(d, Math.min(a, b + c)); 
            else if ((s1.charAt(i) == '2' && s2.charAt(i) == '3') ||  
                     (s2.charAt(i) == '2' && s1.charAt(i) == '3')) 
                cost += Math.min(d, Math.min(b, a + c)); 
            else if ((s1.charAt(i) == '1' && s2.charAt(i) == '3') || 
                     (s2.charAt(i) == '1' && s1.charAt(i) == '3')) 
                cost += Math.min(d, Math.min(c, a + b)); 
        } 
    } 
    return cost; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String s1 = "121"; 
    String s2 = "223"; 
    int a = 2, b = 3, c = 4, d = 10; 
    int n = s1.length(); 
    System.out.println(findCost(s1, s2, a, b, c, d, n)); 
} 
} 
  
// This code is contributed by Code_Mech. 

