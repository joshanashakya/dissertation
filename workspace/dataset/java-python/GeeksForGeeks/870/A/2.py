

# Python3 code to check if a number  
# can be expressed as sum of five 
# consecutive integer. 
   
# function to check if a number  
# can be expressed as sum of five 
# consecutive integers. 
def checksum(n): 
    n = int(n) 
       
    # if n is multiple of 5 
    if n % 5 == 0: 
        print(int(n / 5 - 2), " ", 
         int(n / 5 - 1), " ", int(n / 5), " ", int(n / 5 + 1), " ", int(n / 5 + 2)) 
       
    # else print "-1". 
    else: 
        print("-1") 
           
# Driver Code 
n = 15
checksum(n) 

