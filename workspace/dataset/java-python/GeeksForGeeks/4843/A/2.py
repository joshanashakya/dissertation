

# Python3 program find Number of Even cells  
# in a Zero Matrix after Q queries  
  
# Function to find the number of  
# even cell in a 2D matrix  
def findNumberOfEvenCells(n, q, size) : 
      
    # Maintain two arrays, one for rows operation 
    # and one for column operation 
    row = [0]*n ; 
    col = [0]*n 
      
    for i in range(size) : 
        x = q[i][0]; 
        y = q[i][1]; 
          
        # Increment operation on row[i] 
        row[x - 1] += 1; 
          
        # Increment operation on col[i] 
        col[y - 1] += 1; 
          
    r1 = 0; 
    r2 = 0; 
    c1 = 0; 
    c2 = 0; 
      
    # Count odd and even values in 
    # both arrays and multiply them 
    for i in range(n) : 
        # Count of rows having even numbers 
        if (row[i] % 2 == 0) : 
            r1 += 1; 
              
        # Count of rows having odd numbers 
        if (row[i] % 2 == 1) : 
            r2 += 1; 
              
        # Count of columns having even numbers 
        if (col[i] % 2 == 0) : 
            c1 +=1; 
              
        # Count of columns having odd numbers 
        if (col[i] % 2 == 1) : 
            c2 += 1; 
              
    count = r1 * c1 + r2 * c2; 
      
    return count;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 2;  
    q = [ [ 1, 1 ],  
            [ 1, 2 ],  
            [ 2, 1 ] ];  
  
    size = len(q);  
      
    print(findNumberOfEvenCells(n, q, size));  
  
# This code is contributed by AnkitRai01 

