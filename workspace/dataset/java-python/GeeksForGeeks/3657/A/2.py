

# Python3 program to find the square root of a 
# number by using long division method 
INFINITY_ = 9999999
  
# Function to find the square root of 
# a number by using long division method 
def sqrtByLongDivision(n): 
    i = 0
    udigit, j = 0, 0 # Loop counters 
    cur_divisor = 0
    quotient_units_digit = 0
    cur_quotient = 0
    cur_dividend = 0
    cur_remainder = 0
    a = [0]*10
  
    # Dividing the number into segments 
    while (n > 0): 
        a[i] = n % 100
        n = n // 100
        i += 1
  
    # Last index of the array of segments 
    i -= 1
  
    # Start long division from the last segment(j=i) 
    for j in range(i, -1, -1): 
  
        # Initialising the remainder to the maximum value 
        cur_remainder = INFINITY_ 
          
        # Including the next segment in new dividend 
        cur_dividend = cur_dividend * 100 + a[j] 
  
        # Loop to check for the perfect square 
        # closest to each segment 
        for udigit in range(10): 
  
            # This condition is to find the 
            # divisor after adding a digit 
            # in the range 0 to 9 
            if (cur_remainder >= cur_dividend 
                                - ((cur_divisor * 10 + udigit) 
                                * udigit) 
                                and cur_dividend 
                                - ((cur_divisor * 10 + udigit) * udigit) 
                                >= 0): 
  
                # Calculating the remainder 
                cur_remainder = cur_dividend - ((cur_divisor * 10
                                                + udigit) 
                                                * udigit) 
  
                # Updating the units digit of the quotient 
                quotient_units_digit = udigit 
  
  
        # Adding units digit to the quotient 
        cur_quotient = cur_quotient * 10 + quotient_units_digit 
  
        # New divisor is two times quotient 
        cur_divisor = cur_quotient * 2
  
        # Including the remainder in new dividend 
        cur_dividend = cur_remainder 
  
    return cur_quotient 
  
# Driver code 
  
x = 1225
print(sqrtByLongDivision(x)) 
  
# This code is contributed by mohit kumar 29     

