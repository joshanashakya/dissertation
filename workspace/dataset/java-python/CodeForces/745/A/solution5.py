s = input() n = len(s) res = set() for i in range(n):  res.add(s[i:] + s[:i]) print(len(res))
