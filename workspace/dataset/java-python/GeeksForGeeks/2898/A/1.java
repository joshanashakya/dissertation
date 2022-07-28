

// Java program to find possible non  
// transitive triplets btw L and R 
class GFG { 
      
    // Function to return gcd of a and b 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
              
        return gcd(b % a, a); 
    } 
  
    // function to check for gcd 
    static boolean coprime(int a, int b) 
    { 
          
        // a and b are coprime if their  
        // gcd is 1. 
        return (gcd(a, b) == 1); 
    } 
  
    // Checks if any possible triplet  
    // (a, b, c) satifying the condition 
    // that (a, b) is coprime, (b, c) is 
    // coprime but (a, c) isnt */ 
    static void possibleTripletInRange(int L, int R) 
    { 
  
        boolean flag = false; 
        int possibleA = 0, possibleB = 0,  
                           possibleC = 0; 
  
        // Generate and check for all possible 
        // triplets between L and R 
        for (int a = L; a <= R; a++) { 
            for (int b = a + 1; b <= R; b++) { 
                for (int c = b + 1; c <= R; c++) 
                { 
  
                    // if we find any such triplets 
                    // set flag to true 
                    if (coprime(a, b) && coprime(b, c) 
                                    && !coprime(a, c)) 
                    { 
                        flag = true; 
                        possibleA = a; 
                        possibleB = b; 
                        possibleC = c; 
                        break; 
                    } 
                } 
            } 
        } 
  
        // flag = True indicates that a pair exists 
        // between L and R 
        if (flag == true) { 
            System.out.println("(" + possibleA + ", " 
                  + possibleB + ", " + possibleC + ")"
                    + " is one such possible triplet "
                      + "between " + L + " and " + R); 
        } 
        else { 
            System.out.println("No Such Triplet exists"
                      + "between " + L + " and " + R); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
          
        int L, R; 
  
        // finding possible Triplet between 
        // 2 and 10 
        L = 2; 
        R = 10; 
        possibleTripletInRange(L, R); 
  
        // finding possible Triplet between  
        // 23 and 46 
        L = 23; 
        R = 46; 
        possibleTripletInRange(L, R); 
    } 
} 
  
// This code is contributed by 
// Smitha DInesh Semwal 

