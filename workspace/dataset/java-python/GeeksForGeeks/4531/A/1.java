

// Java program to compare two integers witout 
// any comparison operator. 
import java.util.*; 
  
class solution 
{ 
  
// function return true if A ^ B > 0 else false  
static boolean EqualNumber(int A, int B) 
{ 
      
  if ((A^B) != 0) 
   return true; 
  else
   return false; 
} 
  
// Driver program  
public static void main(String args[]) 
{ 
int A = 5 , B = 6;  
if(EqualNumber(A, B) == false)  
 System.out.println(1); 
else
 System.out.println(0); 
  
}  
} 
// This code is contributed by  
// Surendra_Gangwar 

