

# Python3 implementation of the approach 
N = 3
M = 7
  
# Function that prints the original matrix  
def printOriginalMatrix(a, b, mat) :  
  
    # Iterate in the row  
    for i in range(N) :  
  
        # Iterate in the column  
        for j in range(M) : 
  
            # If previously existed an element  
            if (mat[i][j] == 1) : 
                print(min(a[i], b[j]), end = " ");  
            else : 
                print(0, end = " ");  
          
        print() 
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 2, 1, 3 ] 
    b = [ 2, 3, 0, 0, 2, 0, 1 ] 
      
    mat = [[ 1, 0, 0, 0, 1, 0, 0 ],  
           [ 0, 0, 0, 0, 0, 0, 1 ],  
           [ 1, 1, 0, 0, 0, 0, 0 ]];  
              
    printOriginalMatrix(a, b, mat);  
  
# This code is contributed by Ryuga 

