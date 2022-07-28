

// Java program to print maximum product 
// such that its previous and next 
// element product is maximum. 
import java.io.*; 
  
class GFG 
{ 
    // function to return largest element 
    // such that its previous and next 
    // element product is maximum. 
    static int maxProduct(int a[], int n) 
    { 
  
        int[] product = new int[n]; 
  
        int maxA[] = new int[n]; 
  
        int maxProd = 0; 
        int maxArr = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // product of previous and next 
            // element and stored into an  
            // array product[i] 
            product[i] = a[(i + 1) % n] * 
                        a[(i + (n - 1)) % n]; 
  
            // find maximum product  
            // in product[i] array 
            if (maxProd < product[i])  
            { 
                maxProd = product[i]; 
            } 
        } 
        return maxProd; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
  
    { 
        int[] a = { 5, 6, 4, 3, 2 }; 
  
        int n = a.length; 
  
        System.out.println(maxProduct(a, n)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

