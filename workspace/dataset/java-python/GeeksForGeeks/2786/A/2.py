

# Python3 program to prthe digital 
# roots of a number 
  
# Function to return dig-sum 
def summ(n): 
    if (n == 0): 
        return 0; 
    if(n % 9 == 0): 
        return 9; 
    else: 
        return (n % 9); 
  
# Function to prthe Digital Roots 
def printDigitalRoot(n): 
  
    # store the largest digital roots 
    maxi = 1; 
    dig = 1; 
  
    # Iterate till sqrt(n) 
    for i in range(1, int(pow(n, 1/2) + 1)): 
  
        # if i is a factor 
        if (n % i == 0): 
              
            # get the digit sum of both 
            # factors i and n/i 
            d1 = summ(n / i); 
            d2 = summ(i); 
  
            # if digit sum is greater 
            # then previous maximum 
            if (d1 > maxi): 
                dig = n / i; 
                maxi = d1; 
              
            # if digit sum is greater 
            # then previous maximum 
            if (d2 > maxi): 
                dig = i; 
                maxi = d2; 
              
            # if digit sum is same as 
            # then previous maximum, then 
            # check for larger divisor 
            if (d1 == maxi): 
                if (dig < (n / i)): 
                    dig = n / i; 
                    maxi = d1; 
  
            # if digit sum is same as 
            # then previous maximum, then 
            # check for larger divisor 
            if (d2 == maxi): 
                if (dig < i): 
                    dig = i; 
                    maxi = d2; 
                  
    # Print the digital roots 
    print(int(dig), " ", int(maxi)); 
  
# Driver Code 
if __name__ == '__main__': 
    n = 10; 
  
    # Function call to prdigital roots 
    printDigitalRoot(n); 
      
# This code is contributed by 29AjayKumar 

