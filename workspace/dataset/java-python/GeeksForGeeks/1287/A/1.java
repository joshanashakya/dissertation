

// Java program to find the longest substring  
// with k distinct vowels.  
  
class GFG { 
  
    static int MAX = 128; 
  
    // Function to check whether a character is  
    // vowel or not  
    static boolean isVowel(char x) { 
        return (x == 'a' || x == 'e' || x == 'i' || 
                x == 'o' || x == 'u' || x == 'A' || 
                x == 'E' || x == 'I' || x == 'O' || 
                x == 'U'); 
    } 
  
    static int KDistinctVowel(String s, int k) { 
        // length of string  
        int n = s.length(); 
  
        // array for count of characters  
        int[] c = new int[MAX]; 
        //Array.Clear(c, 0, c.Length);  
  
        // Initialize result to be  
        // negative  
        int result = -1; 
  
        for (int i = 0, j = -1; i < n; ++i) { 
  
            char x = s.charAt(i); 
  
            // If letter is vowel then we  
            // increment its count value  
            // and decrease the k value so  
            // that if we again encounter the  
            // same vowel character then we  
            // don't consider it for our result  
            if (isVowel(x)) { 
                if (++c[x] == 1) { 
  
                    // Decrementing the K value  
                    --k; 
                } 
            } 
  
            // Till k is 0 above if condition run  
            // after that this while loop condition  
            // also become active. Here what we have  
            // done actually is that, if K is less  
            // than 0 then we eliminate the first  
            // vowel we have encountered till that  
            // time . Now K is incremented and k  
            // becomes 0. So, now we calculate the  
            // length of substring from the present  
            // index to the deleted index of vowel  
            // which result in our results.  
            while (k < 0) { 
  
                x = s.charAt(++j); 
                if (isVowel(x)) { 
  
                    // decresing the count  
                    // so that it may appear  
                    // in another substring  
                    // appearing after this  
                    // present substring  
                    if (--c[x] == 0) { 
  
                        // incrementing the K value  
                        ++k; 
                    } 
                } 
            } 
  
            // Checking the maximum value  
            // of the result by comparing  
            // the length of substring  
            // whenever K value is 0 means  
            // K distinct vowel is present  
            // in substring  
            if (k == 0) { 
                result = Math.max(result, i - j); 
            } 
        } 
        return result; 
    } 
  
    // Driver code  
    public static void main(String[] args) { 
        String s = "tHeracEBetwEEntheTwo"; 
        int k = 1; 
        System.out.println(KDistinctVowel(s, k)); 
    } 
} 
  
/* This Java code is contributed by Rajput-Ji*/

