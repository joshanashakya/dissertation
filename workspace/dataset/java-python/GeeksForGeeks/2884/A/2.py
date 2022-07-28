

# Python3 program to count number of 
# ways we can spell a number 
  
# Function to calculate all possible  
# spells of a number with repeated  
# digits num --> string which is  
# favourite number 
def spellsCount(num): 
  
    n = len(num); 
  
    # final count of total 
    # possible spells 
    result = 1; 
  
    # iterate through complete 
    # number 
    i = 0; 
    while(i<n): 
      
        # count contiguous frequency  
        # of particular digit num[i] 
        count = 1; 
        while (i < n - 1 and 
               num[i + 1] == num[i]): 
      
            count += 1; 
            i += 1; 
  
        # Compute 2^(count-1) and 
        # multiply with result  
        result = result * int(pow(2, count - 1)); 
        i += 1; 
    return result; 
  
# Driver Code 
num = "11112"; 
print(spellsCount(num)); 
  
# This code is contributed 
# by mits 

