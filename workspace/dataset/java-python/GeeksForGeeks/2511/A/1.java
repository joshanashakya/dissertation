

// Java implementation of the above approach 
  
class GFG { 
  
// Function to count the minimum number of elements 
// to remove from a number so that pairwise two 
// consecutive digits are same. 
    static int countConsecutive(String s) { 
  
        // initialize counting variable 
        int count = 0; 
  
        for (int i = 0; i < s.length(); i++) { 
  
            // check if two consecutive digits are same 
            if (s.charAt(i) == s.charAt(i + 1)) { 
                i++; 
            } else { 
                count++; 
            } 
        } 
  
        return count; 
    } 
  
// Driver code 
    public static void main(String args[]) { 
        String str = "44522255"; 
        System.out.println(countConsecutive(str)); 
  
    } 
} 
  
// This code is contributed by PrinciRaj19992 

