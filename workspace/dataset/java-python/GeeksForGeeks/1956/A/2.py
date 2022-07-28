

# Pyhton 3 implementation of the approach 
MAX = 32
  
pow2 = [0 for i in range(MAX)] 
visited = [False for i in range(MAX)] 
ans = [] 
  
# Function to pre-calculate 
# all the powers of 2 upto MAX 
def power_2(): 
    an = 1
    for i in range(MAX): 
        pow2[i] = an 
        an *= 2
  
# Function to return the 
# count of set bits in x 
def countSetBits(x): 
    # To store the count 
    # of set bits 
    setBits = 0
    while (x != 0): 
        x = x & (x - 1) 
        setBits += 1
      
    return setBits 
  
# Function to add num to the answer 
# by setting all bit positions as 0 
# which are also 0 in K 
def add(num): 
    point = 0
    value = 0
  
    for i in range(MAX): 
        # Bit i is 0 in K 
        if (visited[i]): 
            continue
        else: 
            if (num & 1): 
                value += (1 << i) 
            num = num//2
  
    ans.append(value) 
  
# Function to find and print N distinct 
# numbers whose bitwise OR is K 
def solve(n, k): 
    # Choosing K itself as one number 
    ans.append(k) 
  
    # Find the count of set bits in K 
    countk = countSetBits(k) 
  
    # Impossible to get N 
    # distinct integers 
    if (pow2[countk] < n): 
        print(-1) 
        return
  
    count = 0
    for i in range(pow2[countk] - 1): 
        # Add i to the answer after 
        # setting all the bits as 0 
        # which are 0 in K 
        add(i) 
        count += 1
  
        # If N distinct numbers are generated 
        if (count == n): 
            break
  
    # Print the generated numbers 
    for i in range(n): 
        print(ans[i],end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 3
    k = 5
  
    # Pre-calculate all 
    # the powers of 2 
    power_2() 
  
    solve(n, k) 
      
# This code is contributed by 
# Surendra_Gangwar 

