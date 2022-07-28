n = int(input())  d = {}for c in input():    d.setdefault(c, 0)    d[c] += 1 ans = min(d.get("L", 0), d.get("R", 0)) + min(d.get("U", 0), d.get("D", 0))print(ans * 2)
