

# Python3 program to split the given string into odds  
  
# Function to check whether a string  
# is an odd number or not  
def checkOdd(number): 
    n = len(number) 
    num = ord(number[n - 1]) - 48
    return (num & 1) 
  
# A function to find the minimum  
# number of segments the given string  
# can be divided such that every  
# segment is a odd number  
def splitIntoOdds(number):  
    numLen = len(number) 
      
    # Declare a splitdp[] array  
    # and initialize to -1  
    splitDP = [-1 for i in range(numLen + 1)]  
  
    # Build the DP table in  
    # a bottom-up manner  
    for i in range(1, numLen + 1):  
  
        # Initially Check if the entire prefix is odd  
        if (i <= 9 and checkOdd(number[0:i]) > 0):  
            splitDP[i] = 1
  
        # If the Given Prefix can be split into Odds  
        # then for the remaining string from i to j  
        # Check if Odd. If yes calculate  
        # the minimum split till j  
        if (splitDP[i] != -1): 
            for j in range(1, 10): 
                if(i + j > numLen): 
                    break; 
  
                # To check if the substring from i to j  
                # is a odd number or not  
                if (checkOdd(number[i:i + j])): 
                      
                    # If it is an odd number,  
                    # then update the dp array  
                    if (splitDP[i + j] == -1): 
                        splitDP[i + j] = 1 + splitDP[i]  
                    else: 
                        splitDP[i + j] = min(splitDP[i + j], 1 + splitDP[i]) 
  
    # Return the minimum number of splits  
    # for the entire string  
    return splitDP[numLen] 
  
# Driver code  
print(splitIntoOdds("123456789123456789123")) 
  
# This code is contributed by Sanjit_Prasad 

