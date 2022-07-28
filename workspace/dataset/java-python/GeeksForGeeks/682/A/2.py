

# Python 3 program to check if array has an 
# element whose value is half of array 
# sum. 
  
# Function to check if answer exists 
def checkForElement(array, n): 
    # Sum of all array elements 
    # and storing in a hash table 
    s = set() 
    sum = 0
    for i in range(n): 
        sum += array[i]  
        s.add(array[i]) 
  
    # If sum/2 is present in hash table 
    f = int(sum / 2) 
    if (sum % 2 == 0 and  f in s): 
        return True
    else: 
        return False
  
# Driver code 
if __name__ == '__main__': 
    array = [1, 2, 3] 
    n = len(array) 
    if (checkForElement(array, n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

