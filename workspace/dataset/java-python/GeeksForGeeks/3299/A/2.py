

# Python3 implementation of the approach  
  
# Function to return the  
# sum of digits of n  
def sum(n) : 
  
    sum = 0;  
    while (n) :  
  
        # Add the last digit to the sum  
        sum = sum + n % 10;  
  
        # Remove last digit  
        n = n // 10;  
  
    # Return the sum of digits  
    return sum;  
  
# Function to print the first n numbers  
# whose sum of digits is 10  
def firstN(n) :  
  
    # First number of the series is 19  
    num = 19; cnt = 1;  
      
    while (cnt != n) : 
  
        # If the sum of digits of the  
        # current number is equal to 10  
        if (sum(num) == 10) :  
  
            # Print the number  
            print(num,end= " ");  
            cnt += 1;  
  
        # Add 9 to the previous number  
        num += 9;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 10;  
    firstN(n);  
      
# This code is contributed by AnkitRai01 

