

# Python 3 program to get the probability 
# of getting two consecutive heads 
  
# Function to return the probability 
# of getting two consecutive heads 
def getProbability(p, q): 
  
    p /= 100
    q /= 100
  
    # Formula derived from Bayes's theorem 
    probability = (p * p + q * q) / (p + q) 
    return probability 
  
# Driver code 
if __name__ == "__main__": 
  
    # given the probability of getting 
    # a head for both the coins 
    p = 80
    q = 40
  
    print(getProbability(p, q)) 
  
# This code is contributed  
# by ChitraNayal 

