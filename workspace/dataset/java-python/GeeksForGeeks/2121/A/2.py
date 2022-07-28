

# Python3 program to find the K'th minimum   
# element from an array concatenated M times  
    
# Function to find the K-th minimum element   
# from an array concatenated M times  
def KthMinValAfterMconcatenate(A, N, M, K):  
   
    V = []  
    
    for i in range(0, M):   
        for j in range(0, N):   
            V.append(A[j])  
    
    # sort the elements in ascending order  
    V.sort()  
    
    # return K'th Min element  
    # present at K-1 index  
    return V[K - 1]  
    
# Driver Code  
if __name__ == "__main__": 
   
    A = [3, 1, 2]   
    
    M, K = 3, 4 
    N = len(A)  
    
    print(KthMinValAfterMconcatenate(A, N, M, K))  
    
# This code is contributed by Rituraj Jain 

