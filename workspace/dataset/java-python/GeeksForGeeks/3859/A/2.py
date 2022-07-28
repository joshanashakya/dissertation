

# Python 3 implementation of above approach 
  
# Function to print the 
# kth largest string 
def kthString(n,k): 
    total = 0
    i = 1
  
    # loop to iterate through 
    # series 
    while (total < k): 
        # total takes the position 
        # of second y 
        total = total + n - i 
  
        # i takes the position of 
        # first y 
        i += 1
  
    # calculating first y postion 
    first_y_position = i - 1
  
    # calculating second y position 
    # from first y 
    second_y_position = k - (total - n + first_y_position) 
  
    # print all x before first y 
    for j in range(1,first_y_position,1): 
        print("x",end = "") 
  
    # print first y 
    print("y",end = "") 
  
    j = first_y_position + 1
  
    # print all x between first y 
    # and second y 
    while (second_y_position > 1): 
        print("x",end = "") 
        second_y_position -= 1
        j += 1
  
    # print second y 
    print("y",end = "") 
  
    # print x which occur 
    # after second y 
    while (j < n): 
        print("x") 
        j += 1
  
# Driver code 
if __name__ == '__main__': 
    n = 5
    k = 7
    kthString(n, k) 
  
# This code is contributed by Surendra_Gangwar 

