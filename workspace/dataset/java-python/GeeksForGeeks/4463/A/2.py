

# Program to implement involutory matrix. 
N = 3; 
  
# Function for matrix multiplication. 
def multiply(mat, res): 
  
    for i in range(N):  
        for j in range(N): 
            res[i][j] = 0; 
            for k in range(N): 
                res[i][j] += mat[i][k] * mat[k][j]; 
    return res; 
  
# Function to check involutory matrix. 
def InvolutoryMatrix(mat): 
  
    res=[[0 for i in range(N)]  
            for j in range(N)]; 
  
    # multiply function call. 
    res = multiply(mat, res); 
  
    for i in range(N):  
        for j in range(N): 
            if (i == j and res[i][j] != 1): 
                return False; 
            if (i != j and res[i][j] != 0): 
                return False; 
    return True; 
  
# Driver Code 
mat = [[1, 0, 0], [0, -1, 0], [0, 0, -1]]; 
  
# Function call. If function  
# return true then if part  
# will execute otherwise 
# else part will execute. 
if (InvolutoryMatrix(mat)): 
    print("Involutory Matrix"); 
else: 
    print("Not Involutory Matrix"); 
  
# This code is contributed by mits 

