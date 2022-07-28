

# Python3 to find largest number with  
# given conditions. 
  
# Function to find the largest number  
# with given conditions. 
def largestNum(num): 
    max_digit = -1
    max_digit_indx = -1
    l_indx = -1
    r_indx = 1
  
    # converting the number to string 
    num_in_str = list(str(num)) 
    for i in range(len(num_in_str) - 1, -1, -1): 
          
        # current digit is the largest by far 
        if int(num_in_str[r_indx]) > int(max_digit): 
            max_digit = num_in_str[i] 
            max_digit_indx = i 
            continue
  
        # best digit for swap if there is no more  
        # such situation on the left side 
        if int(num_in_str[i]) < int(max_digit): 
            l_indx = i 
            r_indx = max_digit_indx 
  
    # check for is number already in order 
    if l_indx == -1: 
        return num 
  
    num_in_str[l_indx], num_in_str[r_indx] = \ 
    num_in_str[r_indx], num_in_str[l_indx]  
  
    return int(''.join(num_in_str)) 
  
# Driver Code 
num = 789
print(largestNum(num)) 
num = 49658
print(largestNum(num)) 
num = 2135
print(largestNum(num)) 
  
# This code is contributed by Gowtham Yuvaraj 

