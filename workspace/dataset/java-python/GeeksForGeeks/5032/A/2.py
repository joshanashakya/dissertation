

# Python 3 program to find the  
# smallest permutaion 
  
# Function to print the smallest 
# permutation 
def smallestPermute( n): 
  
    res = [""] * (n + 1) 
      
    # when n is even 
    if (n % 2 == 0) : 
        for i in range(n): 
            if (i % 2 == 0): 
                res[i] = chr(48 + i + 2) 
            else: 
                res[i] = chr(48 + i) 
  
    # when n is odd 
    else : 
        for i in range(n - 2 ): 
            if (i % 2 == 0): 
                res[i] = chr(48 + i + 2) 
            else: 
                res[i] = chr(48 + i) 
          
        # handling last 3 digit 
        res[n - 1] = chr(48 + n - 2) 
        res[n - 2] = chr(48 + n) 
        res[n - 3] = chr(48 + n - 1) 
  
    # add EOL and print result 
    res = ''.join(res) 
    return res 
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 7
    print(smallestPermute(n)) 
  
# This code is contributed by ita_c 

