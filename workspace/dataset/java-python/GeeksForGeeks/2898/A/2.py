

# Python3 program to find possible non  
# transitive triplets btw L and R 
  
# Function to return gcd of a and b 
def gcd(a, b): 
  
    if (a == 0): 
        return b; 
    return gcd(b % a, a); 
  
# function to check for gcd 
def coprime(a, b): 
  
    # a and b are coprime if 
    # their gcd is 1. 
    return (gcd(a, b) == 1); 
  
# Checks if any possible triplet  
# (a, b, c) satifying the condition 
# that (a, b) is coprime, (b, c)  
# is coprime but (a, c) isnt  
def possibleTripletInRange(L, R): 
  
    flag = False; 
    possibleA = 0; 
    possibleB = 0; 
    possibleC = 0; 
  
    # Generate and check for all  
    # possible triplets between L and R 
    for a in range(L, R + 1):  
        for b in range(a + 1, R + 1):  
            for c in range(b + 1, R + 1): 
                  
                # if we find any such triplets  
                # set flag to true 
                if (coprime(a, b) and coprime(b, c) and     
                                      coprime(a, c) == False): 
                    flag = True; 
                    possibleA = a; 
                    possibleB = b; 
                    possibleC = c; 
                    break; 
  
    # flag = True indicates that a  
    # pair exists between L and R 
    if (flag == True):  
        print("(", possibleA, ",", possibleB,  
              ",", possibleC, ") is one such",  
              "possible triplet between", L, "and", R); 
    else: 
        print("No Such Triplet exists between", 
                                  L, "and", R); 
  
# Driver Code 
  
# finding possible Triplet 
# between 2 and 10 
L = 2; 
R = 10; 
possibleTripletInRange(L, R); 
  
# finding possible Triplet  
# between 23 and 46 
L = 23; 
R = 46; 
possibleTripletInRange(L, R); 
  
# This code is contributed by mits 

