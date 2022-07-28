

// Java implementation of above approach 
class GFG  
{ 
  
    // Function that returns true if all  
    // the array elements can be made equal  
    // with the given operation  
    static boolean EqualNumbers(int a[], int n) 
    { 
        for (int i = 0; i < n; i++)  
        { 
  
            // Divide number by 2  
            while (a[i] % 2 == 0)  
            { 
                a[i] /= 2; 
            } 
  
            // Divide number by 3  
            while (a[i] % 3 == 0) 
            { 
                a[i] /= 3; 
            } 
  
            if (a[i] != a[0]) 
            { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        int a[] = {50, 75, 150}; 
  
        int n = a.length; 
  
        if (EqualNumbers(a, n))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
}  
  
// This code is contributed by Rajput-JI 

