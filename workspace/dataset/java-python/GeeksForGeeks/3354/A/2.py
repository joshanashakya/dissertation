

    
# Function to find maximum  
# length of normal substrings  
def maxNormalSubstring(P, Q, K, N):  
      
    if (K == 0): 
        return 0 
    
    # keeps count of normal characters  
    count = 0 
    
    # indexes of substring  
    left, right = 0, 0
      
    # maintain length of longest substring  
    # with at most K normal characters  
    ans = 0
    
    while (right < N): 
    
        while (right < N and count <= K): 
    
            # get position of character  
            pos = ord(P[right]) - ord('a')  
    
            # check if current character is normal  
            if (Q[pos] == '0'): 
    
                # check if normal characters  
                # count exceeds K  
                if (count + 1 > K): 
                    break
                else: 
                    count += 1 
    
            right += 1 
    
            # update answer with substring length  
            if (count <= K): 
                ans = max(ans, right - left) 
    
        while (left < right):  
    
            # get position of character  
            pos = ord(P[left]) - ord('a') 
    
            left += 1
    
            # check if character is  
            # normal then decrement count  
            if (Q[pos] == '0'): 
                count -= 1 
    
            if (count < K): 
                break 
    
    return ans 
    
# Driver code  
if(__name__ == "__main__"): 
    # initialise the string  
    P = "giraffe"
    Q = "01111001111111111011111111"
    
    K = 2
    
    N = len(P)  
    
    print(maxNormalSubstring(P, Q, K, N))  
  
# This code is contributed by skylags 

