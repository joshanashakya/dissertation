

# Python3 implementation to find the character in 
# first that is present at minimum index 
# in second String 
  
# function to find the minimum index character 
def printMinIndexChar(Str, patt): 
  
    # to store the index of character having 
    # minimum index 
    minIndex = 10**9
  
    # lengths of the two Strings 
    m =len(Str) 
    n =len(patt) 
  
    # traverse 'patt' 
    for i in range(n): 
  
        # for each character of 'patt' traverse 'Str' 
        for j in range(m): 
  
            # if patt[i] is found in 'Str', check if 
            # it has the minimum index or not. If yes, 
            # then update 'minIndex' and break 
            if (patt[i] == Str[j] and j < minIndex): 
                minIndex = j 
                break
  
  
  
  
    # print the minimum index character 
    if (minIndex != 10**9): 
        print("Minimum Index Character = ",Str[minIndex]) 
  
    # if no character of 'patt' is present in 'Str' 
    else: 
        print("No character present") 
  
  
# Driver code 
  
Str = "geeksforgeeks"
patt = "set"
printMinIndexChar(Str, patt) 
  
# This code is contributed by mohit kumar 29 

