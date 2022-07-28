

# Python3 program to find lexicographically  
# smallest string such that count of subsequence  
# 'xy' and 'yx' is p and q respectively.  
  
# Function to check if answer exits  
def check(s, p, q):  
      
    global nx 
    global ny 
      
    # count total 'x' and 'y' in string  
    for i in range(0, len(s)):  
        if s[i] == 'x':  
            nx += 1
        else: 
            ny += 1
  
    # condition to check existence of answer  
    if nx * ny != p + q:  
        return 1
    else: 
        return 0
  
# Function to find lexicographically  
# smallest string  
def smallestPermutation(s, p, q):  
  
    # check if answer exist or not  
    if check(s, p, q) == 1: 
        return "Impossible"
  
    s = sorted(s) 
    a, b, i = nx * ny, 0, 0
  
    # check if count of 'xy' and 'yx' becomes  
    # equal to p and q respectively.  
    if a == p and b == q:  
        return '' . join(s)  
  
    # Repeat until answer is found.  
    while True: 
          
        # Find index of 'x' to swap with 'y'.  
        for i in range(0, len(s) - 1):  
            if s[i] == 'x' and s[i + 1] == 'y':  
                break
  
        for j in range(i, len(s) - 1):  
            if s[j] == 'x' and s[j + 1] == 'y':  
                  
                s[j], s[j + 1] = s[j + 1], s[j]  
                a -= 1 # 'xy' decrement by 1  
                b += 1 # 'yx' increment by 1  
  
                # check if count of 'xy' and 'yx' becomes  
                # equal to p and q respectively.  
                if a == p and b == q:  
                    return '' . join(s)  
  
# Driver code  
if __name__ == "__main__": 
      
    nx, ny = 0, 0
    s = "yxxyx"
    p, q = 3, 3
  
    print(smallestPermutation(s, p, q))  
      
# This code is contributed by Rituraj Jain 

