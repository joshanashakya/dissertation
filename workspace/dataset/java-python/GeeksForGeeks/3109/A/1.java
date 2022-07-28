

import java.util.Arrays; 
//Java program to find minimum sum of two numbers 
//formed from all digits in a given array. 
public class AQRQ { 
  
    //Returns sum of two numbers formed 
    //from all digits in a[] 
    static int minSum(int a[], int n){ 
        
     // sort the elements 
     Arrays.sort(a); 
        
     int num1 = 0; 
     int num2 = 0; 
     for(int i = 0;i<n;i++){ 
         if(i%2==0) 
             num1 = num1*10+a[i]; 
         else num2 = num2*10+a[i]; 
     } 
     return num2+num1; 
    } 
  
    //Driver code 
    public static void main(String[] args) { 
          
  
         int arr[] = {5, 3, 0, 7, 4};  
         int n = arr.length; 
         System.out.println("The required sum is  " + minSum(arr, n)); 
  
    } 
  
} 

