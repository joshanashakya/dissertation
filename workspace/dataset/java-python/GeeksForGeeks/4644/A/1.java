

// Java program to find sum of series. 
class GFG  
{ 
static double sumOfSeries(int n)  
{ 
    double res = 0.0; 
    int sum = 0, prod = 1; 
    for (int i = 1; i <= n; i++) { 
    sum += i; 
    prod *= i; 
    res += ((double)sum / prod); 
    } 
    return res; 
} 
  
// Driver code 
public static void main(String arg[]) { 
    int n = 4; 
    System.out.println(sumOfSeries(n)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

