

# Python3 code to find the number of consecutive zero 
# at the end after multiplying n numbers 
  
# Function to count two's factor 
def two_factor( n ): 
  
    # Count number of 2s present in n 
    twocount = 0
    while n % 2 == 0: 
        twocount+=1
        n =int( n / 2) 
    return twocount 
      
# Function to count five's factor 
def five_factor( n ): 
    fivecount = 0
    while n % 5 == 0: 
        fivecount+=1
        n = int(n / 5) 
    return fivecount 
  
# Function to count number of zeros 
def find_con_zero( arr, n ): 
    twocount = 0
    fivecount = 0
    for i in range(n): 
  
        # Count the two's factor of n number 
        twocount += two_factor(arr[i]) 
          
        # Count the five's factor of n number 
        fivecount += five_factor(arr[i]) 
      
    # Return the minimum 
    if twocount < fivecount: 
        return twocount 
    else: 
        return fivecount 
  
# Driver Code 
arr = [ 100, 10, 5, 25, 35, 14 ] 
n = 6
print(find_con_zero(arr, n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

