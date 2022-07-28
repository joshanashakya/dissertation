

// Java program to find the minimum days on which 
// you need to buy food from the shop so that you 
// can survive the next S days 
import java.io.*; 
  
class GFG { 
  
    // function to find the minimum days 
    static void survival(int S, int N, int M) 
    { 
  
        // If we can not buy at least a week 
        // supply of food during the first 
        // week OR We can not buy a day supply 
        // of food on the first day then we 
        // can't survive. 
        if (((N * 6) < (M * 7) && S > 6) || M > N) 
            System.out.println("No"); 
  
        else { 
  
            // If we can survive then we can 
            // buy ceil(A/N) times where A is 
            // total units of food required. 
            int days = (M * S) / N; 
  
            if (((M * S) % N) != 0) 
                days++; 
  
            System.out.println("Yes " + days); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int S = 10, N = 16, M = 2; 
  
        survival(S, N, M); 
    } 
} 
  
// This code is contributed by vt_m. 

