

# Python3 implementation of the approach 
MAX = 100001
ROW = 10
COL = 3
  
indices = [0] * MAX
  
# All possible solutions of the 
# equation 1/a + 1/b + 1/c = 1 
test = [[2, 3, 6], [2, 4, 4],  
        [2, 6, 3], [3, 2, 6],  
        [3, 3, 3], [3, 6, 2], 
        [4, 2, 4], [4, 4, 2],  
        [6, 2, 3], [6, 3, 2]] 
  
# Function to find the triplets 
def find_triplet(array, n): 
    answer = 0
  
    for i in range(MAX): 
        indices[i] = [] 
  
    # Storing indices of the elements 
    for i in range(n): 
        indices[array[i]].append(i) 
  
    for i in range(n): 
        y = array[i] 
  
        for j in range(ROW): 
            s = test[j][1] * y 
  
            # Check if y can act as the middle 
            # element of triplet with the given 
            # solution of 1/a + 1/b + 1/c = 1 
            if s % test[j][0] != 0: 
                continue
            if s % test[j][2] != 0: 
                continue
  
            x = s // test[j][0] 
            z = s // test[j][2] 
            if x > MAX or z > MAX: 
                continue
  
            l = 0
            r = len(indices[x]) - 1
            first = -1
  
            # Binary search to find the number of 
            # possible values of the first element 
            while l <= r: 
                m = (l + r) // 2
  
                if indices[x][m] < i: 
                    first = m 
                    l = m + 1
                else: 
                    r = m - 1
  
            l = 0
            r = len(indices[z]) - 1
            third = -1
  
            # Binary search to find the number of 
            # possible values of the third element 
            while l <= r: 
                m = (l + r) // 2
  
                if indices[z][m] > i: 
                    third = m 
                    r = m - 1
                else: 
                    l = m + 1
  
            if first != -1 and third != -1: 
  
                # Contribution to the answer would 
                # be the multiplication of the possible 
                # values for the first and the third element 
                answer += (first + 1) * (len(indices[z]) - third) 
    return answer 
  
# Driver Code 
if __name__ == "__main__": 
    array = [2, 4, 5, 6, 7] 
    n = len(array) 
  
    print(find_triplet(array, n)) 
  
# This code is contributed by 
# sanjeev2552 

