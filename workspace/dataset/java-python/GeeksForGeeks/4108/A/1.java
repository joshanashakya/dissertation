

// Java program to count pairs whose sum 
// cubes is N 
  
class Test 
{ 
    // method to count the pairs satisfying 
    // a ^ 3 + b ^ 3 = N 
    static int countPairs(int N) 
    { 
        int count = 0; 
       
        // Check for each number 1 to cbrt(N) 
        for (int i = 1; i <= Math.cbrt(N); i++) 
        { 
            // Store cube of a number 
            int cb = i*i*i; 
       
            // Subtract the cube from given N 
            int diff = N - cb; 
       
            // Check if the difference is also 
            // a perfect cube 
            int cbrtDiff = (int) Math.cbrt(diff); 
       
            // If yes, then increment count 
            if (cbrtDiff*cbrtDiff*cbrtDiff == diff) 
                count++; 
        } 
       
        // Return count 
        return count; 
    } 
      
    // Driver method 
    public static void main(String args[])  
    { 
        // Loop to Count no. of pairs satisfying 
        // a ^ 3 + b ^ 3 = i for N = 1 to 10 
        for (int i = 1; i<= 10; i++) 
            System.out.println("For n = " + i + ", " + 
                     + countPairs(i) + " pair exists"); 
    } 
} 

