

// Java implementation of the above approach 
import java.util.ArrayList; 
  
class GFG 
{ 
  
// function to calculate the value  
// of the a and r of geometric series  
static ArrayList values_of_r_and_a(double m, double n, 
                                double mth, double nth)  
{  
    if (m < n) 
    {  
        double t = m; 
        n = m; 
        m = t; 
        t = mth; 
        mth = nth; 
        nth = t; 
    }  
  
    // calculate value of r using formula  
    double r = Math.pow(mth / nth, 1.0 / (m - n));  
  
    // calculate value of a using value of r  
    double a = mth / Math.pow(r, (m - 1));  
  
    // push both values in the vector  
    // and return it 
    ArrayList arr = new ArrayList(); 
    arr.add(a); 
    arr.add(r); 
    return arr;  
}  
  
// function to calculate the value  
// of pth term of the series  
static double FindSum(double m, double n,  
                    double mth, double nth, 
                    double p)  
{  
  
    // first calculate value of a and r  
    ArrayList ar = values_of_r_and_a(m, n, mth, nth);  
  
    double a = (double)ar.get(0);  
    double r = (double)ar.get(1);  
  
    // calculate pth term by using formula  
    double pth = a * Math.pow(r, (p - 1.0));  
  
    // return the value of pth term  
    return pth;  
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    double m = 10; 
    double n = 5; 
    double p = 15;  
    double mth = 2560; 
    double nth = 80; 
  
    System.out.println((int)FindSum(m, n, mth, nth, p)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

