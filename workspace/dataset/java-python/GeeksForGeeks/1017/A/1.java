

// Java program to find minimum number 
// of elements needs to add to the  
// array so that its median equals x. 
import java.util.Arrays; 
  
class GFG  
{ 
  
// Returns count of elements to be  
// added to make median x. This function 
// assumes that a[] has enough extra space. 
static int minNumber(int a[], int n, int x) 
{  
    // to sort the array in increasing order. 
    Arrays.sort(a); 
  
    int k; 
    for (k = 0; a[(n) / 2] != x; k++)  
    { 
        a[n++] = x; 
        Arrays.sort(a); 
    } 
    return k; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int x = 10; 
    int a[] = { 10, 20, 30 }; 
    int n = 3; 
    System.out.println(minNumber(a, n-1, x)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

