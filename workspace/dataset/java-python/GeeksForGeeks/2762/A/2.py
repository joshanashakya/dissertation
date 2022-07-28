

# Python3 implementation of the approach 
MAX = 64
  
# Function to return the bitmask 
# for the string 
def getBitmask(s): 
  
    temp = 0
    for j in range(len(s)): 
        if (s[j] == 's'): 
            temp = temp | 1
        elif (s[j] == 't'): 
            temp = temp | 2
        elif (s[j] == 'r'): 
            temp = temp | 4
        elif (s[j] == 'i'): 
            temp = temp | 8
        elif (s[j] == 'n'): 
            temp = temp | 16
        elif (s[j] == 'g'): 
            temp = temp | 32
  
    return temp 
  
# Function to return the count of pairs 
def countPairs(arr, n): 
  
    # bitMask[i] will store the count of strings 
    # from the array whose bitmask is i 
    bitMask = [0 for i in range(MAX)] 
  
    for i in range(n): 
        bitMask[getBitmask(arr[i])] += 1
  
    # To store the count of pairs 
    cnt = 0
    for i in range(MAX): 
        for j in range(i, MAX): 
  
            # MAX - 1 = 63 i.e. 111111 in binary 
            if ((i | j) == (MAX - 1)): 
  
                # arr[i] cannot make s pair with itself 
                # i.e. (arr[i], arr[i]) 
                if (i == j): 
                    cnt += ((bitMask[i] * 
                             bitMask[i] - 1) // 2) 
                else: 
                    cnt += (bitMask[i] * bitMask[j]) 
              
    return cnt 
  
# Driver code 
arr = ["strrr", "strring", "gstrin"] 
n = len(arr) 
print(countPairs(arr, n)) 
  
# This code is contributed by mohit kumar 

