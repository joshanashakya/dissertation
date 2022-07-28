

// Java Program to check whether the 
// given string is Heterogram or not. 
class GFG { 
          
    static boolean isHeterogram(String s, int n) 
    { 
        int hash[] = new int[26]; 
          
        // traversing the string. 
        for (int i = 0; i < n; i++) 
        { 
            // ignore the space 
            if (s.charAt(i) != ' ') 
            { 
                // if already encountered 
                if (hash[s.charAt(i) - 'a'] == 0) 
                    hash[s.charAt(i) - 'a'] = 1; 
                      
                // else return false. 
                else
                    return false; 
            } 
        } 
          
        return true; 
    } 
      
// Driver code  
public static void main (String[] args) 
{ 
    String s = "the big dwarf only jumps"; 
    int n = s.length(); 
      
    if(isHeterogram(s, n)) 
        System.out.print("YES"); 
    else
        System.out.print("NO"); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

