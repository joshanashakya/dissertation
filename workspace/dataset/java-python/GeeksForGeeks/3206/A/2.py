

# Python3 program to print all distinct  
# integers that can be formed by K numbers  
# from a given array of N numbers.  
  
# stores all the distinct integers formed  
s = set() 
  
# Function to generate all possible numbers  
def generateNumber(count, a, n, num, k):  
  
    # Base case when K elements are chosen  
    if k == count:  
          
        # insert it in set  
        s.add(num)  
        return
      
    # Choose every element and call the function  
    for i in range(0, n):  
        generateNumber(count + 1, a, n,      
                         num + a[i], k)  
  
# Function to print the distinct integers  
def printDistinctIntegers(k, a, n): 
  
    generateNumber(0, a, n, 0, k)  
    print("The", len(s),  
          "distinct integers are:")  
  
    # prints all the elements in the set  
    for i in sorted(s):  
        print(i, end = " ") 
      
# Driver Code  
if __name__ == "__main__": 
  
    a = [3, 8, 17, 5]  
    n, k = len(a), 2
  
    # Calling Function  
    printDistinctIntegers(k, a, n) 
      
# This code is contributed by Rituraj Jain 

