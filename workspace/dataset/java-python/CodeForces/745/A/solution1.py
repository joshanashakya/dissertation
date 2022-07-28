s = input()ans = set()ans.add(s)c = s[1:] + s[0]while c!=s:    ans.add(c)    c = c[1:] + c[0]  print(len(ans)) 
