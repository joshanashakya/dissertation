

// Java program to check if two numbers 
// can be made equal by increasing 
// the first by a and decreasing 
// the second by b 
class GFG  
{ 
      
    // Function to whether the numbers 
    // can be made equal or not 
    static boolean checkEqualNo(int m, int n, int a, int b) 
    { 
        if (m <= n) { 
      
            // Check whether the numbers can reach 
            // an equal point or not 
            if ((n - m) % (a + b) == 0) { 
                return true; 
            } 
            else { 
                return false; 
            } 
        } 
        else { 
      
            // M and N cannot be made equal by 
            // increasing M and decreasing N when 
            // M is already greater than N 
            return false; 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int M = 2, N = 8; 
        int A = 3, B = 3; 
      
        if (checkEqualNo(M, N, A, B) == true)  
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
      
    } 
} 
  
// This code is contributed by Yash_R 

