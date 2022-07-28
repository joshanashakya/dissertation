

# Python3 program to count number from 1 to n  
# with 0 as a digit.  
  
# Returns count of integers having zero  
# upto given digits  
def zeroUpto(digits): 
      
    first = int((pow(10, digits) - 1) / 9);  
    second = int((pow(9, digits) - 1) / 8);  
    return 9 * (first - second);  
  
# counts numbers having zero as digits  
# upto a given number 'num'  
def countZero(num):  
      
    # k denoted the number of digits  
    # in the number  
    k = len(num);  
  
    # Calculating the total number having   
    # zeros, which upto k-1 digits  
    total = zeroUpto(k - 1);  
  
    # Now let us calculate the numbers which  
    # don't have any zeros. In that k digits  
    # upto the given number  
    non_zero = 0;  
    for i in range(len(num)):  
          
        # If the number itself contains a zero   
        # then decrement the counter  
        if (num[i] == '0'): 
            non_zero -= 1; 
            break;  
  
        # Adding the number of non zero numbers   
        # that can be formed  
        non_zero += (((ord(num[i]) - ord('0')) - 1) * 
                                (pow(9, k - 1 - i)));  
  
    no = 0;  
    remaining = 0;  
    calculatedUpto = 0;  
  
    # Calculate the number and the remaining  
    # after ignoring the most significant digit  
    for i in range(len(num)):  
        no = no * 10 + (ord(num[i]) - ord('0'));  
        if (i != 0):  
            calculatedUpto = calculatedUpto * 10 + 9;  
      
    remaining = no - calculatedUpto;  
  
    # Final answer is calculated. It is calculated   
    # by subtracting 9....9 (d-1) times from no.  
    ans = zeroUpto(k - 1) + (remaining - non_zero - 1);  
    return ans;  
  
# Driver Code  
num = "107";  
print("Count of numbers from 1 to",  
        num, "is", countZero(num));  
  
num = "1264";  
print("Count of numbers from 1 to",  
       num, "is", countZero(num));  
  
# This code is contributed by mits  

