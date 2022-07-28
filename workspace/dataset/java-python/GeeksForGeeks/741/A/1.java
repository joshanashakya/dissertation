

// Java program to perform Queries 
// to add, remove and return  
// the difference of maximum and  
// minimum using TreeSet.  
import java.util.*; 
class GFG 
{ 
static SortedSet<Integer> t = new TreeSet<Integer>(); 
  
// function to perform query 1  
static void performQueryOne(int num)  
{  
    // insert the element  
    t.add(num);  
}  
  
// function to perform query 2  
static void performQueryTwo(int num)  
{  
    // erase the element  
    t.remove(num);  
} 
  
// function to perform query 3  
static int performQueryThree()  
{  
    int mini = t.first(); 
    int maxi = t.last();  
  
    return maxi - mini;  
}  
  
// Driver Code 
public static void main(String[] args)  
{ 
    // query type-1  
    int num = 3;  
    performQueryOne(num);  
  
    // query type-1  
    num = 5;  
    performQueryOne(num);  
  
    // query type-1  
    num = 6;  
    performQueryOne(num);  
  
    // query type-2  
    num = 5;  
    performQueryTwo(num);  
  
    // query type-1  
    num = 2;  
    performQueryOne(num);  
  
    // query type-3  
    System.out.println(performQueryThree()); 
} 
} 
  
// This code is contributed by debjitdbb 

