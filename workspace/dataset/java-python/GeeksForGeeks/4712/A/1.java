

// Java program for finding determinant 
// of generated matrix  
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
static int N = 3; 
  
// Function to calculate determinant  
static double calcDeterminant(int arr[])  
{  
    double determinant = 0;  
  
    for (int i = 0; i < N; i++)  
    {  
        determinant += Math.pow(arr[i], 3);  
    }  
  
    determinant -= 3 * arr[0] *  
                    arr[1] * arr[2];  
  
    return determinant;  
}  
  
// Driver code 
static public void main (String args[]) 
{ 
    int []arr = { 4, 5, 3 };  
    System.out.println(calcDeterminant(arr));  
} 
} 
  
// This code is contributed  
// by Akanksha Rai 

