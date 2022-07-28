

# Python3 program to find Sum of alternating  
# sign Squares of first N natural numbers  
  
# Fucntion to calculate  
# the alternating sign sum  
def summation(n) :  
  
    # Variable to store the absolute sum  
    abs_sum = n * (n + 1) // 2;  
  
    # Variable to store the sign  
    sign = 1 if ((n + 1) % 2 == 0 ) else -1;  
  
    # Variable to store the resultant sum  
    result_sum = sign * abs_sum;  
  
    return result_sum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 2;  
    print(summation(N));  
  
# This code is contributed by AnkitRai01 

