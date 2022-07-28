

# Python3 program to print the elements in  
# descending along with their frequencies  
  
# Function to print the elements in  
# descending along with their frequencies  
def printElements(a, n) : 
  
    # Sorts the element in decreasing order  
    a.sort(reverse = True)  
    cnt = 1
  
    # traverse the array elements  
    for i in range(n - 1) : 
  
        # Prints the number and count  
        if (a[i] != a[i + 1]) :  
            print(a[i], " occurs ", cnt, "times")  
            cnt = 1
          
        else : 
            cnt += 1
      
    # Prints the last step  
    print(a[n - 1], "occurs", cnt, "times")  
  
# Driver Code  
if __name__ == "__main__" : 
  
    a = [ 1, 1, 1, 2,  
          3, 4, 9, 9, 10 ]  
    n = len(a) 
  
    printElements(a, n) 
      
# This code is contributed by Ryuga 

