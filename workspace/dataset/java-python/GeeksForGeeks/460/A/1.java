

// Java program to count all possible paths from 
// top left to top bottom using combinatorics 
class GFG { 
  
    static int numberOfPaths(int m, int n) 
    { 
        // We have to calculate m+n-2 C n-1 here 
        // which will be (m+n-2)! / (n-1)! (m-1)! 
        int path = 1; 
        for (int i = n; i < (m + n - 1); i++) { 
            path *= i; 
            path /= (i - n + 1); 
        } 
        return path; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        System.out.println(numberOfPaths(3, 3)); 
    } 
} 
  
// This code is contributed by Code_Mech. 

