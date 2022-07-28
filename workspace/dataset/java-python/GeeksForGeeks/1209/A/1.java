

// Java implementation of 
// Trial Division Algorithm 
import java.util.*; 
   
class GFG{ 
    
// Function to check if a number is 
// a prime number or not 
static int TrialDivision(int N){ 
  
    // Initializing with the value 2 
    // from where the number is checked 
    int i = 2; 
  
    // Computing the square root of 
    // the number N 
    int k =(int) Math.ceil(Math.sqrt(N)); 
  
    // While loop till the 
    // square root of N 
    while(i<= k){ 
  
        // If any of the numbers between 
        // [2, sqrt(N)] is a factor of N 
        // Then the number is composite 
        if(N % i == 0) 
            return 0; 
        i += 1; 
    } 
  
    // If none of the numbers is a factor, 
    // then it is a prime number 
    return 1; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
   
    int N = 49; 
    int p = TrialDivision(N); 
  
    // To check if a number is a prime or not 
    if(p != 0)  
        System.out.print("Prime"); 
    else
        System.out.print("Composite"); 
  
} 
} 
  
// This code is contributed by shivanisinghss2110 

