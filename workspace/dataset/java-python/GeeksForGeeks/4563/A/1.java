

// Java program to find Seed of a number 
import java.util.*;  
  
class GFg{ 
static int MAX = 10000; 
static int[] prodDig=new int[MAX]; 
  
// Stores product of digits of x in prodDig[x] 
static int getDigitProduct(int x) 
{ 
    // If x has single digit 
    if (x < 10) 
    return x; 
  
    // If digit product is already computed 
    if (prodDig[x] != 0) 
    return prodDig[x]; 
  
    // If digit product is not computed before. 
    int prod = (x % 10) * getDigitProduct(x/10); 
  
    return (prodDig[x] = prod); 
} 
  
// Prints all seeds of n 
static void findSeed(int n) 
{ 
    // Find all seeds using prodDig[] 
    List<Integer> res = new ArrayList<Integer>();  
    for (int i=1; i<=n/2; i++) 
        if (i*getDigitProduct(i) == n) 
            res.add(i); 
  
    // If there was no seed 
    if (res.size() == 0) 
    { 
        System.out.println("NO seed exists"); 
        return; 
    } 
  
    // Print seeds 
    for (int i=0; i<res.size(); i++) 
        System.out.print(res.get(i)+" "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 138; 
    findSeed(n); 
  
} 
} 
// this code is contributed by mits 

