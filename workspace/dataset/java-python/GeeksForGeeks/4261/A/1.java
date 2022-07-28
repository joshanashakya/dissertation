

// Java implementation of the approach 
class GFG 
{ 
static final int maxSize = 50; 
  
// Function to multiply two 7 * 7 matrix 
static double [][] matrix_product(double [][] a, 
                                  double [][] b) 
{ 
    double [][] c = new double[7][7]; 
  
    for (int i = 0; i < 7; i++) 
        for (int j = 0; j < 7; j++) 
            for (int k = 0; k < 7; k++) 
                c[i][j] += a[i][k] * b[k][j]; 
    return c; 
} 
  
// Function to perform matrix exponentiation 
static double [][] mul_expo(double [][] mul, int p) 
{ 
  
    // 7 * 7 identity matrix 
    double [][] s = {{ 1, 0, 0, 0, 0, 0, 0 }, 
                     { 0, 1, 0, 0, 0, 0, 0 }, 
                     { 0, 0, 1, 0, 0, 0, 0 }, 
                     { 0, 0, 0, 1, 0, 0, 0 }, 
                     { 0, 0, 0, 0, 1, 0, 0 }, 
                     { 0, 0, 0, 0, 0, 1, 0 }, 
                     { 0, 0, 0, 0, 0, 0, 1 }}; 
  
    // Loop to find the power 
    while (p != 1) 
    { 
        if (p % 2 == 1) 
            s = matrix_product(s, mul); 
        mul = matrix_product(mul, mul); 
        p /= 2; 
    } 
    return matrix_product(mul, s); 
} 
  
// Function to return the required count 
static double expectedSteps(int x) 
{ 
  
    // Base cases 
    if (x == 0) 
        return 0; 
    if (x <= 6) 
        return 6; 
  
    // Multiplier matrix 
    double [][]mul = { { (double)7 / 6, 1, 0, 0, 0, 0, 0 }, 
                                   { 0, 0, 1, 0, 0, 0, 0 }, 
                                   { 0, 0, 0, 1, 0, 0, 0 }, 
                                   { 0, 0, 0, 0, 1, 0, 0 }, 
                                   { 0, 0, 0, 0, 0, 1, 0 }, 
                                   { 0, 0, 0, 0, 0, 0, 1 }, 
                                   {(double) - 1 / 6, 0, 0,  
                                                0, 0, 0, 0 }}; 
  
    // Finding the required multiplier 
    // i.e mul^(X-6) 
    mul = mul_expo(mul, x - 6); 
  
    // Final answer 
    return (mul[0][0] + mul[1][0] + mul[2][0] +  
            mul[3][0] + mul[4][0] + mul[5][0]) * 6; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 10; 
  
    System.out.printf("%.5f",expectedSteps(n - 1)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

