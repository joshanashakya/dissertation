

//Java program to implement division  
// with large number 
  
class GFG  
{ 
    //A function to perform division of large numbers 
    static String longDivision(String number, int divisor) 
    { 
        // As result can be very large store it in string 
        String ans = ""; 
  
        // Find prefix of number that is  
        // larger than divisor. 
        int idx = 0; 
        char []num = number.toCharArray(); 
        int temp = num[idx] - '0'; 
  
        while (temp < divisor) 
            temp = temp * 10 + (num[++idx] - '0'); 
          
        idx +=1; 
      
        // Repeatedly divide divisor with temp. After  
        // every division, update temp to include one  
        // more digit. 
        while (num.length > idx) 
        { 
            // Store result in answer i.e. temp / divisor 
            ans += (temp / divisor) ; 
          
            // Take next digit of number 
            temp = (temp % divisor) * 10 + num[idx++] - '0'; 
        } 
      
        // If divisor is greater than number 
        if (ans.length() == 0) 
            return "0"; 
      
        // else return ans 
        return ans; 
    } 
  
    //Driver code 
    public static void main(String[] args)  
    { 
        String number = "1248163264128256512"; 
        int divisor = 125;  
        System.out.println(longDivision(number, divisor));  
    } 
} 
// This code is contributed by Ita_c. 

