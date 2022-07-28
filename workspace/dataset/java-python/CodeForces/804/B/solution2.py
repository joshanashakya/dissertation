s = input()a = 0m = 10 ** 9 + 7t = 0for i in range(len(s)):    if s[~i] == 'a':        a = (a + t) % m        t = (t * 2) % m    else:        t += 1print(a) 
