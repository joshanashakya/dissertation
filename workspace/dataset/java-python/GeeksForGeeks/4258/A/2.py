

# Python program to find all 
# permutations of a given row 
  
# Function to find all 
# permuted rows of a given row r 
def permutatedRows(mat, m, n, r): 
  
  
    # Creating an empty set 
    s=set() 
  
    # Count frequencies of 
    # elements in given row r 
    for j in range(n): 
        s.add(mat[r][j])     
  
    # Traverse through all remaining rows 
    for i in range(m): 
  
        # we do not need to check 
        # for given row r 
        if i == r: 
            continue
  
        # initialize hash i.e 
        # count frequencies 
        # of elements in row i 
        for j in range(n): 
            if mat[i][j] not in s: 
  
                # to avoid the case when last 
                # element does not match 
                j = j - 2
                break; 
        if j + 1 != n: 
            continue
        print(i) 
              
      
  
# Driver program to run the case 
m = 4
n = 4
r = 3
mat = [[3, 1, 4, 2], 
       [1, 6, 9, 3], 
       [1, 2, 3, 4], 
       [4, 3, 2, 1]] 
  
permutatedRows(mat, m, n, r) 
  
# This code is contributed 
# by Upendra Singh Bartwal. 

