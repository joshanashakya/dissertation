

# Python 3 program to find the number  
# with more leading zeroes. 
  
# Function to compare the no. of 
# leading zeros 
def LeadingZeros(x, y): 
      
    # if both have same no. of 
    # leading zeros 
    if ((x ^ y) <= (x & y)):  
        print("Equal") 
  
    # if y has more leading zeros 
    elif ((x & (~y)) > y) : 
        print(y) 
  
    else: 
        print(x) 
  
# Driver Code 
if __name__ == '__main__': 
    x = 10
    y = 16
    LeadingZeros(x, y) 
  
# This code is contributed  
# by Surendra_Gangwar 

