

# Python3 implementation of the  
# above approach  
  
# Function to calculate minimum  
# characters to replace  
def replace(A, B):  
  
    n, m = len(A), len(B)  
    count, i = 0, 0
    while i < n:  
          
        j = 0
        while j < m:  
              
            # mismatch occurs  
            if i + j >= n or A[i + j] != B[j]: 
                break
              
            j += 1
              
        # If all characters matched, i.e,  
        # there is a substring of 'a' which  
        # is same as string 'b'  
        if j == m: 
            count += 1
                  
            # increment i to index m-1 such that  
            # minimum characters are replaced  
            # in 'a'  
            i += m - 1
              
        i += 1
              
    return count  
  
# Driver Code  
if __name__ == "__main__":  
  
    str1 = "aaaaaaaa"
    str2 = "aaa"
  
    print(replace(str1 , str2))  
  
# This code is contributed by Rituraj Jain 

