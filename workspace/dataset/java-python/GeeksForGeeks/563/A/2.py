

# Python3 program to count digits after dot  
# when a number is divided by another. 
def count(x, y): 
    ans = 0 # Initialize result 
  
    m = dict() 
  
    # calculating remainder 
    while x % y != 0: 
        x %= y 
  
        ans += 1
  
        # if this remainder appeared before then 
        # the numbers are irrational and would not 
        # converge to a solution the digits after 
        # decimal will be infinite 
        if x in m: 
            return -1
  
        m[x] = 1
        x *= 10
  
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
    res = count(1, 2) 
  
    print("INF") if res == -1 else print(res) 
  
    res = count(5, 3) 
    print("INF") if res == -1 else print(res) 
  
    res = count(3, 5) 
    print("INF") if res == -1 else print(res) 
  
# This code is contributed by 
# sanjeev2552 

