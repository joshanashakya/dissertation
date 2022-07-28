

# Python3 implementation of 
# the approach 
  
# Function that counts 
# valid sub-strings 
def countSubStr(S, X): 
  
    cnt = 0
    N = len(S) 
      
    for i in range(0, N): 
  
        # Only take those numbers 
        # that do not start with '0'. 
        if (S[i] != '0'): 
              
            j = 1
            while((j + i) <= N): 
  
                # converting the sub-string 
                # starting from index 'i' 
                # and having length 'len' to  
                # int and checking if it is  
                # greater than X or not 
                num = int(S[i : i + j]) 
              
                if (num > X): 
                    cnt = cnt + 1
                  
                j = j + 1
          
    return cnt; 
  
# Driver code 
S = "2222"; 
X = 97; 
print(countSubStr(S, X)) 
  
# This code is contributed by ihritik 

