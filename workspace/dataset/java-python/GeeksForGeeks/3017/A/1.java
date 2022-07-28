

// A Java program for finding the First digit 
// of the large factorial number 
class GFG{ 
static int firstDigit(int n) 
{ 
    int fact = 1; 
  
    for (int i = 2; i <= n; i++) { 
        fact = fact * i; 
  
        // Removing trailing 0s as this 
        // does not change first digit. 
        while (fact % 10 == 0)  
            fact = fact / 10;      
    } 
  
    // loop for divide the fact until it  
    // become the single digit and return 
    // the fact 
    while (fact >= 10)  
        fact = fact / 10; 
      
    return fact; 
} 
  
// derive main 
public static void main(String[] args) 
{ 
    int n = 5; 
    System.out.println(firstDigit(n)); 
} 
} 
//This code is contributed by Smitha Dinesh Semwal 

