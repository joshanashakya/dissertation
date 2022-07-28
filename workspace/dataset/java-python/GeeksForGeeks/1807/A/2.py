

# Python3 implementation of the above approach 
  
# Returns true if the number passed as  
# the argument is a balanced number.  
def isNumBalanced(N):  
  
    st = str(N)  
    isBalanced = True
  
    # Frequency array to store the frequencies 
    # of all the digits of the number  
    freq = [0] * 10
    n = len(st)  
  
    for i in range(0, n):  
  
        # store the frequency of the  
        # current digit  
        freq[int(st[i])] += 1
  
    for i in range(0, 9):  
  
        # if freq[i] is not equal to  
        # freq[i + 1] at any index 'i' 
        # then set isBalanced to false  
        if freq[i] != freq[i + 1]:  
            isBalanced = False
  
    # Return true if the string  
    # is balanced  
    if isBalanced:  
        return True
    else: 
        return False
  
# Driver code  
if __name__ == "__main__":  
      
    N = 1234567890
    flag = isNumBalanced(N)  
  
    if flag:  
        print("YES")  
    else: 
        print("NO")  
      
# This code is contributed by Rituraj Jain 

