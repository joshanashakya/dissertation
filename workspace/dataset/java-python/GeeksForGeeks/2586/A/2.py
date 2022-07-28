

# Python 3 program to find the N-th term 
# in 1, 11, 55, 239, 991, .... 
   
# Function to return the decimal value 
# of a binary number 
def binaryToDecimal(n): 
  
    num = n 
    dec_value = 0
   
    # Initializing base value to 1, i.e 2^0 
    base = 1
   
    l = len(num) 
    for i in range(l - 1,-1, -1): 
        if (num[i] == '1'): 
            dec_value += base 
        base = base * 2
   
    return dec_value 
   
# find the binary representation 
# of the N-th number in sequence 
def numberSequence(n): 
      
    # base case 
    if (n == 1): 
        return 1
   
    # answer string 
    s = "" 
   
    # add n-1 1's 
    for i in range(1, n): 
        s += '1'
   
    # add 0 
    s += '0'
   
    # add n 1's at end 
    for i in range(1,n+1): 
        s += '1'
   
    num = binaryToDecimal(s) 
   
    return num 
   
# Driver Code 
if __name__ == "__main__": 
      
    n = 4
   
    print(numberSequence(n)) 
  
# this code is contributed by ChitraNayal 

