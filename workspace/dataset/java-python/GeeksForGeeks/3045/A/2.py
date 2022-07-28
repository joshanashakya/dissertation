

# Python3 program to find the sum pf k-th 
# powers of first n natural numbers 
  
# global array to store factorials  
MAX_K = 15
fac = [1 for i in range(MAX_K)] 
  
# function to calculate the factorials  
# of all the numbers upto k 
def factorial(k): 
    fac[0] = 1
    for i in range(1, k + 2): 
        fac[i] = (i * fac[i - 1]) 
  
# function to return the binomial coeff 
def bin(a, b): 
      
    # nCr=(n!*(n-r)!)/r! 
    ans = fac[a] // (fac[a - b] * fac[b]) 
    return ans 
      
# function to return the sum of the kth  
# powers of n natural numbers 
def sumofn(n, k): 
    p = 0
    num1, temp = 1, 1
    arr = [1 for i in range(1000)] 
      
    for j in range(1, k + 1): 
          
        # when j is 1 
        if j == 1: 
            num1 = (n * (n + 1)) // 2
              
            # calculating sum(n^1) of unity powers 
            #of n storing sum(n^1) for sum(n^2) 
            arr[p] = num1 
            p += 1
              
            # if k==1 then temp is the result 
        else: 
            temp = pow(n + 1, j + 1) - 1 - n 
              
            # for finding sum(n^k) removing 1 and 
            # n*KCk from (n+1)^k 
            for s in range(1, j): 
                  
                # Removing all kC2 * sum(n^(k - 2)) 
                # + ... + kCk - 1 * (sum(n^(k - (k - 1)) 
                temp = temp - (arr[j - s - 1] * 
                               bin(j + 1, s + 1)) 
            temp = temp // (j + 1) 
              
            # storing the result for next sum  
            # of next powers of k 
            arr[p] = temp 
            p += 1
    temp = arr[p - 1] 
    return temp 
  
# Driver code 
n, k = 5, 2
factorial(k) 
print(sumofn(n, k)) 
  
# This code is contributed by Mohit kumar 29  

