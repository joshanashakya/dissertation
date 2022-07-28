

// Simple Java program to find maximum 
// number of characters between two 
// occurrences of same character 
class GFG { 
      
    static int maximumChars(String str) 
    { 
        int n = str.length(); 
        int res = -1; 
          
        for (int i = 0; i < n - 1; i++) 
            for (int j = i + 1; j < n; j++) 
                if (str.charAt(i) == str.charAt(j)) 
                    res = Math.max(res,  
                         Math.abs(j - i - 1)); 
                           
        return res; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "abba"; 
          
        System.out.println(maximumChars(str)); 
    } 
} 
  
// This code is contributed by vt_m. 

