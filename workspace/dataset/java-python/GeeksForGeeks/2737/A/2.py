

# Python 3 program to construct a n  
# length string with k distinct characters  
# such that no two same characters are adjacent. 
  
# Function to find a string of length 
# n with k distinct characters. 
def findString(n, k): 
  
    # Initialize result with first k 
    # Latin letters 
    res = "" 
    for i in range(k): 
        res = res + chr(ord('a') + i) 
  
    # Fill remaining n-k letters by 
    # repeating k letters again and again. 
    count = 0
    for i in range(n - k) : 
        res = res + chr(ord('a') + count) 
        count += 1
        if (count == k): 
            count = 0; 
      
    return res 
  
# Driver code 
if __name__ == "__main__": 
      
    n = 5
    k = 2
    print(findString(n, k)) 
  
# This code is contributed by ita_c 

