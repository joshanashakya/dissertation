

# Python3 program to find a non transitive  
# co-prime triplets between L and R  
  
# Checks if any possible triplet (a, b, c)  
# satifying the condition that (a, b) is 
# coprime, (b, c) is coprime but (a, c) isnt  
def possibleTripletInRange(L, R): 
  
    flag = False; 
    possibleA = 0; 
    possibleB = 0; 
    possibleC = 0; 
  
    numbersInRange = (R - L + 1); 
  
    # Case 1 : Less than 3 numbers 
    # between L and R  
    if (numbersInRange < 3): 
        flag = False; 
  
    # Case 2: More than 3 numbers  
    # between L and R  
    elif (numbersInRange > 3): 
        flag = True; 
  
        # triplets should always be of  
        # form (2k, 2k + 1, 2k + 2) 
        if ((L % 2) > 0): 
            L += 1; 
  
        possibleA = L; 
        possibleB = L + 1; 
        possibleC = L + 2; 
  
    else: 
          
        # Case 3.1: Exactly 3 numbers in range 
        #            of form (2k, 2k + 1, 2k + 2) 
        if ((L % 2) == 0): 
            flag = True; 
            possibleA = L; 
            possibleB = L + 1; 
            possibleC = L + 2; 
        else: 
              
            # Case 3.2: Exactly 3 numbers in range  
            #            of form (2k - 1, 2k, 2k + 1)  
            flag = False; 
  
    # flag = True indicates that a pair  
    # exists between L and R 
    if (flag == True): 
        print("(", possibleA, ",", possibleB,  
              ",", possibleC, ") is one such",  
              "possible triplet between", L, "and", R); 
    else: 
        print("No Such Triplet exists between",  
                                  L, "and", R); 
  
# Driver code 
  
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

