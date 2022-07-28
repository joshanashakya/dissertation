

# Python3 implementation of the above approach  
  
# Initial DP array  
dp = [[[[-1, -1] for i in range(64)]  
                 for j in range(64)]  
                 for k in range(64)]  
  
# Recursive function to generate  
# all combinations of bits  
def func(third, seta, setb, carry, number):  
  
    # if the state has already been visited  
    if dp[third][seta][setb][carry] != -1: 
        return dp[third][seta][setb][carry]  
  
    # find if C has no more set bits on left  
    shift = number >> third  
  
    # if no set bits are left for C  
    # and there are no set bits for A and B  
    # and the carry is 0, then  
    # this combination is possible  
    if (shift == 0 and seta == 0 and 
        setb == 0 and carry == 0):  
        return 1
  
    # if no set bits are left for C and  
    # requirement of set bits for A and B have exceeded  
    if (shift == 0 or seta < 0 or setb < 0): 
        return 0
  
    # Find if the bit is 1 or 0 at  
    # third index to the left  
    mask = shift & 1
  
    dp[third][seta][setb][carry] = 0
  
    # carry = 1 and bit set = 1  
    if (mask) and carry:  
  
        # since carry is 1, and we need 1 at  
        # C's bit position we can use 0 and 0  
        # or 1 and 1 at A and B bit position  
        dp[third][seta][setb][carry] +=\ 
                func(third + 1, seta, setb, 0, number) + \ 
                func(third + 1, seta - 1, setb - 1, 1, number)  
      
    # carry = 0 and bit set = 1  
    elif mask and not carry:  
  
        # since carry is 0, and we need 1 at C's  
        # bit position we can use 1 and 0  
        # or 0 and 1 at A and B bit position  
        dp[third][seta][setb][carry] +=\ 
                func(third + 1, seta - 1, setb, 0, number) + \ 
                func(third + 1, seta, setb - 1, 0, number)  
      
    # carry = 1 and bit set = 0  
    elif not mask and carry:  
  
        # since carry is 1, and we need 0 at C's  
        # bit position we can use 1 and 0  
        # or 0 and 1 at A and B bit position  
        dp[third][seta][setb][carry] +=\ 
                func(third + 1, seta - 1, setb, 1, number) + \ 
                func(third + 1, seta, setb - 1, 1, number)  
      
    # carry = 0 and bit set = 0  
    elif not mask and not carry:  
  
        # since carry is 0, and we need 0 at C's  
        # bit position we can use 0 and 0  
        # or 1 and 1 at A and B bit position  
        dp[third][seta][setb][carry] += \ 
                func(third + 1, seta, setb, 0, number) + \ 
                func(third + 1, seta - 1, setb - 1, 1, number)  
      
    return dp[third][seta][setb][carry]  
  
# Function to count ways  
def possibleSwaps(a, b, c):  
  
    # function call that returns the answer  
    ans = func(0, a, b, 0, c)  
    return ans  
  
# Driver Code  
if __name__ == "__main__":  
  
    x, y, c = 2, 2, 20
    print(possibleSwaps(x, y, c))  
  
# This code is contributed by Rituraj Jain 

