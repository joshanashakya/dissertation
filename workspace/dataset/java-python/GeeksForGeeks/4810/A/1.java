

// Java program to find the index of the left pointer 
  
import java.io.*; 
  
class GFG { 
  
  
// Function that returns the index of the left pointer 
static int getIndex(int a[], int n) 
{ 
    // there's only one element in the array 
    if(n == 1) 
        return 0; 
  
    // initially both are at end 
    int ptrL = 0, ptrR = n-1, sumL = a[0], sumR = a[n-1]; 
  
    while (ptrR - ptrL > 1) { 
        if (sumL < sumR) { 
            ptrL++; 
            sumL += a[ptrL]; 
        } 
        else if (sumL > sumR) { 
            ptrR--; 
            sumR += a[ptrR]; 
        } 
        else { 
            break; 
        } 
    } 
    return ptrL; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
        int a[] = { 2, 7, 9, 8, 7 }; 
  
    int n =a.length; 
  
    System.out.println ( getIndex(a, n)); 
    } 
} 
// This code is contributed by  anuj_67.. 

