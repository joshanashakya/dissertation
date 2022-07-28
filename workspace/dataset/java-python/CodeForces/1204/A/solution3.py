import math s = input()if len(s) == 1:  print(0)elif len(s) == 2:  print(1)else:  ans = math.ceil(len(s) / 2)  if s[1:].count('1') == 0 and len(s) % 2 == 1:    ans -= 1  print(ans)
