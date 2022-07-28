

# Python 3 program to find a string  
# which when repeated exactly k times  
# gives a permutation of the given string 
  
# Function to return a string which  
# when repeated exactly k times gives  
# a permutation of s 
def K_String(s, k): 
  
    # size of string 
    n = len(s) 
  
    # to frequency of each character 
    fre = [0] * 26
  
    # get frequency of each character 
    for i in range(n): 
        fre[ord(s[i]) - ord('a')] += 1
  
    # to store final answer 
    str = "" 
  
    for i in range( 26) : 
  
        # check if frequency is divisible by k 
        if (fre[i] % k == 0) : 
            x = fre[i] // k 
  
            # add to answer 
            while (x) : 
                str += chr(i + ord('a')) 
                x -= 1
  
        # if frequency is not divisible by k 
        else : 
            return "-1"
  
    return str
  
# Driver code 
if __name__ == "__main__": 
      
    s = "aabb"
    k = 2
  
    # function call 
    print( K_String(s, k)) 
  
# This code is contributed  
# by ChitraNayal 

