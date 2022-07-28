

# Python3 implementation of the approach 
  
# Function to print the pair that 
# gives maximum nCr 
def printMaxValPair(v, n): 
  
    v.sort() 
  
    # This gives the value of N in nCr 
    N = v[n - 1] 
  
    # Case 1 : When N is odd 
    if N % 2 == 1:  
        first_maxima = N // 2
        second_maxima = first_maxima + 1
        ans1, ans2 = 3 * (10 ** 18), 3 * (10 ** 18) 
        from_left, from_right = -1, -1
        _from = -1
        for i in range(0, n):  
            if v[i] > first_maxima:  
                _from = i 
                break
              
            else: 
                diff = first_maxima - v[i] 
                if diff < ans1:  
                    ans1 = diff 
                    from_left = v[i] 
                  
        from_right = v[_from] 
        diff1 = first_maxima - from_left 
        diff2 = from_right - second_maxima 
  
        if diff1 < diff2: 
            print(N, from_left) 
        else: 
            print(N, from_right) 
  
    # Case 2 : When N is even 
    else: 
        maxima = N // 2
        ans1 = 3 * (10 ** 18) 
        R = -1
        for i in range(0, n - 1):  
            diff = abs(v[i] - maxima) 
            if diff < ans1:  
                ans1 = diff 
                R = v[i] 
              
        print(N, R) 
  
# Driver code 
if __name__ == "__main__": 
  
    v = [1, 1, 2, 3, 6, 1]  
    n = len(v) 
    printMaxValPair(v, n) 
  
# This code is contributed by  
# Rituraj Jain 

