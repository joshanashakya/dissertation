

# Python 3 implementation of above approach 
  
# Function to find the largest 
# integer with the given set 
def findLargest(n, v): 
    flag = 0
    sum = 0
      
    # find sum of all the digits 
    # look if any 0 is present or not 
    for i in range(n): 
        if (v[i] == 0): 
            flag = 1
        sum += v[i] 
  
    # if 0 is not present, the resultant number 
    # won't be divisible by 5 
    if (flag == 0): 
        print("Not possible") 
  
    else: 
          
        # sort all the elements in a  
        # non-decreasing manner 
        v.sort(reverse = True) 
  
        # if there is just one element 0 
        if (v[0] == 0): 
            print("0") 
            return 0
          
        else: 
            flag = 0
  
            # find the remainder of the sum 
            # of digits when divided by 3 
            y = sum % 3
  
            # there can a remainder as 1 or 2 
            if (y != 0): 
                  
                # traverse from the end of the digits 
                i = n - 1
                while(i >= 0): 
                      
                    # first element which has the same  
                    # remainder, remove it 
                    if (v[i] % 3 == y): 
                        v.remove(v[i]) 
                        flag = 1
                        break
                    i -= 1
                  
                # if there is no element which 
                # has a same remainder as y 
                if (flag == 0): 
                      
                    # subtract it by 3 ( could be one or two) 
                    y = 3 - y 
  
                    cnt = 0
                    i = n - 1
                    while(i >= 0): 
                          
                        # delete two minimal digits 
                        # which has a remainder as y 
                        if (v[i] % 3 == y): 
                            v.remove(v[i]) 
                            cnt += 1
  
                            if (cnt >= 2): 
                                break
                          
                        i -= 1
                  
            if (v[0] == 0): 
                print("0") 
  
            # print all the digits as a single integer 
            else: 
                for i in (v): 
                    print(i, end = "") 
          
# Driver code 
if __name__ == '__main__': 
      
    # initialize the number of set of digits 
    n = 11
  
    # initialize all the set of  
    # digits in a vector 
    v = [3, 9, 9, 6, 4, 3, 
            6, 4, 9, 6, 0] 
  
    findLargest(n, v) 
      
# This code is contributed by 
# Surendra_Gangwar 

