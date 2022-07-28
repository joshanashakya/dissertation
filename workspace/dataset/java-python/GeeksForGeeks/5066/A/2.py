

# Python3 implementation of the approach 
  
# Function that returns true if 
# the can be balanced 
def canBeBalanced(s, n): 
  
    # Count to check the difference between 
    # the frequencies of '(' and ')' and 
    # count_1 is to find the minimum value 
    # of freq('(') - freq(')') 
    count = 0
    count_1 = 0
  
    # Traverse the given string 
    for i in range(n): 
  
        # Increase the count 
        if (s[i] == '('): 
            count += 1
  
        # Decrease the count 
        else: 
            count -= 1
  
        # Find the minimum value 
        # of freq('(') - freq(')') 
        count_1 = min(count_1, count) 
  
    # If the minimum difference is greater 
    # than or equal to -1 and the overall 
    # difference is zero 
    if (count_1 >= -1 and count == 0): 
        return True
  
    return False
  
# Driver code 
s = "())()("
n = len(s) 
  
if (canBeBalanced(s, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

