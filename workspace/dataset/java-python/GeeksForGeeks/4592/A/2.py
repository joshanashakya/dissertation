

# Python 3 Program to determine if 
# number N of given form is  
# divisible by 3 or not  
  
# function returns true if number N  
# is divisible by 3 otherwise false,  
# dig0 - most significant digit  
# dig1 - 2nd most significant digit 
# K - number of digits  
def multipleOfThree(K, dig0, dig1): 
      
    # sum of digits 
    sum = 0
  
    # store the sum of first two digits 
    # modulo 10 in a temporary variable 
    temp = (dig0 + dig1) % 10
  
    sum = dig0 + dig1 
  
    # if the number N is a  
    # two digit number 
    if (K == 2) : 
        if (sum % 3 == 0): 
            return True
        else: 
            return False
      
  
    # add temp to sum to get the sum 
    # of first three digits which are 
    # not a part of cycle 
    sum += temp 
  
    # get the number of groups in cycle 
    numberofGroups = (K - 3) // 4
  
    # get the remaining number of digits 
    remNumberofDigits = (K - 3) % 4
  
    # add sum of 20 for each 
    # group (2, 4, 8, 6) 
    sum += (numberofGroups * 20) 
  
    # find the remaining sum of  
    # remaining digits 
    for i in range(remNumberofDigits) : 
        temp = (2 * temp) % 10
        sum += temp 
  
    # check if it is divisible  
    # by 3 or not 
    if (sum % 3 == 0): 
        return True
    else: 
        return False
  
# Driver Code 
if __name__ == "__main__": 
    K = 5
    dig0 = 3
    dig1 = 4
    if (multipleOfThree(K, dig0, dig1)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by ChitraNayal 

