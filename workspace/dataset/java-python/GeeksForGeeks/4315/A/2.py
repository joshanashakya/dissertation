

# Python3 program to print Step Pattern 
import math as mt  
  
# function to print the steps 
def steps(string, n): 
      
    # declare a flag 
    flag = False
    x = 0
  
    # traverse through all the characters 
    # in the string 
    for i in range(len(string)): 
  
        # if the x value is 0.. then 
        # we must increment till n ... 
        # set flag to true 
        if (x == 0): 
            flag = True
  
        # if the x value is n-1 then 
        # we must decrement till 0 ... 
        # set flag as false 
        if (x == n - 1): 
            flag = False
  
        # print x *s 
        for j in range(x): 
            print("*", end = "") 
  
        print(string[i]) 
  
        # checking whether to 
        # increment or decrement x 
        if (flag == True): 
            x += 1
        else: 
            x -= 1
  
# Driver code 
  
# Get the String and the number n 
n = 4
string = "GeeksForGeeks"
  
print("String: ", string) 
print("Max Length of Steps: ", n) 
  
# calling the function 
steps(string, n) 
  
# This code is contributed 
# by Mohit kumar 29 

