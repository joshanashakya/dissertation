

// Java program to count pairs whose sum  
// of squares is N  
  
import java.io.*; 
  
class GFG { 
  
  
  
// Function to count the pairs satisfying  
// a ^ 2 + b ^ 2 = N  
static int countPairs(int N)  
{  
    int count = 0;  
  
    // Check for each number 1 to sqrt(N)  
    for (int i = 1; i <= (int)Math.sqrt(N); i++)  
    {  
  
        // Store square of a number  
        int sq = i * i;  
  
        // Subtract the square from given N  
        int diff = N - sq;  
  
        // Check if the difference is also  
        // a perfect square  
        int sqrtDiff = (int)Math.sqrt(diff);  
  
        // If yes, then increment count  
        if (sqrtDiff * sqrtDiff == diff)  
            count++;  
    }  
  
    return count;  
}  
  
    // Driver code  
    public static void main (String[] args) 
    { 
    // Loop to Count no. of pairs satisfying  
    // a ^ 2 + b ^ 2 = i for N = 1 to 10  
    for (int i = 1; i <= 10; i++)  
        System.out.println( "For n = " + i + ", "
            + countPairs(i) + " pair exists\n");  
    } 
} 
// This code is contributed by inder_verma. 

