

# Python3 program to replace each each element  
# with maximum of GCD of row or column. 
  
R = 3
C = 4
  
# returning the greatest common  
# divisor of two number 
def gcd(a, b): 
    if (b == 0): 
        return a 
    return gcd(b, a % b) 
  
# Finding GCD of each row and column  
# and replacing with each element with  
# maximum of GCD of row or column. 
def replacematrix(mat, n, m): 
  
    rgcd = [0] * R  
    cgcd = [0] * C 
  
    # Calculating GCD of each row and each  
    # column in O(mn) and store in arrays. 
    for i in range (n): 
        for j in range (m): 
          
            rgcd[i] = gcd(rgcd[i], mat[i][j]) 
            cgcd[j] = gcd(cgcd[j], mat[i][j]) 
  
    # Replacing matrix element 
    for i in range (n): 
        for j in range (m): 
            mat[i][j] = max(rgcd[i], cgcd[j]) 
  
# Driver Code 
if __name__ == "__main__": 
  
    m = [[1, 2, 3, 3], 
         [4, 5, 6, 6], 
         [7, 8, 9, 9]] 
  
    replacematrix(m, R, C) 
  
    for i in range(R): 
        for j in range (C): 
            print ( m[i][j], end = " ") 
        print () 
      
# This code is contributed by ita_c 

