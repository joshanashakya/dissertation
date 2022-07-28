

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count of operations required 
    static int minOperations(int n, String a, String b, String c) 
    { 
  
        // To store the count of operations 
        int ans = 0; 
        for (int i = 0; i < n; i++) { 
            char x = a.charAt(i); 
            char y = b.charAt(i); 
            char z = c.charAt(i); 
  
            // No operation required 
            if (x == y && y == z) 
                ; 
  
            // One operation is required when 
            // any two characters are equal 
            else if (x == y || y == z || x == z) { 
                ans++; 
            } 
  
            // Two operations are required when 
            // none of the characters are equal 
            else { 
                ans += 2; 
            } 
        } 
  
        // Return the minimum count of operations required 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String a = "place"; 
        String b = "abcde"; 
        String c = "plybe"; 
        int n = a.length(); 
        System.out.print(minOperations(n, a, b, c)); 
    } 
} 

