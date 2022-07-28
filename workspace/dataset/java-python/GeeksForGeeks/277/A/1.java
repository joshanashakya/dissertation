

// Java program for maximum possible product 
// with given array of numbers 
class GFG { 
  
// Function that prints operations in each step 
static void MaximumProduct(int a[], int n) { 
    int cntneg = 0; 
    int cntzero = 0; 
  
    int used[] = new int[n]; 
    int pos = -1; 
      
    // count number of zeros and negative numbers 
    for (int i = 0; i < n; ++i) { 
        if (a[i] == 0) 
        { 
            used[i] = 1; 
            cntzero++; 
              
        } 
          
        if (a[i] < 0) { 
            cntneg++; 
              
            // To get negative number which  
            // is nearest to zero, that is maximum  
            // negative number  
            if (pos == -1 || Math.abs(a[pos]) > Math.abs(a[i])) { 
                pos = i; 
                  
            } 
              
        } 
          
    } 
      
    // if number of negative number are odd then 
    // remove negative number at position pos 
    if (cntneg % 2 == 1) { 
        used[pos] = 1; 
          
    } 
      
    // initial condition 
    if (cntzero == n || (cntzero == n - 1 && cntneg == 1)) 
    {               
        for (int i = 0; i < n - 1; ++i) { 
            System.out.println(1 + " " + (i + 1) + " "
                        + (i + 2)); 
              
        } 
        return; 
          
    } 
      
    int lst = -1; 
    for (int i = 0; i < n; ++i) { 
        if (used[i] == 1) { 
            if (lst != -1) { 
                System.out.println(1 + " " + (lst + 1) + " "
                            + (i + 1)); 
                  
            } 
            lst = i; 
              
        } 
          
    } 
      
    // perform second type operations 
    if (lst != -1) { 
        System.out.println(2 + " " + (lst + 1)); 
          
    } 
    lst = -1; 
    // for reamining numbers 
    for (int i = 0; i < n; ++i) 
    { 
        // if it is not removed yet 
        if (used[i] != 1)  
        { 
            if (lst != -1)  
            { 
                System.out.println(1 + " " + (lst + 1) + " "
                            + (i + 1)); 
                  
            } 
            lst = i; 
        } 
    } 
      
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = {5, -2, 0, 1, -3}; 
    int n = a.length; 
    MaximumProduct(a, n); 
      
} 
} 
  
// This code is contributed by PrinciRaj1992 

