

# Python3 code to check if a number  
# can be written as sum of three 
# consecutive integer. 
  
# function to check if a number  
# can be written as sum of three 
# consecutive integers. 
def checksum(n): 
    n = int(n) 
      
    # if n is multiple of 3 
    if n % 3 == 0: 
        print(int(n / 3 - 1) ," ", 
         int(n / 3)," ",int(n / 3 + 1)) 
      
    # else print "-1". 
    else: 
        print("-1") 
          
# Driver Code 
n = 6
checksum(n) 
  
# This code is contributed by "Sharad_Bhardwaj". 

