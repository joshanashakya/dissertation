def isVowel(ch):    if ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u':        return True    return False  s = input()ans = "YES"for i in range(len(s)):    if (not isVowel(s[i]) and s[i] != 'n' ) and (i+1 >= len(s) or  (not isVowel(s[i+1]))):        ans = "NO"print(ans)
