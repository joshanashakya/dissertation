

// Java program to find the total  
// Number of Digits in (N!)^N  
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// Function to find the total  
// Number of Digits in (N!)^N  
public double CountDigits(int n)  
{  
    if (n == 1)  
        return 1;  
  
    double sum = 0;  
  
    // Finding X  
    for (int i = 2; i <= n; ++i) 
    {  
        sum += ((double)Math.log(i) /  
                (double)Math.log(10));  
    }  
  
    // Calculating N*X  
    sum *= n;  
  
    // Floor(N*X) + 1  
    // equivalent to floor(sum) + 1  
    return Math.ceil(sum);  
}  
  
// Driver code  
public static void main(String args[])  
{  
    GFG g = new GFG(); 
    int N = 5;  
    System.out.println(g.CountDigits(N));  
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

