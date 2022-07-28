

# Python3 program to find the minimum number of  
# binary strings to represent a number 
  
# Function to find the minimum number of  
# binary strings to represent a number 
def minBinary(n): 
    digit = [0 for i in range(3)] 
    len = 0
      
    while (n > 0): 
        digit[len] = n % 10
        len += 1
        n //= 10
      
    # Storing digits in correct order 
    digit = digit[::-1]  
  
    ans = 0
      
    # Find the maximum digit in the array 
    for i in range(len): 
        ans = max(ans, digit[i]) 
  
    print("Minimum Number of binary strings needed:", ans) 
      
    # Traverse for all the binary strings 
    for i in range(1, ans + 1, 1): 
        num = 0
        for j in range(0, len, 1): 
              
            # If digit at jth position is greater  
            # than 0 then substitute 1 
            if (digit[j] > 0): 
                num = num * 10 + 1
                digit[j] -= 1
            else: 
                num *= 10
        print(num, end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 564
      
    minBinary(n) 
      
# This code is contributed by 
# Surendra_Gangwar 

