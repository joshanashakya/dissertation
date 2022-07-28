

# Python3 implementation of the above approach 
  
# Function to find the largest number smaller  
# than or equal to N that is divisible by k 
def findNum(N, K): 
       
    rem = N % K 
    if(rem == 0): 
        return N 
    else: 
        return N - rem 
  
# Driver code 
if __name__=='__main__': 
      
    N = 45
    K = 6
    print("Largest number smaller than or equal to" + 
           str(N) + "that is divisible by" + str(K) + 
                                "is", findNum(N, K))  
  
# This code is contributed by 
# Kirti_Mangal 

