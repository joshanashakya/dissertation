

# Python3 implementation of the approach  
  
# Function that will count  
# total hexadecimal alphabet  
def countHexadecimal(L, R) :  
    count = 0;  
    for i in range(L, R + 1) : 
  
        # All the numbers from 10 to 15  
        # contain a hexadecimal alphabet  
        if (i >= 10 and i <= 15) : 
            count += 1;  
  
        # If i > 15 then perform mod by 16  
        # repeatedly till the number is > 0  
        # If number % 16 > 10 then  
        # increase count  
        elif (i > 15) : 
            k = i;  
            while (k != 0) :  
                if (k % 16 >= 10) : 
                    count += 1;  
                k = k // 16;  
  
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
    L = 5; R = 100;  
      
    print(countHexadecimal(L, R));  
  
# This code is contributed by Ryuga 

