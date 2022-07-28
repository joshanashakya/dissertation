

# Python3 program for above approach 
  
# Function to calculate the sum of digits 
def sumOfDigits(n): 
    sum = 0
  
    while (n > 0): 
        sum += n % 10
        n = int(n / 10) 
  
    return sum
  
# Function to count the numbers 
def countDigits(num, limit): 
    left = 1
    right = num 
    result = 0
  
    # use binary search 
    while (left <= right): 
        mid = int((right + left) / 2) 
  
        # Check if you are at a valid number or not 
        if ((mid - sumOfDigits(mid)) >= limit): 
              
            # update the answer at each valid step 
            result = num - mid + 1
            right = mid - 1
          
        else: 
            left = mid + 1
          
    # return the answer 
    return result 
  
# Driver code 
if __name__ == '__main__': 
      
    # Get the value of N and L 
    N = 1546300
    L = 30651
  
    # Count the numbers 
    print(countDigits(N, L)) 
  
# This code is contributed by 
# Surendra_Gangwar 

