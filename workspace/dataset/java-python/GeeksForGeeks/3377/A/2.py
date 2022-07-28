

# Python3 implementation of  
# the approach  
  
# Function to return factorial  
# of the number passed as argument  
def fact(n) : 
  
    result = 1
  
    for i in range(1, n + 1) : 
        result *= i 
  
    return result 
  
# Function to get the total permutations  
# which satisfy the given condition  
def getResult(string, ch): 
  
    # Create has to store count  
    # of each character 
    has = [0] * 26
  
    # Store character occurrences  
    for i in range(len(string)) : 
        has[ord(string[i]) - ord('A')] += 1
  
    # Count number of times  
    # Particular character comes  
    particular = has[ord(ch) - ord('A')] 
  
    # If particular character isn't  
    # present in the string then return 0 
    if particular == 0 : 
        return 0
  
    # Remove count of particular character  
    has[ord(ch) - ord('A')] = 0
  
    # Total length  
    # of the string  
    total = len(string) 
  
    # Assume all occurrences of  
    # particular character as a  
    # single character.  
    total = total - particular + 1
  
    # Compute factorial of the length  
    result = fact(total) 
  
    # Divide by the factorials of  
    # the no. of occurrences of all  
    # the characters.  
    for i in range(26) : 
  
        if has[i] > 1 : 
            result /= fact(has[i]) 
  
    # return the result  
    return result 
  
  
# Driver code 
if __name__ == "__main__" : 
  
    string = "MISSISSIPPI"
  
    # Assuming the string and the character  
    # are all in uppercase  
    print(getResult(string,'S')) 
  
# This code is contributed  
# by ANKITRAI1 

