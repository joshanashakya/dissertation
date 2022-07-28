

# Python3 code to find the  
# probability of search key 
# K present in 1D-array (list). 
  
# Function to find the probability 
def kPresentProbability(a, n, k) : 
  
    count = a.count(k) 
  
    # find probability upto 
    # 2 decimal places 
    return round(count / n , 2) 
  
# Driver Code 
if __name__ == "__main__" : 
      
    A = [ 4, 7, 2, 0, 8, 7, 5 ] 
    K = 2
    N = len(A) 
      
    print(kPresentProbability( A, N, K)) 
  
# This code is contributed 
# by AnkitRai1 

