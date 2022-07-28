

# Python3 implementation of the above approach 
  
# Function to find previous number 
def findPrevious(number, n): 
  
    # This is necessary as strings 
    # do not support item assignment 
    number = list(number) 
  
    i, j = -1, -1
  
    # I) Start from the right most digit 
    # and find the first digit that is 
    # smaller than the digit next to it. 
    for i in range(n - 1, 0, -1): 
        if number[i] < number[i - 1]: 
            break
      
    # If no such digit is found 
    # then all digits are in ascending order 
    # means there cannot be a smallest number 
    # with same set of digits 
    if i == 0: 
        print("Previous number is not possible") 
        return
      
    x, greatest = number[i - 1], i 
  
    # II) Find the greatest digit on 
    # right side of(i-1)'th digit that is 
    # smaller than number[i-1] 
    for j in range(i, n): 
        if (number[j] < x and
            number[j] > number[greatest]): 
            greatest = j 
      
    # III) Swap the above found smallest digit 
    # with number[i-1] 
    (number[greatest],  
     number[i - 1]) = (number[i - 1],  
                       number[greatest]) 
  
    l = number[i:] 
    del number[i:] 
  
    # IV) Sort the digits after(i-1) 
    # in descending order 
    l.sort(reverse = True) 
  
    number += l 
  
    # Again join the list to make it string 
    number = '' . join(number) 
    print("Greatest smaller number with", 
          "same set of digits is", number) 
  
    return
  
# Driver Code 
if __name__ == "__main__": 
    digits = "262345"
    n = len(digits) 
  
    findPrevious(digits, n) 
  
# This code is contributed by sanjeev2552 

