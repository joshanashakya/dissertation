

// Java program to get the probability 
// of getting two consecutive heads 
  
import java.io.*; 
  
class GFG { 
    
  
// Function to return the probability 
// of getting two consecutive heads 
static double getProbability(double p, double q) 
{ 
    p /= 100; 
    q /= 100; 
  
    // Formula derived from Bayes's theorem 
    double probability = (p * p + q * q) / (p + q); 
    return probability; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
            double p, q; 
  
    // given the probability of getting 
    // a head for both the coins 
    p = 80; 
    q = 40; 
  
     System.out.println( getProbability(p, q)); 
    } 
} 
// This code is contributed by  anuj_67.. 

