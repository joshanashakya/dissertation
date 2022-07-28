

# Python code to convert radian to degree 
  
# Function for convertion 
def Convert(radian): 
    pi = 3.14159
    # Simply used the formula 
    degree = radian * (180/pi) 
    return degree 
  
# Driver Code 
radian = 5
print("degree =",(Convert(radian))) 

