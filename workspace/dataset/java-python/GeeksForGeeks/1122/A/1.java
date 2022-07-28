

// Java program to find minimum value to assign all array  
// elements so that array product becomes greater 
class GFG{ 
  
// Epsilon value is used at various steps  
// to ensure correctness upto 10^15 digits.  
static double EPS=1E-15;  
  
static double findMinValue(double arr[], double n)  
{  
    // add logarithmic value of all elements to sum  
    double sum = 0;  
    for (int i=0; i<n; i++)  
        sum += (double)Math.log10(arr[i])+EPS;  
  
    // to find the nth root of sum  
    double xl = (double)(sum/n+EPS);  
  
    // to find the antilog of xl  
    double res = Math.pow((double)10.0, (double)xl) + EPS;  
    return (double)Math.ceil(res+EPS);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    double arr[] = {4, 2, 1, 10, 6};  
    double n = arr.length;  
    System.out.println(findMinValue(arr, n));  
}  
} 
// This code is contributed by mits 

