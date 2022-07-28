

# Python3 implementation of the approach  
  
# Function to get the nth ugly number  
def uglyNumber(n):  
  
    # To store ugly numbers  
    ugly = [None] * n  
    i2 = i3 = i5 = 0 
    next_multiple_of_2 = 2 
    next_multiple_of_3 = 3 
    next_multiple_of_5 = 5 
    next_ugly_no = 1 
  
    ugly[0] = 1
    for i in range(1, n):   
        next_ugly_no = min(next_multiple_of_2,  
                        min(next_multiple_of_3,  
                            next_multiple_of_5))  
        ugly[i] = next_ugly_no  
        if (next_ugly_no == next_multiple_of_2):   
            i2 = i2 + 1
            next_multiple_of_2 = ugly[i2] * 2 
           
        if (next_ugly_no == next_multiple_of_3):   
            i3 = i3 + 1 
            next_multiple_of_3 = ugly[i3] * 3 
           
        if (next_ugly_no == next_multiple_of_5):  
            i5 = i5 + 1 
            next_multiple_of_5 = ugly[i5] * 5 
  
    return next_ugly_no  
   
# Function to return the required count of pairs  
def totalPairs(arr1, arr2, n, m): 
   
    s1 = set()  
    i = 1
  
    # Insert ugly numbers in set  
    # which are less than 1000  
    while True:   
        next_ugly_number = uglyNumber(i)  
        if (next_ugly_number > 1000):  
            break 
        s1.add(next_ugly_number)  
        i += 1
       
    # Set is used to avoid duplicate pairs  
    s2 = set()  
  
    for i in range(0, n):   
  
        # Check if arr1[i] is an ugly number  
        if arr1[i] in s1:   
  
            for j in range(0, m):   
  
                # Check if arr2[i] is an ugly number  
                if arr2[j] in s1:   
                    if (arr1[i] < arr2[j]):  
                        s2.add((arr1[i], arr2[j]))  
                    else: 
                        s2.add((arr2[j], arr1[i]))  
  
    # Return the size of the set s2  
    return len(s2) 
   
# Driver code  
if __name__ == "__main__":  
   
    arr1 = [3, 7, 1]   
    arr2 = [5, 1, 10, 4]   
    n = len(arr1)  
    m = len(arr2)  
  
    print(totalPairs(arr1, arr2, n, m)) 
  
# This code is contributed by Rituraj Jain 

