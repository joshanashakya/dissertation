

# Python program to find union and intersection  
# using sets 
def printUnion(arr1, arr2, n1, n2): 
    hs = set() 
      
    # Inhsert the elements of arr1[] to set hs  
    for i in range(0, n1): 
        hs.add(arr1[i]) 
          
    # Inhsert the elements of arr1[] to set hs  
    for i in range(0, n2): 
        hs.add(arr2[i]) 
    print("Union:") 
    for i in hs: 
        print(i, end=" ") 
    print("\n") 
      
    # Prints intersection of arr1[0..n1-1] and  
    # arr2[0..n2-1]  
def printIntersection(arr1, arr2, n1, n2): 
    hs = set() 
      
    # Insert the elements of arr1[] to set S  
    for i in range(0, n1): 
        hs.add(arr1[i]) 
    print("Intersection:") 
    for i in range(0,n2): 
          
        # If element is present in set then  
        # push it to vector V 
        if arr2[i] in hs: 
            print(arr2[i],end=" ") 
              
# Driver Program  
arr1 = [ 7, 1, 5, 2, 3, 6 ]  
arr2 = [ 3, 8, 6, 20, 7 ]  
n1 = len(arr1) 
n2 = len(arr2) 
printUnion(arr1, arr2, n1, n2)  
printIntersection(arr1, arr2, n1, n2)  
          
# This artice is contributed by Kumar Suman . 

