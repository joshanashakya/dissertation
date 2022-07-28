

# python program to count 
# number of white hats 
  
def numOfWhiteHats(arr, n): 
  
    # Counting frequencies of 
    # all values in given 
    # array 
    freq=[0 for i in range(n + 1 + 1)] 
    for i in range(n): 
      
        # Count of White hats 
        # cannot be more than 
        # n for n persons. 
        if (arr[i] >= n): 
            return -1
        freq[arr[i]]+=1
      
   
    # Counting number of 
    # different frequencies 
    diffFreq = 0
    for i in range(n-1,-1,-1): 
        if (freq[i]): 
            diffFreq+=1
   
    # Cases where all the 
    # persons wearing white hat. 
    if (diffFreq == 1 and freq[n-1] == n): 
        return n 
   
    # Case where no one 
    # wearing white hat. 
    if (diffFreq == 1 and freq[0] == n): 
        return 0
   
    # Else : number of distinct 
    # frequency must be 2. 
    if (diffFreq != 2): 
        return -1
   
    # Finding the last frequency 
    # with non zero value. 
    # Note that we traverse 
    # from right side. 
    for k in range(n - 1, 0, -1): 
        if (freq[k]): 
            break
   
    # Checking number of k's 
    # must be n - k. 
    # And number of (k-1)'s 
    # must be k. 
    if (freq[k-1] == k and freq[k] + k == n): 
        return freq[k-1] 
    else: 
        return -1
   
# Driver code 
  
arr= [2, 2, 2, 3, 3] 
n= len(arr) 
print(numOfWhiteHats(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

