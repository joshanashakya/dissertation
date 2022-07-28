

// Java program to find the number of solutions for 
// the equation x + y + z <= n, such that 
// 0 <= x <= X, 0 <= y <= Y, 0 <= z <= Z. 
  
import java.io.*; 
  
class GFG { 
  
// function to find the number of solutions for 
// the equation x + y + z <= n, such that 
// 0 <= x <= X, 0 <= y <= Y, 0 <= z <= Z. 
static int NumberOfSolutions(int x, int y, int z, int n) 
{ 
    // to store answer 
    int ans = 0; 
  
    // for values of x 
    for (int i = 0; i <= x; i++) { 
  
        // for values of y 
        for (int j = 0; j <= y; j++) { 
  
            // maximum possible value of z 
            int temp = n - i - j; 
  
            // if z value greater than equals to 0 
            // then only it is valid 
            if (temp >= 0) { 
  
                // find minimum of temp and z 
                temp = Math.min(temp, z); 
                ans += temp + 1; 
            } 
        } 
    } 
  
    // return required answer 
    return ans; 
} 
  
       // Driver code 
    public static void main (String[] args) { 
      
    int x = 1, y = 2, z = 3, n = 4; 
    System.out.println( NumberOfSolutions(x, y, z, n)); 
  
    } 
} 
  
// this code is contributed by anuj_67.. 

