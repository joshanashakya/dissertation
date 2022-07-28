

// Java program to find 9's complement of a 
// number. 
  
class GFG{ 
static void complement(String number1) 
{  
    char[] number=number1.toCharArray(); 
    for (int i=0 ; i < number.length ; i++ ) 
        if (number[i] != '.') 
            number[i] = (char)((int)('9') - (int)(number[i]) + (int)('0')); 
    System.out.println( "9's complement is : "+String.valueOf(number)); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String number = "345.45"; 
    complement(number); 
} 
} 
//This code is contributed by mits 

