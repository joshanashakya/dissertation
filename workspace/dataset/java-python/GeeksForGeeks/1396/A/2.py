

# Python3 program to find 
# the XOR equals OR count 
  
# Function to calculate count 
# of numbers with XOR equals OR 
def xorEqualsOrCount(N) : 
  
    # variable to store 
    # count of unset bits 
    count = 0
  
    while(N > 0) : 
  
        bit = N % 2
  
        if bit == 0 : 
            count += 1
  
        N //= 2
  
    return int(pow(2, count)) 
  
# Driver code      
if __name__ == "__main__" : 
  
    N = 7
    print(xorEqualsOrCount(N)) 
                  
# This code is contributed by  
# ANKITRAI1 

