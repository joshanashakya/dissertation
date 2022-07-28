

# Python 3 program to Find N digits 
# number which is divisible by D 
  
# Function to return N digits 
# number which is divisible by D 
def findNumber(n, d): 
  
    # to store answer 
    ans = "" 
  
    if (d != 10) : 
        ans += str(d) 
        for i in range(1,n): 
            ans += '0'
    else : 
        if (n == 1): 
            ans += "Impossible"
        else : 
            ans += '1'
            for i in range(1,n): 
                ans += '0'
  
    return ans 
  
# Driver code 
if __name__ == "__main__": 
    n = 12
    d = 3
  
    print(findNumber(n, d)) 
      
# This code is contributed by 
# ChitraNayal 

