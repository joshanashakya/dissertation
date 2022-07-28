

// Java program to find a  
// non transitive co-prime 
// triplets between L and R  
import java.io.*; 
  
class GFG  
{ 
  
// Checks if any possible triplet  
// (a, b, c) satifying the condition 
// that (a, b) is coprime, (b, c)  
// is coprime but (a, c) isnt 
static void possibleTripletInRange(int L,  
                                   int R) 
{ 
    boolean flag = false; 
    int possibleA = 0,  
        possibleB = 0,  
        possibleC = 0; 
   
    int numbersInRange = (R - L + 1); 
  
    // Case 1 : Less than 3  
    // numbers between L and R 
    if (numbersInRange < 3)  
    { 
        flag = false; 
    } 
  
    // Case 2: More than 3  
    // numbers between L and R  
    else if (numbersInRange > 3) 
    { 
        flag = true; 
  
        // triplets should always  
        // be of form (2k, 2k + 1, 
        // 2k + 2) 
        if (L % 2 > 0)  
        { 
            L++; 
        } 
  
        possibleA = L; 
        possibleB = L + 1; 
        possibleC = L + 2; 
    } 
  
    else 
    { 
        /* Case 3.1: Exactly 3 numbers  
                      in range of form 
                     (2k, 2k + 1, 2k + 2) */
        if (!(L % 2 > 0))  
        { 
            flag = true; 
            possibleA = L; 
            possibleB = L + 1; 
            possibleC = L + 2; 
        } 
        else 
        { 
            /* Case 3.2: Exactly 3 numbers 
                         in range of form 
                         (2k - 1, 2k, 2k + 1) */
            flag = false; 
        } 
    } 
  
    // flag = True indicates  
    // that a pair exists  
    // between L and R 
    if (flag == true)  
    { 
        System.out.println("(" + possibleA + 
                          ", " + possibleB +  
                          ", " + possibleC +  
             ")" + " is one such possible" +  
                       " triplet between " +  
                          L + " and " + R ); 
    } 
    else { 
        System.out.println("No Such Triplet" +  
                          " exists between " +  
                             L + " and " + R); 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
int L, R; 
  
// finding possible Triplet  
// between 2 and 10 
L = 2; 
R = 10; 
possibleTripletInRange(L, R); 
  
// finding possible Triplet 
// between 23 and 46 
L = 23; 
R = 46; 
possibleTripletInRange(L, R); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

