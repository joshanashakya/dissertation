

// Java program to find n-th number with  
// prime digits 2, 3 and 7  
import java.util.*; 
class GFG{ 
static String nthprimedigitsnumber(int number)  
{  
    int rem;  
    String num="";  
    while (number>0) {  
        // remainder for check element position  
        rem = number % 4;  
        switch (rem) {  
  
        // if number is 1st position in tree  
        case 1:  
            num+='2';  
            break;  
  
        // if number is 2nd position in tree  
        case 2:  
            num+='3';  
            break;  
  
        // if number is 3rd position in tree  
        case 3:  
            num+='5';  
            break;  
  
        // if number is 4th position in tree  
        case 0:  
            num+='7';  
            break;  
        }  
  
       if (number % 4 == 0) 
           number--; 
  
        number = number / 4;  
    }  
      
    return new StringBuilder(num).reverse().toString();  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int number = 21;  
    System.out.println(nthprimedigitsnumber(10));  
    System.out.println(nthprimedigitsnumber(21));  
}  
} 
// This code is contributed by mits 

