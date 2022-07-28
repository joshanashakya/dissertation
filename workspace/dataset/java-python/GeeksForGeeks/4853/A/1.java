

// Java program to implement vieta formula  
// to calculate polynomial coefficients. 
import java.util.Arrays; 
  
class GFG 
{ 
  
// Function to calculate polynomial  
// coefficients. 
static void vietaFormula(int roots[], int n) 
{ 
    // Declare an array for 
    // polynomial coefficient. 
    int coeff[] = new int[++n + 1]; 
    Arrays.fill(coeff, 0); 
      
    // Set highest order coefficient as 1 
    coeff[n] = 1; 
  
    for (int i = 1; i <n; i++) 
    { 
        for (int j = n - i - 1; j < n; j++) 
        { 
            coeff[j] = coeff[j] + (-1) *  
                roots[i - 1] * coeff[j + 1]; 
        } 
    } 
  
    System.out.print("Polynomial Coefficients: "); 
    for (int i = n; i > 0; i--)  
    { 
        System.out.print(coeff[i] + " "); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Degree of required polynomial 
    int n = 4; 
      
    // Initialise an array by 
    // root of polynomial 
    int roots[] = { -1, 2, -3, 7 }; 
      
    // Function call 
    vietaFormula(roots, n); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

