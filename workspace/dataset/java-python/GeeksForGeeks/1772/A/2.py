

# Python3 program to find sum of numbers  
# from 1 to N 
# which are divisible by 3 or 4 
  
# Function to calculate the sum  
# of numbers divisible by 3 or 4  
def sum(N): 
  
    global S1,S2,S3 
  
    S1 = (((N // 3)) * 
         (2 * 3 + (N //3 - 1) * 3) //2) 
    S2 = (((N // 4)) * 
         (2 * 4 + (N // 4 - 1) * 4) // 2) 
    S3 = (((N // 12)) * 
         (2 * 12 + (N // 12 - 1) * 12) // 2) 
  
    return int(S1 + S2 - S3) 
  
if __name__=='__main__': 
    N = 12
    print(sum(N)) 
  
# This code is contributed by Shrikant13 

