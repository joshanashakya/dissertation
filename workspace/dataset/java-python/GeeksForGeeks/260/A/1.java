

// Java Program to test 1/e law for Secretary Problem : 
import java.util.*; 
class GFG 
{ 
static double e = 2.71828; 
  
// To find closest integer of num. 
static int roundNo(float num) 
{ 
    return (int) (num < 0 ?  
                  num - 0.5 : num + 0.5); 
} 
  
// Finds best candidate using n/e rule. candidate[] 
// represents talents of n candidates. 
static void printBestCandidate(int candidate[], int n) 
{ 
    // Calculating sample size for benchmarking. 
    int sample_size = roundNo((float) (n / e)); 
    System.out.println("\n\nSample size is " + sample_size); 
  
    // Finding best candidate in sample size 
    int best = 0;  
    for (int i = 1; i < sample_size; i++) 
        if (candidate[i] > candidate[best]) 
            best = i; 
  
    // Finding the first best candidate that is  
    // better than benchmark set. 
    for (int i = sample_size; i < n; i++) 
        if (candidate[i] >= candidate[best]) 
        { 
            best = i; 
            break; 
        } 
  
    if (best >= sample_size) 
        System.out.println("\nBest candidate found is " +  
                           (best + 1) + " with talent " +  
                            candidate[best]); 
    else
        System.out.print("Couldn't find a best candidate\n"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 8; 
  
    // n = 8 candidates and candidate array contains 
    // talents of n candidate where the largest  
    // number means highest talented candidate. 
    int []candidate = new int[n]; 
  
    // generating random numbers between 1 to 8  
    // for talent of candidate 
    Random rand = new Random(); 
    for (int i = 0; i < n; i++) 
        candidate[i] = 1 + rand.nextInt((8 - 1) + 1); 
  
    System.out.print("Candidate : "); 
    for (int i = 0; i < n; i++) 
        System.out.print(i + 1 + " "); 
    System.out.println(); 
    System.out.print("Talents : "); 
    for (int i = 0; i < n; i++) 
        System.out.print(candidate[i] + " "); 
      
    printBestCandidate(candidate, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

