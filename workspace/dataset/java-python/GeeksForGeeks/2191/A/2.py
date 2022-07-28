

# Python3 program to count total number of  
# pairs having elements with same sum of digits  
  
# Function for returning  
# sum of digits of a number  
def digitSum(n):  
   
    Sum = 0 
    while n > 0:   
        Sum += n % 10 
        n = n // 10 
       
    return Sum 
  
# Function to return the total pairs  
# of elements with equal sum of digits  
def totalPairs(arr1, arr2, n, m):  
  
    # set is used to avoid duplicate pairs  
    s = set()  
  
    for i in range(0, n):   
        for j in range(0, m):   
  
            # check sum of digits  
            # of both the elements  
            if digitSum(arr1[i]) == digitSum(arr2[j]):   
  
                if arr1[i] < arr2[j]:  
                    s.add((arr1[i], arr2[j]))  
                else: 
                    s.add((arr2[j], arr1[i]))  
               
    # return size of the set  
    return len(s)  
  
# Driver code  
if __name__ == "__main__": 
   
    arr1 = [100, 3, 7, 50]   
    arr2 = [5, 1, 10, 4]  
    n = len(arr1)  
    m = len(arr2)  
  
    print(totalPairs(arr1, arr2, n, m))  
      
# This code is contributed by Rituraj Jain 

