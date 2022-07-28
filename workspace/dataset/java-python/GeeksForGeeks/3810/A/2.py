

# Python3 program to find sum of all odd  
# frequency elements in a Matrix  
  
# Function to find sum of all odd  
# frequency elements in a Matrix  
def sumOddOccurring(mat): 
      
    # Store frequencies of elements  
    # in matrix 
    mp = {} 
    n, m = len(mat), len(mat[0]) 
    for i in range(n): 
        for j in range(m): 
            if mat[i][j] in mp: 
                mp[mat[i][j]] = mp.get(mat[i][j]) + 1
            else: 
                mp[mat[i][j]] = 1
  
    # Sum of odd frequency elements  
    _sum = 0
    for i in range(n): 
        for j in range(m): 
            if mp.get(mat[i][j]) % 2 == 1: 
                _sum+=mat[i][j] 
    return _sum 
  
# Driver Code  
if __name__=='__main__': 
    mat=[[1,2,3],[1,3,2],[1,5,6]] 
    print(sumOddOccurring(mat)) 
  
# This code is Contributed by Vikash Kumar 37 

