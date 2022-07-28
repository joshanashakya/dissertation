

// Java program to schedule jobs so that 
// each server gets equal load. 
class GFG  
{ 
  
// Function to find new array a 
static int solve(int a[], int b[], int n) 
{ 
    int i; 
    int s = 0; 
  
    // find sum S of both arrays a and b. 
    for (i = 0; i < n; i++)  
        s += (a[i] + b[i]);  
  
    // Single element case. 
    if (n == 1) 
        return a[0] + b[0]; 
  
    // This checks whether sum s can be divided 
    // equally between all array elements. i.e. 
    // whether all elements can take equal value 
    // or not. 
    if (s % n != 0) 
        return -1; 
  
    // Compute possible value of new array  
    // elements. 
    int x = s / n; 
  
    for (i = 0; i < n; i++)  
    { 
  
        // Possibility 1 
        if (a[i] > x)  
            return -1;      
  
        // ensuring that all elements of  
        // array b are used. 
        if (i > 0)  
        { 
            a[i] += b[i - 1]; 
            b[i - 1] = 0; 
        } 
  
        // If a(i) already updated to x  
        // move to next element in array a. 
        if (a[i] == x) 
            continue; 
  
        // Possibility 2 
        int y = a[i] + b[i]; 
        if (i + 1 < n) 
            y += b[i + 1]; 
        if (y == x)  
        { 
            a[i] = y; 
            b[i]= 0; 
            continue; 
        } 
  
        // Possibility 3 
        if (a[i] + b[i] == x)  
        { 
            a[i] += b[i]; 
            b[i] = 0; 
            continue; 
        } 
  
        // Possibility 4 
        if (i + 1 < n &&  
            a[i] + b[i + 1] == x)  
        { 
            a[i] += b[i + 1]; 
            b[i + 1] = 0; 
            continue; 
        } 
  
        // If a(i) can not be made equal  
        // to x even after adding all  
        // possible elements from b(i)  
        // then print -1. 
        return -1; 
    } 
  
    // check whether all elements of b  
    // are used. 
    for (i = 0; i < n; i++)  
        if (b[i] != 0) 
            return -1;  
  
    // Return the new array element value. 
    return x; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 6, 14, 21, 1 }; 
    int b[] = { 15, 7, 10, 10 }; 
    int n = a.length; 
    System.out.println(solve(a, b, n)); 
} 
}  
  
// This code contributed by Rajput-Ji 

