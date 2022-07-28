

// Java implementation of the approach 
class GFG  
{ 
  
// Function that returns true if there 
// exists a triplet with sum x 
static boolean existsTriplet(int a[], int b[], 
                      int c[], int x, int l1, 
                              int l2, int l3) 
{ 
    // Sorting arrays such that a[] 
    // represents smallest array 
    if (l2 <= l1 && l2 <= l3) 
    { 
        swap(l2, l1); 
        swap(a, b); 
    } 
    else if (l3 <= l1 && l3 <= l2) 
    { 
        swap(l3, l1); 
        swap(a, c); 
    } 
  
    // Iterating the smallest array 
    for (int i = 0; i < l1; i++) 
    { 
  
        // Two pointers on second and third array 
        int j = 0, k = l3 - 1; 
        while (j < l2 && k >= 0) 
        { 
  
            // If a valid triplet is found 
            if (a[i] + b[j] + c[k] == x) 
                return true; 
            if (a[i] + b[j] + c[k] < x) 
                j++; 
            else
                k--; 
        } 
    } 
    return false; 
} 
  
private static void swap(int x, int y)  
{ 
    int temp = x; 
    x = y; 
    y = temp; 
} 
  
private static void swap(int []x, int []y)  
{ 
    int []temp = x; 
    x = y; 
    y = temp; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 2, 7, 8, 10, 15 }; 
    int b[] = { 1, 6, 7, 8 }; 
    int c[] = { 4, 5, 5 }; 
    int l1 = a.length; 
    int l2 = b.length; 
    int l3 = c.length; 
  
    int x = 14; 
  
    if (existsTriplet(a, b, c, x, l1, l2, l3)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

