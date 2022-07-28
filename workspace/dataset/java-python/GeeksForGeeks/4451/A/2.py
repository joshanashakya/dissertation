

# Python3 code to print inverse  
# pyramid pattern 
  
# function to print the following 
# inverse pyramid pattern 
def pyramid( n ): 
      
    # outer loop to handle number 
    # of rows n in this case 
    for i in range(n, 0, -1): 
          
        # inner loop to create right triangle 
        # gaps on left side of pyramid 
        for gap in range(n-1, i-1, -1): 
            print(" ", end = '') 
            print(" ", end = '') 
          
        # initializing value corresponding 
        # to 'A' ASCII value 
        num = ord('A') 
          
        # loop to print characters on 
        # left side of pyramid 
        for j in range(1, i+1): 
            print(chr(num), end = ' ') 
            num += 1
              
        # loop to print characters on 
        # right side of pyramid 
        for j in range(i - 1, -1, -1): 
            num -= 1
            print(chr(num), end = ' ') 
          
        print("\n", end = '') 
  
# Driver Code 
n = 9
pyramid(n) 
  
# This code is contributed by "Sharad_Bhardwaj". 

