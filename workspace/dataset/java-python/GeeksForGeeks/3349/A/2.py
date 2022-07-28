

# Python3 program to calculate steps 
# to remove substring 010 
# from a binary string 
  
# Function to find the minimum steps 
def minSteps(str): 
      
    count = 0
    i = 0
    while i < len(str) - 2: 
        if str[i] == '0': 
            if(str[i + 1] == '1'): 
                if(str[i + 2] == '0'): 
                      
                    # substring "010" found 
                    count = count + 1
                    i = i + 2
        i = i + 1
      
    return count 
  
# Driver code 
  
# Get the binary string 
str = "0101010"
  
# Find the minimum steps 
print(minSteps(str)) 
          
# This code is contributed  
# by Shashank_Sharma 

