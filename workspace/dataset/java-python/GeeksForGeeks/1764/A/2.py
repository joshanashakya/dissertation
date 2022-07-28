

# Python3 program to find union and intersection  
# using similar Hashing Technique  
# without using any predefined Java Collections 
# Time Complexity best case & avg case = O(m+n) 
# Worst case = O(nlogn) 
  
  
# Prints intersection of arr1[0..n1-1] and 
# arr2[0..n2-1] 
def findPosition(a, b): 
    v = len(a) + len(b); 
    ans = [0]*v; 
    zero1 = zero2 = 0; 
    print("Intersection :",end=" "); 
      
    # Iterate first array 
    for i in range(len(a)): 
        zero1 = iterateArray(a, v, ans, i); 
      
    # Iterate second array 
    for j in range(len(b)): 
        zero2 = iterateArray(b, v, ans, j); 
      
    zero = zero1 + zero2; 
    placeZeros(v, ans, zero); 
    printUnion(v, ans, zero); 
      
# Prints union of arr1[0..n1-1] and arr2[0..n2-1] 
def printUnion(v, ans,zero): 
    zero1 = 0; 
    print("\nUnion :",end=" "); 
    for i in range(v): 
        if ((zero == 0 and ans[i] == 0) or
            (ans[i] == 0 and zero1 > 0)): 
            continue; 
        if (ans[i] == 0): 
            zero1+=1; 
        print(ans[i],end=","); 
  
def placeZeros(v, ans, zero): 
    if (zero == 2): 
        print("0"); 
        d = [0]; 
        placeValue(d, ans, 0, 0, v); 
    if (zero == 1): 
        d=[0]; 
        placeValue(d, ans, 0, 0, v); 
  
# Function to itreate array 
def iterateArray(a,v,ans,i): 
    if (a[i] != 0): 
        p = a[i] % v; 
        placeValue(a, ans, i, p, v); 
    else: 
        return 1; 
      
    return 0; 
  
def placeValue(a,ans,i,p,v): 
    p = p % v; 
    if (ans[p] == 0): 
        ans[p] = a[i]; 
    else: 
        if (ans[p] == a[i]): 
            print(a[i],end=","); 
        else: 
            # Hashing collision happened increment  
            # position and do recursive call 
            p = p + 1; 
            placeValue(a, ans, i, p, v); 
  
# Driver code 
a = [ 7, 1, 5, 2, 3, 6 ]; 
b = [ 3, 8, 6, 20, 7 ]; 
findPosition(a, b); 
  
# This code is contributed by mits 

