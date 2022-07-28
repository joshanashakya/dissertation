

# python 3 program to find a number less than 
# n such that all its digits are distinct 
  
# Function to find a number less than 
# n such that all its digits are distinct 
def findNumber(n): 
    # looping through numbers less than n 
    i = n-1
    while(i>=0): 
        # initializing a hash array 
        count = [0 for i in range(10)]  
  
        x = i 
        # creating a copy of i 
  
        # initializing variables to compare lengths of digits 
        count1 = 0
        count2 = 0
  
        # counting frequency of the digits 
        while (x): 
          
            count[x%10] += 1
            x = int(x / 10) 
            count1 += 1
          
        # checking if each digit is present once 
        for j in range(0,10,1): 
            if (count[j] == 1): 
                count2 += 1
                  
        if (count1 == count2): 
            return i 
        i -= 1
      
# Driver code 
if __name__ == '__main__': 
  
    n = 8490
    print(findNumber(n)) 
  
# This code is implemented by 
# Surendra_Gangwar  

