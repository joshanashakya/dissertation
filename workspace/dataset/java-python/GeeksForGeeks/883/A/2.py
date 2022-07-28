

# Python3 program to perform K operations upon 
# the string and find the modified string 
  
# Function to perform K operations upon 
# the string and find modified string 
def ReverseComplement(s,n,k): 
    # Number of reverse operations 
    rev = (k + 1) // 2
  
    # Number of complement operations 
    complment = k - rev 
  
    # If rev is odd parity 
    if (rev % 2): 
        s = s[::-1] 
  
    # If complment is odd parity 
    if (complment % 2): 
        for i in range(n): 
            # Complementing each position 
            if (s[i] == '0'): 
                s[i] = '1'
            else: 
                s[i] = '0'
  
    # Return the modified string 
    return s 
  
# Driver Code 
if __name__ == '__main__': 
    str1 = "10011"
    k = 5
    n = len(str1) 
  
    # Function call 
    print(ReverseComplement(str1, n, k)) 
  
# This code is contributed by Surendra_Gangwar 

