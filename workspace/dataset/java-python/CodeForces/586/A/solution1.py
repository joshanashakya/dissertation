n = int(input())s = input() s = s.lstrip("0 ")s = s.rstrip(" 0")s = s[::2]  while '00' in s:    x = s.replace('00' , '*')    while x!=s:        s = x        x = s.replace('*0' , '*')     print(len(s) - s.count('*'))   # print(s)
