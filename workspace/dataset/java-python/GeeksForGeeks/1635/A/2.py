

# Python program to sort 
# a string in descending 
# order using library function 
  
def descOrder(s): 
    s.sort(reverse = True) 
    str1 = ''.join(s) 
    print(str1) 
  
def main(): 
    s = list('geeksforgeeks') 
      
    # function call 
    descOrder(s) 
  
if __name__=="__main__": 
    main() 
  
# This code is contributed by 
# prabhat kumar singh 

