

# Python3 implementation to print the pattern  
  
# Function definition  
def pattern(min_stars, p_height):  
  
    p_space = p_height - 1
    x = 1
  
    # for loop for height of pyramid  
    for i in range(0 ,p_height) :  
  
        # for loop for spaces  
        for j in range(p_space,i ,-1) : 
            print(" " ,end="") 
          
  
        # for loop for printing  
        # left pyramid  
        for k in range(0 ,min_stars) :  
            print("*" ,end="") 
  
        # for loop for spaces in middle  
        for n in range ((p_height + p_height - 2), x-1,-1) : 
            print(" " ,end="") 
  
        # for loop for printing  
        # right pyramid  
        for k in range(0 ,min_stars) :  
            print("*" ,end="") 
  
        min_stars = min_stars + 2
        x = x + 2
        print("") 
  
# Driver code  
# change value to set minimun  
# number of stars in pyramid  
if __name__=='__main__': 
    min_stars = 1
  
# change value to increase or  
# decrease size of pyramid  
    p_height = 5
  
# function calling  
    pattern(min_stars, p_height)  
  
# this code is contributed by Smitha Dinesh Semwal 

