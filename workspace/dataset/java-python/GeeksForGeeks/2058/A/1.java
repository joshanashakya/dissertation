

// Java program to count total number of ways 
// to reach n-th stair with all jumps alowed 
class GFG { 
    static int calculateLeaps(int n) 
    { 
        if (n == 0 || n == 1) { 
            return 1; 
        } 
        else { 
            int leaps = 0; 
            for (int i = 0; i < n; i++) 
                leaps += calculateLeaps(i); 
            return leaps; 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        System.out.println(calculateLeaps(4)); 
    } 
} 
// This code is contributed by Anant Agarwal. 

