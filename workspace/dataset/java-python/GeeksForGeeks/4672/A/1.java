

// Java implementation of the approach 
class GFG 
{ 
// Function that returns 
// true is selling of 
// the tickets is possible 
static boolean isSellingPossible(int n, 
                                 int a[]) 
{ 
    int i, c25 = 0, c50 = 0; 
    for (i = 0; i < n; i++) 
    { 
  
        // Nothing to return 
        // to the customer 
        if (a[i] == 25) 
            c25++; 
        else if (a[i] == 50) 
        { 
            c50++; 
  
            // Check if 25 can be 
            // returned to customer. 
            if (c25 == 0) 
                break; 
            c25--; 
        } 
        else
        { 
  
            // Try returning one 
            // 50 and one 25 
            if (c50 > 0 && c25 > 0)  
            { 
                c50--; 
                c25--; 
            } 
  
            // Try returning three 25 
            else if (c25 >= 3) 
                c25 -= 3; 
            else
                break; 
        } 
    } 
  
    // If the loop did not break, 
    // all the tickets were sold 
    if (i == n) 
        return true; 
    else
        return false; 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int a[] = { 25, 25, 50, 100 }; 
    int n = a.length; 
  
    if (isSellingPossible(n, a))  
    { 
        System.out.println("YES"); 
    } 
    else 
    { 
        System.out.println("NO"); 
    } 
} 
} 
  
// This code is contributed 
// by ihritik 

