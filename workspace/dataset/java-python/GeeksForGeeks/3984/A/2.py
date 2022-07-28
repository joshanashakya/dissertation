

# Python3 implementation of above approach  
  
# Function to Check if it is possible to  
# convert a given array to another array  
# by adding elements to first array  
def checkconv(a, b, n) :  
  
    c = [0]*n; flag = 0;  
  
    # Create a temporary array c[]  
    # which contains the difference  
    # of the array elements  
    for i in range(n) : 
        c[i] = b[i] - a[i];  
  
    # Create a vector pair for all non zero  
    # elements of array c[n] with there index  
    idxs = [];  
    for i in range(n) : 
        if (c[i] != 0) : 
            idxs.append((i, c[i]));  
  
    # Check If the index value differs by 1  
    # and the difference value is same  
    for i in range(len(idxs) - 1) : 
        if (idxs[i + 1][0] - idxs[i][0] != 1
            or idxs[i + 1][1] != idxs[i][1]) : 
            flag = 1;  
            break;  
  
    return not flag;  
  
# Function to calculate the value of K  
def diffofarrays(a, b, n) :  
    c = [0] * n;  
    ans = 0; 
      
    for i in range(n) : 
        c[i] = b[i] - a[i]; 
          
    for i in range(n) : 
        if (c[i] != 0) : 
            ans = c[i]; 
            break; 
      
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = [ 3, 7, 1, 4, 0, 2, 2 ]; 
    B = [ 3, 7, 3, 6, 2, 2, 2 ]; 
    arr_size = len(A); 
      
    if (checkconv(A, B, arr_size)) : 
        print(diffofarrays(A, B, arr_size)); 
          
    else : 
        print("NA");  
  
# This code is contributed by AnkitRai01 

