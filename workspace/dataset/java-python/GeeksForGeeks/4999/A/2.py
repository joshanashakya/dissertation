

# Python3 program to find distinct 
# elements in suffix 
  
# Function to answer queries for distinct 
# count in Suffix 
def printQueries(n, a, q, qry): 
  
    # Set to keep the distinct elements 
    occ = dict() 
  
    suffixCount = [0 for i in range(n + 1)] 
  
    # Precompute the answer for each suffix 
    for i in range(n - 1, -1, -1): 
        occ[a[i]] = 1
        suffixCount[i + 1] = len(occ) 
  
    # Print the precomputed answers 
    for i in range(q): 
        print(suffixCount[qry[i]]) 
  
# Driver Code 
n = 5
q = 3
a = [2, 4, 6, 10, 2] 
qry = [1, 3, 2] 
  
printQueries(n, a, q, qry) 
  
# This code is contributed by Mohit Kumar 29 

