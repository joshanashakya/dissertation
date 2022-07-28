s = input()  if '1' not in s:    print("no") else:            s = s[s.index('1'):]    print("yes" if s.count('0') >= 6 else "no")
