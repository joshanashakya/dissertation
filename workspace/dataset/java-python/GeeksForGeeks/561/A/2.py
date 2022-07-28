

# An efficient Python 3 program to check  
# if binary representations of n's predecessor  
# and its 1's complement are same. 
  
# Returns true if binary representations  
# of n's predecessor and it's 1's  
# complement are same. 
def bit_check(n): 
    if ((n & (n - 1)) == 0): 
        return True
    return False
  
# Driver Code 
if __name__ == '__main__': 
    n = 14
    if(bit_check(n)): 
        print('1') 
    else: 
        print('0') 
      
# This code is contributed by 
# Surendra_Gangwar 

