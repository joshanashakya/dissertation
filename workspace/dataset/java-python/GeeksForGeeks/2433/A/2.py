

# Python3 program to find a list of k elements from 
# an array such that difference between all of 
# them is divisible by m. 
  
# function to generate k numbers whose difference 
# is divisible by m 
def print_result(a, n, k, m): 
  
    # Using an adjacency list like representation 
    # to store numbers that lead to same 
    # remainder. 
    v = [[] for i in range(m)] 
  
    for i in range(0, n): 
  
        # stores the modulus when divided 
        # by m 
        rem = a[i] % m 
  
        v[rem].append(a[i]) 
  
        # If we found k elements which 
        # have same remainder. 
        if(len(v[rem]) == k): 
  
            for j in range(0, k): 
                print(v[rem][j], end=" ") 
            return
  
    # If we could not find k elements 
    print(-1) 
  
# driver program to test the above function 
if __name__=='__main__': 
    a = [1, 8, 4] 
    n = len(a) 
    print_result(a, n, 2, 3) 
  
# This code is contributed by 
# Sanjit_Prasad 

