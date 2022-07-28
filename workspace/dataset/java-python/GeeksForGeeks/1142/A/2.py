

# Python 3 program to print the final string 
# after removing all the occurrences of 
# "10" and "01" from the given binary string 
  
# Function to print the final string 
# after removing all the occurrences of 
# "10" and "01" from the given binary string 
def finalString(st): 
  
    # Variables to store the 
    # count of 1's and 0's 
    x , y = 0 , 0
  
    # Length of the string 
    n = len(st) 
  
    # For loop to count the occurrences 
    # of 1's and 0's in the string 
    for i in range( n): 
        if (st[i] == '1'): 
            x += 1
        else: 
            y += 1
  
    # To check if the count of 1's is 
    # greater than the count of 0's or not. 
    # If x is greater, then those many 1's 
    # are printed. 
    if (x > y): 
        left = 1
    else: 
        left = 0
  
    # Length of the final remaining string 
    # after removing all the occurrences 
    length = n - 2 * min(x, y); 
  
    # Printing the final string 
    for i in range(length): 
        print(left, end="") 
  
  
# Driver Code 
if __name__ == "__main__": 
    st = "010110100100000"
    finalString(st) 
  
# This code is contributed by chitranayal 
     

