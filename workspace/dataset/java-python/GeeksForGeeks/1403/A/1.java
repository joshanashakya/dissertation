

// Java implementation of the approach 
class GFG 
{ 
    // Function to return the maximum number 
    // that can be formed by changing 
    // at most k digits in str 
    static StringBuilder findMaximumNum(StringBuilder str,  
                                             int n, int k) 
    { 
      
        // For every digit of the number 
        for (int i = 0; i < n; i++)  
        { 
      
            // If no more digits can be replaced 
            if (k < 1) 
                break; 
      
            // If current digit is not already 9 
            if (str.charAt(i) != '9')  
            { 
      
                // Replace it with 9 
                str.setCharAt(i, '9'); 
      
                // One digit has been used 
                k--; 
            } 
        } 
        return str; 
    } 
      
    // Driver code 
    public static void main (String [] args) 
    { 
        StringBuilder str = new StringBuilder("569431"); 
          
        int n = str.length(); 
        int k = 3; 
      
        System.out.println(findMaximumNum(str, n, k)); 
    } 
} 
  
// This code is contributed by ihritik 

