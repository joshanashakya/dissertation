

//Java implementation to find minimum number of 
//elements to remove to get maximum XOR value 
public class GFG { 
  
    static int nextPowerOf2(int n) 
    { 
     int count = 0; 
  
     // First n in the below condition 
     // is for the case where n is 0 
     if (n!=0 && (n& (n - 1))==0) 
         return n; 
  
     while (n != 0) { 
         n >>= 1; 
         count += 1; 
     } 
  
     return 1 << count; 
    } 
  
    //Function to find minimum number of 
    //elements to be removed. 
    static int removeElement(int n) 
    { 
  
     if (n == 1 || n == 2) 
         return 0; 
  
     int a = nextPowerOf2(n); 
  
     if (n == a || n == a - 1) 
         return 1; 
  
     else if (n == a - 2) 
         return 0; 
  
     else if (n % 2 == 0) 
         return 1; 
  
     else
         return 2; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
         int n = 5; 
  
         // print minimum number of elements 
         // to be removed 
         System.out.println(removeElement(n)); 
    } 
} 

