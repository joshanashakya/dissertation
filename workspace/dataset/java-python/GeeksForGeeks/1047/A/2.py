

# Python3 program to find Sum of alternating  
# sign Squares of first N natural numbers  
  
# Fucntion to calculate  
# the alternating sign sum  
def summation(n) : 
  
    # Variable to store the sum  
    sum = 0;  
  
    # Loop to iterate each number  
    # from 1 to N  
    for i in range(1, n + 1) : 
  
        # The alternating sign is put  
        # by checking if the number  
        # is even or odd  
        if (i % 2 == 1) : 
            # Add the square with the sign  
            sum += (i * i);  
  
        else : 
            # Add the square with the sign  
            sum -= (i * i);  
      
    return sum;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 2;  
    print(summation(N));  
  
    # This code is contributed by AnkitRai01 

