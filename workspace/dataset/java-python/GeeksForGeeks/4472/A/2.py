

# Python3 program to find minimum  
# speed to finish all jobs  
    
# Function to check if the person can do  
# all jobs in H hours with speed K  
def isPossible(A, n, H, K):  
   
    time = 0 
    
    for i in range(n):  
        time += (A[i] - 1) // K + 1 
    
    return time <= H  
   
   
# Function to return the minimum speed  
# of person to complete all jobs  
def minJobSpeed(A, n, H):  
   
    # If H < N it is not possible to complete  
    # all jobs as person can not move from  
    # one element to another during current hour  
    if H < n: 
        return -1 
    
    # Max element of array  
    Max = max(A)  
    
    lo, hi = 1, Max 
    
    # Use binary search to find smallest K  
    while lo < hi:   
        mi = lo + (hi - lo) // 2 
        if not isPossible(A, n, H, mi):  
            lo = mi + 1 
        else: 
            hi = mi  
       
    return lo  
   
if __name__ == "__main__":   
  
    A =  [3, 6, 7, 11] 
    H = 8 
    
    n = len(A)  
    
    # Print required maxLenwer  
    print(minJobSpeed(A, n, H))  
  
# This code is contributed by Rituraj Jain 

