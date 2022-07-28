

# Python3 implementation for pattern  
# searching in an array using Z-Algorithm  
import sys; 
  
# Function to calculate Z-Array  
def zArray(arr) : 
    n = len(arr);  
    z = [0]*n; 
    r = 0;  
    l = 0; 
      
    # Loop to calculate Z-Array 
    for k in range(1, n) : 
          
        # Outside the Z-box 
        if (k > r) : 
            r = l = k; 
            while (r < n and arr[r] == arr[r - l]) : 
                r += 1; 
            z[k] = r - l; 
            r -= 1; 
                  
        # Inside Z-box 
        else : 
            k1 = k - l; 
              
            if (z[k1] < r - k + 1) : 
                z[k] = z[k1]; 
                  
            else : 
                l = k; 
                while (r < n and arr[r] == arr[r - l]) : 
                    r += 1 ; 
                z[k] = r - l; 
                r -= 1; 
                      
    return z;  
  
# Helper function to merge two  
# arrays and create a single array  
def mergeArray(A,B) :  
  
    n = len(A);  
    m = len(B);  
  
    # Array to store merged array  
    c = [0]*(n + m + 1);  
  
    # Copying array B  
    for i in range(m) : 
        c[i] = B[i];  
  
    # Adding a seperator  
    c[m] = sys.maxsize;  
  
    # Copying array A  
    for i in range(n) :  
        c[m + i + 1] = A[i];  
  
    # Calling Z-function  
    z = zArray(c);  
    return z;  
  
# Function to help compute the Z array  
def findZArray( A,B, n) : 
    flag = 0; 
    z = mergeArray(A, B); 
      
    # Printing indexes where array B occur 
    for i in range(len(z)) : 
        if (z[i] == n) : 
            print(i - n - 1, end= " "); 
            flag = 1; 
              
    if (flag == 0) : 
        print("Not Found");  
  
# Driver Code  
if __name__ == "__main__" : 
      
    A = [ 1, 2, 3, 2, 3, 2]; 
    B = [ 2, 3 ]; 
    n = len(B); 
    findZArray(A, B, n);  
  
# This code is contributed by AnkitRai01 

