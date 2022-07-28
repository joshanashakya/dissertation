

# Python 3 implementation of the approach 
  
# Function to find the last two 
# digits of the number and 
# print the complete number 
def findPhoneNumber(n): 
    temp = n 
    sum = 0
  
    # Sum of the first eight 
    # digits of the number 
    while (temp != 0): 
        sum += temp % 10
        temp = temp // 10
  
    # if sum < 10, then the two digits 
    # are '0' and the value of sum 
    if (sum < 10): 
        print(n,"0",sum) 
  
    # if sum > 10, then the two digits 
    # are the value of sum 
    else: 
        n = str(n) 
        sum = str(sum) 
        n += sum
        print(n) 
  
# Driver code 
if __name__ == '__main__': 
    n = 98765432
  
    findPhoneNumber(n) 
  
# This code is contributed by Surendra_Gangwar 

