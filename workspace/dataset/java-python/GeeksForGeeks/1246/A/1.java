

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to print the largest n-digit even 
    // and odd numbers in hexadecimal number system 
    static void findNumbers(int n) 
    { 
  
        // Append 'F' (N - 1) times 
        String ans = string(n - 1, 'F'); 
  
        // Append 'E' for an even number 
        String even = ans + 'E'; 
  
        // Append 'F' for an odd number 
        String odd = ans + 'F'; 
  
        System.out.print("Even: " + even + "\n"); 
        System.out.print("Odd: " + odd + "\n"); 
    } 
  
    private static String string(int n, char c) 
    { 
        String str = ""; 
        for (int i = 0; i < n; i++) 
            str += c; 
        return str; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 2; 
  
        findNumbers(n); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

