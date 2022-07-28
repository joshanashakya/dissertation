

# Python3 program to calculate Percentile  
# of a student based on rank  
  
# Program to calculate the percentile  
def getPercentile(rank, students) :  
  
    # flat variable to store the result  
    result = (students - rank) / students * 100;  
  
    # calculate and return the percentile  
    return result;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    your_rank = 805;  
    total_students = 97481;  
  
    print(getPercentile(your_rank, total_students));  
  
# This code is contributed by Yash_R 

