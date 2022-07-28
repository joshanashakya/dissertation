

//Java program to check if the 
//number lies in given range 
  
public class GFG { 
  
    //Function that returns the maximum element. 
    static boolean check(int a[], int n) 
    { 
  
     // check for odd 
     if (n % 2 == 1) 
         return false; 
  
     // check if the opposite element is same 
     // as a[i] 
     for (int i = 0; i < n / 2; i++) { 
         if (a[i] != a[i + (n / 2)]) 
             return false; 
     } 
  
     return true; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
        int a[] = { 1, 4, 1, 4 }; 
  
         int n = a.length; 
  
         if (check(a, n)) 
             System.out.println("YES"); 
         else
             System.out.println("NO"); 
    } 
} 

