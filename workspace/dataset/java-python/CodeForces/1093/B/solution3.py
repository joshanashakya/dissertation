n = int(input())for i in range(n) :  s = input()  if s != s[::-1] :      print(s)  else :    t = s[1:] + s[0]    if s == t :      print("-1")    else :      print(t)
