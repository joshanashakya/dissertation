

# Python3 implementation of the above approach  
import numpy as np; 
  
matrix = np.zeros((100,100));  
  
# Function to find the square matrix  
def printRequiredMatrix(n) :  
  
    # For Matrix of order 1,  
    # it will contain only 1  
    if (n == 1) : 
        print("1");  
  
    # For Matrix of odd order,  
    # it is not possible  
    elif (n % 2 != 0) :  
        print("-1"); 
  
    # For Matrix of even order  
    else : 
        # All diagonal elements of the  
        # matrix can be N itself.  
        for i in range(n) : 
            matrix[i][i] = n;  
      
        u = n - 1;  
  
        # Assign values at desired  
        # place in the matrix  
        for i in range(n - 1) : 
  
            matrix[i][u] = i + 1;  
  
            for j in range(1, n//2) : 
  
                a = (i + j) % (n - 1);  
                b = (i - j + n - 1) % (n - 1);  
                if (a < b) : 
                    a,b = b,a 
                      
                matrix[b][a] = i + 1;  
  
        # Loop to add N in the lower half  
        # of the matrix such that it contains  
        # elements from 1 to 2*N - 1  
        for i in range(n) : 
            for j in range(i) : 
                matrix[i][j] = matrix[j][i] + n;  
  
        # Loop to print the matrix  
        for i in range(n) : 
            for j in range(n) : 
                print(matrix[i][j] ,end=" ");  
            print(); 
  
    print() 
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 1;  
    printRequiredMatrix(n);  
  
    n = 3;  
    printRequiredMatrix(n);  
  
    n = 6;  
    printRequiredMatrix(n);  
  
    # This code is contributed by AnkitRai01 

