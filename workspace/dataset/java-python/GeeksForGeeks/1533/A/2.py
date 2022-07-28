

# Python program to create a sorted array 
# using Binary Search 
  
# Function to create a new sorted array 
# using Binary Search 
def createSorted(a: list, n: int): 
  
    # Auxilary Array 
    b = [] 
    for j in range(n): 
  
        # if b is empty any element can be at 
        # first place 
        if len(b) == 0: 
            b.append(a[j]) 
        else: 
  
            # Perform Binary Search to find the correct 
            # position of current element in the 
            # new array 
            start = 0
            end = len(b) - 1
  
            # let the element should be at first index 
            pos = 0
            while start <= end: 
                mid = start + (end - start) // 2
  
                # if a[j] is already present in the new array 
                if b[mid] == a[j]: 
  
                    # add a[j] at mid+1. you can add it at mid 
                    b.insert(max(0, mid + 1), a[j]) 
                    break
  
                # if a[j] is lesser than b[mid] go right side 
                elif b[mid] > a[j]: 
  
                    # means pos should be between start and mid-1 
                    pos = end = mid - 1
                else: 
  
                    # else pos should be between mid+1 and end 
                    pos = start = mid + 1
  
                # if a[j] is the largest push it at last 
                if start > end: 
                    pos = start 
                    b.insert(max(0, pos), a[j]) 
  
                    # here max(0, pos) is used because sometimes 
                    # pos can be negative as smallest duplicates 
                    # can be present in the array 
                    break
  
    # Print the new generated sorted array 
    for i in range(n): 
        print(b[i], end=" ") 
  
# Driver Code 
if __name__ == "__main__": 
  
    a = [2, 5, 4, 9, 8] 
    n = len(a) 
    createSorted(a, n) 
  
# This code is contributed by 
# sanjeev2552 

