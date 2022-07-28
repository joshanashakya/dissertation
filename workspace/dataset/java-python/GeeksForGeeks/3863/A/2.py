

# Python3 program to find largest and   
# smallest characters in a string 
  
# Function that return the largest alphabet 
def largest_alphabet(a, n) : 
      
    # Initializing max alphabet to 'a' 
    max = 'A'
  
    # Find largest alphabet 
    for i in range(n) :  
        if (a[i] > max): 
            max = a[i] 
  
    # Returning largest element 
    return max
  
# Function that return the smallest alphabet 
def smallest_alphabet(a, n) : 
      
    # Initializing smallest alphabet to 'z' 
    min = 'z'; 
  
    # Find smallest alphabet 
    for i in range (n - 1) :  
        if (a[i] < min): 
            min = a[i]  
  
    # Returning smallest alphabet 
    return min
      
# Driver code 
if __name__ == '__main__' : 
      
    # Character array 
    a = "GeEksforGeeks"
      
    # Calculating size of the string 
    size = len(a) 
      
    # Calling functions and print returned value 
    print( "Largest and smallest alphabet is : ", end = "") 
      
    print(largest_alphabet(a, size), end = " and ") 
    print(smallest_alphabet(a, size)) 
          
  
# This code is contributed by 'rishabh_jain' 

