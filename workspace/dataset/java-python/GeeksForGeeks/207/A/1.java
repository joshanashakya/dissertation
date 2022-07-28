

// JAVA program to find N digit number such 
// that it is not divisible by any of its digits 
class GFG{ 
   
// Function that print the answer 
static void findTheNumber(int n) 
{ 
    // if n == 1 then it is 
    // not possible 
    if (n == 1) { 
        System.out.print("Impossible" +"\n"); 
        return; 
    } 
   
    // loop to n-1 times 
    for (int i = 0; i < n - 1; i++) { 
        System.out.print("5"); 
    } 
   
    // print 4 as last digit of 
    // the number 
    System.out.print("4"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int n = 12; 
   
    // Function call 
    findTheNumber(n); 
   
} 
} 
  
// This code is contributed by 29AjayKumar 

