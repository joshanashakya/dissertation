

# Python3 Program to check whether given 
# matrix is centrosymmetric or not. 
  
def checkCentrosymmetricted( n, m): 
  
    mid_row = 0; 
  
    # Finding the middle row  
    # of the matrix 
    if ((n & 1) > 0): 
        mid_row = n / 2 + 1; 
    else: 
        mid_row = n / 2; 
  
    # for each row upto middle row. 
    for i in range(int(mid_row)):  
  
        # If each element and  
        # its corresponding 
        # element is not equal  
        # then return false. 
        for j in range(n): 
            if (m[i][j] != m[n - i - 1][n - j - 1]): 
                return False; 
  
    return True; 
      
# Driver Code 
n = 3; 
m = [[1, 3, 5 ], 
     [ 6, 8, 6 ], 
     [ 5, 3, 1 ]]; 
  
if(checkCentrosymmetricted(n, m)): 
    print("Yes"); 
else: 
    print("No"); 
          
# This code is contributed by mits 

