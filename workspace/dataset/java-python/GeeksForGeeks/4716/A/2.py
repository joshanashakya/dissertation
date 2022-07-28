

# Python3 implementation of the above approach  
  
# Function to return the number of triplets  
def NoofTriplets(N, K) :  
      
    # Initializing the count array 
    cnt = [0]*K;  
  
    # Storing the frequency of each modulo class  
    for i in range(1, N + 1) : 
        cnt[i % K] += 1;  
  
    # If K is odd  
    if (K & 1) : 
        rslt = cnt[0] * cnt[0] * cnt[0];  
        return rslt 
  
    # If K is even  
    else : 
        rslt = (cnt[0] * cnt[0] * cnt[0] +
                cnt[K // 2] * cnt[K // 2] * cnt[K // 2]);  
        return rslt 
  
# Driver Code  
if __name__ == "__main__" :  
  
    N = 3; K = 2;  
  
    # Function Call  
    print(NoofTriplets(N, K));  
  
# This code is contributed by AnkitRai01 

