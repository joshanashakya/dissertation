

// Java Program to print Step Pattern 
import java.util.*; 
  
class solution 
{ 
  
// function to print the steps 
static void steps(String str, int n) 
{ 
    // declare a flag 
    boolean flag = false; 
    int x = 0; 
  
    // traverse through all the characters in the string 
    for (int i = 0; i < str.length(); i++) { 
  
        // if the x value is 0.. then 
        // we must increment till n ... 
        // set flag to true 
        if (x == 0) 
            flag = true; 
  
        // if the x value is n-1 then 
        // we must decrement till 0 ... 
        // set flag as false 
        if (x == n - 1) 
            flag = false; 
  
        // print x *s 
        for (int j = 0; j < x; j++) 
            System.out.print("*"); 
  
        System.out.print(str.charAt(i)+"\n"); 
  
        // checking whether to 
        // increment or decrement x 
        if (flag == true) 
            x++; 
        else
            x--; 
    } 
} 
  
public static void main(String args[]) 
{ 
  
    // Get the String and the number n 
    int n = 4; 
    String str = "GeeksForGeeks"; 
  
    System.out.println("String: "+str); 
    System.out.println("Max Length of Steps: "+n); 
  
    // calling the function 
    steps(str, n); 
  
}  
} 
  
// This code is contributed by 
// Shashank_Sharma 

