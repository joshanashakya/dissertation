

// Java program to determine if 
// A and B can be reached starting 
// from 1, 1 following the given  
// steps. 
class GFG { 
      
    // function to check is it is  
    // possible to reach A and B  
    // starting from 1 and 1 
    static boolean possibleToReach(int a, int b) 
    { 
          
        // find the cuberoot of the number 
        int c = (int)Math.cbrt(a * b); 
  
        // divide the number by cuberoot 
        int re1 = a / c; 
        int re2 = b / c; 
  
        // if it is a perfect cuberoot and  
        // divides a and b 
        if ((re1 * re1 * re2 == a) &&  
                         (re2 * re2 * re1 == b)) 
            return true; 
        else
            return false; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int A = 60, B = 450; 
  
        if (possibleToReach(A, B)) 
            System.out.println("yes"); 
        else
            System.out.println("no"); 
    } 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

