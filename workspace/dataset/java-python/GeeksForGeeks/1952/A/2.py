

# Python3 code to print all subsets  
# of {1, 2, 3, …n} without using 
# array or loop, just recursion. 
  
# This recursive function calls subset 
# function to print the subsets one by one.  
# numBits --> number of bits needed to  
# represent the number (simply input value n). 
# num --> Initially equal to 2 ^ n - 1 and  
# decreases by 1 every recursion until 0. 
def printSubsets(numOfBits, num): 
      
    if num >= 0: 
        print("{", end = " ") 
  
        # Print the subset corresponding to  
        # binary representation of num. 
        subset(numOfBits-1, num, numOfBits) 
        print("}") 
  
        # Call the function recursively to  
        # print the next subset. 
        printSubsets(numOfBits, num-1) 
          
    else: 
        return
  
# This function recursively prints the  
# subset corresponding to the binary  
# representation of num. 
# nthBit --> nth bit from right side  
# starting from n and decreases until 0. 
def subset(nthBit, num, numOfBits): 
      
    if nthBit >= 0: 
          
        # Print number in given subset only 
        # if the bit corresponding to it  
        # is set in num. 
        if num & (1 << nthBit) != 0: 
            print(numOfBits - nthBit, end = " ") 
          
        # Check for the next bit  
        subset(nthBit-1, num, numOfBits) 
          
    else: 
        return
  
# Driver Code     
n = 4
printSubsets(n, 2**n - 1) 

