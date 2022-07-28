

# Python3 program to find the total  
# Number of Digits in (N!)^N 
  
import math as ma 
def CountDigits(n): 
  
    if(n==1): 
        return 1
    sum=0
  
    # Finding X 
    for i in range(2,n+1): 
        sum+=ma.log(i,10) 
  
    # Calculating N*X  
    sum*=n 
  
    # Floor(N*X)+1 
    #equivalent to floor(sum) + 1 
    return ma.ceil(sum)  
  
# Driver code 
if __name__=='__main__': 
    N=5
    print(CountDigits(N)) 
  
# This code is contributed by  
# Indrajit Sinha. 

