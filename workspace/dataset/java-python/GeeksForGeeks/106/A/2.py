

# Python3 program to find the 
# minimum number of digits to 
# be removed to make a large  
# number divisible by 3. 
  
# function to count the  
# no of removal of digits 
# to make a very large 
# number divisible by 3 
  
def divisible(num): 
    n = len(num); 
  
    # add up all the digits of num 
    sum = 0; 
    for i in range(n): 
        sum += int(num[i]); 
  
    # if num is already is  
    # divisible by 3 then no 
    # digits are to be removed 
    if (sum % 3 == 0): 
        return 0;  
  
    # if there is single digit,  
    # then it is not possible  
    # to remove one digit. 
    if (n == 1): 
        return -1; 
  
    # traverse through the number  
    # and find out if any number  
    # on removal makes the sum  
    # divisible by 3 
    for i in range(n): 
        if (sum % 3 == int(num[i]) % 3): 
            return 1;      
  
    # if there are two numbers  
    # then it is not possible  
    # to remove two digits. 
    if (n == 2): 
        return -1;  
  
    # Otherwise we can always  
    # make a number multiple of 
    # 2 by removing 2 digits. 
    return 2; 
  
  
# Driver Code 
if __name__=='__main__': 
    num = "1234"; 
    print(divisible(num)); 
  
# This code is contributed by mits 

