

// Java program to find the numbers 
// of non negative integral solutions 
class GFG { 
  
  // return number of non negative 
  // integral solutions 
  static int countSolutions(int n, int val) { 
  
    // initialize total = 0 
    int total = 0; 
  
    // Base Case if n = 1 and val >= 0 
    // then it should return 1 
    if (n == 1 && val >= 0) 
      return 1; 
  
    // iterate the loop till equal the val 
    for (int i = 0; i <= val; i++) { 
  
      // total solution of equations 
      // and again call the recursive 
      // function Solutions(variable, value) 
      total += countSolutions(n - 1, val - i); 
    } 
  
    // return the total no possible solution 
    return total; 
  } 
  
  // Driver code 
  public static void main(String[] args) { 
    int n = 5; 
    int val = 20; 
  
    System.out.print(countSolutions(n, val)); 
  } 
} 
  
// This code is contributed by Anant Agarwal. 

