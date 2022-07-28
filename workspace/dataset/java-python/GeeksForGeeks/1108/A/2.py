

# Python3 program to check if an array is  
# subarray of another array  
  
# Function to check if an array is 
# subarray of another array 
def isSubArray(A, B, n, m): 
      
    # Two pointers to traverse the arrays 
    i = 0; j = 0; 
  
    # Traverse both arrays simultaneously 
    while (i < n and j < m): 
  
        # If element matches 
        # increment both pointers 
        if (A[i] == B[j]): 
  
            i += 1; 
            j += 1; 
  
            # If array B is completely 
            # traversed 
            if (j == m): 
                return True; 
          
        # If not, 
        # increment i and reset j 
        else: 
            i = i - j + 1; 
            j = 0; 
          
    return False; 
  
# Driver Code 
if __name__ == '__main__': 
    A = [ 2, 3, 0, 5, 1, 1, 2 ]; 
    n = len(A); 
    B = [ 3, 0, 5, 1 ]; 
    m = len(B); 
  
    if (isSubArray(A, B, n, m)): 
        print("YES"); 
    else: 
        print("NO"); 
  
# This code is contributed by Rajput-Ji 

