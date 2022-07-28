

# Python 3 program to find count of  
# substring containing exactly K ones 
  
# method returns total number of  
# substring having K ones 
def countOfSubstringWithKOnes(s, K): 
    N = len(s) 
    res = 0
    countOfOne = 0
    freq = [0 for i in range(N + 1)] 
  
    # initialize index having  
    # zero sum as 1 
    freq[0] = 1
  
    # loop over binary characters of string 
    for i in range(0, N, 1): 
          
        # update countOfOne variable with  
        # value of ith character 
        countOfOne += ord(s[i]) - ord('0') 
  
        # if value reaches more than K,  
        # then update result 
        if (countOfOne >= K): 
              
            # add frequency of indices, having 
            # sum (current sum - K), to the result 
            res += freq[countOfOne - K] 
          
        # update freqency of one's count 
        freq[countOfOne] += 1
      
    return res 
  
# Driver code 
if __name__ == '__main__': 
    s = "10010"
    K = 1
    print(countOfSubstringWithKOnes(s, K)) 
  
# This code is contributed by 
# Surendra_Gangwar 

