

# Python3 program to count ordered pairs of  
# positive numbers such that their  
# sum is S and XOR is K  
  
# Function to count ordered pairs of  
# positive numbers such that their  
# sum is S and XOR is K  
def countPairs(s,K): 
    if(K>s or (s-K)%2==1): 
        return 0
          
    # Calculate set bits in k 
    setBits=(str(bin(K))[2:]).count("1") 
  
    # Calculate pairs 
    pairsCount = pow(2,setBits) 
  
    # If s = k, subtract 2 from result 
    if(s==K): 
        pairsCount-=2
  
    return pairsCount 
  
# Driver code 
if __name__=='__main__': 
    s,K=9,5
    print(countPairs(s,K)) 
  
# This code is contributed by  
# Indrajit Sinha. 

