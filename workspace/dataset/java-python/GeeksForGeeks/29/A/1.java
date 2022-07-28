

// Java program to calculate Percentile 
// of a student based on rank 
import java.util.*; 
  
class GFG{ 
   
// Program to calculate the percentile 
static float getPercentile(int rank, int students) 
{ 
    // flat variable to store the result 
    float result = (float)(students - rank) 
                   / students * 100; 
   
    // calculate and return the percentile 
    return result; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int your_rank = 805; 
    int total_students = 97481; 
   
    System.out.print(getPercentile( 
        your_rank, total_students)); 
} 
} 
  
// This code is contributed by Princi Singh 

