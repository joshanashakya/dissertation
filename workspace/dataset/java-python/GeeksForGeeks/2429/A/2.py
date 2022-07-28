

# Python3 implementation of  
# above approach 
  
# Function to calculate the sum  
# of numbers divisible by 2 or 7  
def sum(N):  
      
    S1 = ((N // 2)) * (2 * 2 + (N // 2 - 1) * 2) // 2
    S2 = ((N // 7)) * (2 * 7 + (N // 7 - 1) * 7) // 2
    S3 = ((N // 14)) * (2 * 14 + (N // 14 - 1) * 14) // 2
  
    return S1 + S2 - S3 
  
  
# Driver code  
if __name__=='__main__': 
    N = 20
  
    print(sum(N)) 
  
# This code is written by 
# Sanjit_Prasad 

