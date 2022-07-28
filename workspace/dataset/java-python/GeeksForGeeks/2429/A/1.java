

// Java  program to find sum of  
// numbers from 1 to N which  
// are divisible by 2 or 7  
  
import java.io.*; 
  
class GFG { 
// Function to calculate the sum  
// of numbers divisible by 2 or 7  
public static int sum(int N)  
{  
    int S1, S2, S3;  
  
    S1 = ((N / 2)) * (2 * 2 +  
        (N / 2 - 1) * 2) / 2;  
    S2 = ((N / 7)) * (2 * 7 +  
        (N / 7 - 1) * 7) / 2;  
    S3 = ((N / 14)) * (2 * 14 +  
        (N / 14 - 1) * 14) / 2;  
  
    return S1 + S2 - S3;  
}  
  
// Driver code  
    public static void main (String[] args) { 
  
    int N = 20;  
    System.out.println( sum(N));  
    }  
}  
  
// This code is contributed by ajit 

