

//Java for divisibility of number by 999 
  
class Test 
{     
    // Method to check divisibility 
    static boolean isDivisible999(String num) 
    { 
        int n = num.length(); 
        if (n == 0 && num.charAt(0) == '0') 
           return true; 
       
        // Append required 0s at the beginning. 
        if (n % 3 == 1) 
           num = "00" + num; 
        if (n % 3 == 2) 
           num = "0" + num; 
       
        // add digits in group of three in gSum 
        int gSum = 0; 
        for (int i = 0; i<n; i++) 
        { 
            // group saves 3-digit group 
            int group = 0; 
            group += (num.charAt(i++) - '0') * 100; 
            group += (num.charAt(i++) - '0') * 10; 
            group += num.charAt(i) - '0'; 
            gSum += group; 
        } 
       
        // calculate result till 3 digit sum 
        if (gSum > 1000) 
        { 
            num = Integer.toString(gSum); 
            n = num.length(); 
            gSum = isDivisible999(num) ? 1 : 0; 
        } 
        return (gSum == 999); 
    } 
      
    // Driver method 
    public static void main(String args[])  
    { 
        String num = "1998"; 
       
        System.out.println(isDivisible999(num) ? "Divisible" : "Not divisible"); 
    } 
} 

