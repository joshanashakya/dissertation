

# Python 3 program of the above approach 
  
# function to calculate minimum sum  
# after transformation 
def min_sum(n, k, a): 
    a.sort(reverse = False) 
  
    if (a[0] < 0): 
        return -1
      
    # no element can be reduced further 
    if (k == 0): 
          
        # if all the elements of the 
        # array are identical 
        if (a[0] == a[n - 1]): 
            return (n * a[0]) 
        else: 
            return -1
      
    else: 
        f = 0
        for i in range(1, n, 1): 
            p = a[i] - a[0] 
  
            # check if a[i] can be  
            # reduced to a[0] 
            if (p % k == 0): 
                continue
            else: 
                f = 1
                break
          
        # one of the elements cannot be reduced 
        # to be equal to the other elements 
        if (f): 
            return -1
        else: 
              
            # if k = 1 then all elements 
            # can be reduced to 1 
            if (k == 1): 
                return n 
            else: 
                return (n * (a[0] % k)) 
      
# Driver code 
if __name__ == '__main__': 
    arr = [2, 3, 4, 5] 
    K = 1
    N = len(arr) 
    print(min_sum(N, K, arr)) 
  
# This code is contributed by 
# Surendra_Gangwar 

