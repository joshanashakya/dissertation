

# Python implementation of the 
# approach 
  
# Function to print all pairs 
# with equal sum 
def pairWithEqualSum(A, n):  
    mp = {}  
  
    # Insert all unique pairs and their 
    # corresponding sum in the map 
  
    for i in range(n): 
        for j in range(i+1,n): 
            if A[i]+A[j] in mp: 
                mp[A[i]+A[j]].append((A[i], A[j])) 
            else: 
                mp[A[i]+A[j]] = [ (A[i],A[j]) ] 
  
  
    # Traverse the map mp, and for sum 
    # with more than one pair, print all pairs 
    # and the corresponding sum 
      
    for itr in mp:  
        if len(mp[itr]) > 1:  
            print("Pairs : ", end = "")  
            for i in range(0, len(mp[itr])):  
                print("(", mp[itr][i][0], ",",  
                    mp[itr][i][1], ")", end = " ")  
              
            print("have sum :", itr)  
  
# Driver Code  
if __name__ == "__main__": 
  
    A = [6, 4, 12, 10, 22, 54,  
        32, 42, 21, 11, 8, 2]  
    n = len(A)  
  
    pairWithEqualSum(A, n) 

