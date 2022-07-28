

# Python 3 implementation of the approach 
  
# Function that returns true if the product 
# of every digit of a contiguous subsequence 
# is distinct 
def productsDistinct(N): 
       
    # To store the given number as a string 
    s = "" 
  
    # Append all the digits 
    # starting from the end 
    while (N): 
        s += chr(N % 10 + ord('0')) 
        N //= 10
  
    # Reverse the string to get 
    # the original number 
    s = s[::-1] 
  
    # Store size of the string 
    sz = len(s) 
  
    # Set to store product of 
    # each contiguous subsequence 
    se = [] 
  
    # Find product of every 
    # contiguous subsequence 
    for i in range(sz): 
        product = 1
        for j in range(i, sz, 1): 
            product *= ord(s[j]) - ord('0') 
  
            # If current product already 
            # exists in the set 
            for p in range(len(se)): 
                if se[p] == product: 
                    return False
                else: 
                    se.append(product) 
  
    return True
  
# Driver code 
if __name__ == '__main__': 
    N = 2345
  
    if (productsDistinct(N)): 
        print("Yes") 
    else: 
        print("No") 
          
# This code is contributed by 
# Surendra_Gangwar 

