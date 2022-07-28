

# Python3 code to find the Kronecker Product of two 
# matrices and stores it as matrix C 
   
# rowa and cola are no of rows and columns 
# of matrix A 
# rowb and colb are no of rows and columns 
# of matrix B 
cola = 2
rowa = 3
colb = 3
rowb = 2
   
# Function to computes the Kronecker Product 
# of two matrices 
  
def Kroneckerproduct( A , B ): 
      
    C = [[0 for j in range(cola * colb)] for i in range(rowa * rowb)] 
   
    # i loops till rowa 
    for i in range(0, rowa): 
          
        # k loops till rowb 
        for k in range(0, rowb): 
   
            # j loops till cola 
            for j in range(0, cola): 
   
                # l loops till colb 
                for l in range(0, colb): 
   
                    # Each element of matrix A is 
                    # multiplied by whole Matrix B 
                    # resp and stored as Matrix C 
                    C[i + l + 1][j + k + 1] = A[i][j] * B[k][l] 
                    print (C[i + l + 1][j + k + 1],end=' ') 
              
              
            print ("\n") 
          
  
# Driver code. 
  
A = [[0 for j in range(2)] for i in range(3)] 
B = [[0 for j in range(3)] for i in range(2)] 
  
A[0][0] = 1
A[0][1] = 2
A[1][0] = 3
A[1][1] = 4
A[2][0] = 1
A[2][1] = 0
  
B[0][0] = 0
B[0][1] = 5
B[0][2] = 2
B[1][0] = 6
B[1][1] = 7
B[1][2] = 3
  
Kroneckerproduct( A , B ) 
  
# This code is contributed by Saloni. 

