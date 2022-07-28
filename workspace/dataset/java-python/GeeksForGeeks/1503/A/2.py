

# Python3 implementation of the approach  
  
# Function to return the frequency array  
# for the given string  
def getFrequencies(string) : 
        freq = [0] * 26
  
        for i in range(len(string)) : 
                freq[ord(string[i]) - 
                     ord('a')] += 1
  
        return freq 
  
# Function to return the required count  
def countMinParts(string) : 
        n = len(string) 
        freq = getFrequencies(string) 
        oddFreq = [] 
        evenFreq = [] 
  
        sumEven = 0
  
        for i in range(26) : 
  
                if freq[i] == 0 : 
                    continue
  
                # Add frequencies of the even  
                # appearing characters  
                if freq[i] % 2 == 0 : 
                        evenFreq.append(freq[i]) 
  
                # Count of the characters that  
                # appeared odd number of times 
                else : 
                        oddFreq.append(freq[i]) 
  
        for i in range(len(evenFreq)) : 
                sumEven += evenFreq[i] 
  
        # If there are no characters with 
        # odd frequency  
        if len(oddFreq) == 0 : 
                return 1
  
        # If there are no characters with  
        # even frequency 
        if sumEven == 0 : 
  
                # Only a single character with 
                # odd frequency 
                if len(oddFreq) == 1: 
                        return 1
  
                # More than 1 character with odd  
                # frequency string isn't a palindrome  
                return 0
  
        i = 0
  
        # All odd appearing characters can also  
        # contribute to the even length palindrome  
        # if one character is removed from the  
        # frequency leaving it as even 
        while(i < len(oddFreq)) : 
                  
                # If k palindromes are possible where  
                # k is the number of characters with  
                # odd frequency  
                if ((sumEven / 2) % len(oddFreq) == 0) : 
                        return len(oddFreq) 
  
                # Current character can no longer be  
                # an element in a string other than 
                # the mid character  
                if (oddFreq[i] == 1) : 
                        i += 1
                        continue
  
                # If current character has odd frequency > 1  
                # take two characters which can be used in  
                # any of the parts  
                sumEven += 2
  
                # Update the frequency 
                oddFreq[i] = oddFreq[i] - 2
  
        # If not possible, then every character of the  
        # string will act as a separate palindrome  
        return n 
  
# Driver code 
if __name__ == "__main__" : 
  
    s = "noonpeep"
  
    print(countMinParts(s)) 
  
# This code is contributed by Ryuga 

