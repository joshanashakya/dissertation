

# Python3 code to find the sum of 
# all duration in the form of MM : SS. 
  
# Print sum of all duration. 
def printSum (m, s, n ): 
    total = 0
      
    # finding total seconds 
    for i in range(n): 
        total += s[i] 
        total += (m[i] * 60) 
      
    # print the hours. 
    print(int(total / 3600) , end= " : ") 
    total %= 3600
      
    # print the minutes. 
    print(int(total / 60) , end=": ") 
    total %= 60
      
    # print the hours. 
    print(int(total)) 
  
# Driven Code 
m = [ 0, 2, 3, 2, 1 ] 
s = [ 45, 31, 11, 27, 28 ] 
n = len(m) 
printSum(m, s, n) 
  
# This code is contributed by "Sharad_Bhardwaj". 

