

// Java Program to find minimum cost to 
// construct a string 
  
class GFG  
{ 
  
    static int minCost(char[] s)  
    { 
          
        // Initially all characters are un-seen 
        boolean alphabets[] = new boolean[26]; 
  
        // Marking seen characters 
        for (int i = 0; i < s.length; i++)  
        { 
            alphabets[(int) s[i] - 97] = true; 
        } 
  
        // Count total seen character,  
        // and that is the cost 
        int count = 0; 
        for (int i = 0; i < 26; i++) 
        { 
            if (alphabets[i])  
            { 
                count++; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        // s is the string that needs to be constructed 
        String s = "geeksforgeeks"; 
        System.out.println("Total cost to construct " + 
                s + " is " + minCost(s.toCharArray())); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

